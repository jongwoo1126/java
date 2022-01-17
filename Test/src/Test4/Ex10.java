package Test4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

class Orange implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String country;
	private int price;
	
	public Orange(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("원산지 : "+country);
		System.out.println("가   격 : "+price);
	}
}

class ReadObjectTest {
	public static void main(String[] args) {
		try {
			// 현재 프로젝트 폴더 하위에 Orange.txt 객체파일과 스트림 연결
			FileInputStream fis = new FileInputStream("./Orange.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// 스트림을 통한 객체를 복원(역직렬화)
			Orange a1 = (Orange) ois.readObject();
			Orange a2 = (Orange) ois.readObject();
			a1.show();
			a2.show();

			// 스트림 해제
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Orange.text 파일이 존재하지 않습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

public class Ex10 {
	public static void main(String[] args) throws Exception {
		
		Orange Orange1 = new Orange("한국", 3000);
		Orange Orange2 = new Orange("미국", 3000);
		
		FileOutputStream   fos = new FileOutputStream("./Orange.txt");			
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		// 현재 프로젝트 폴더 하위에 Orange.txt 객체파일 생성(직렬화)
		oos.writeObject(Orange1);
		oos.writeObject(Orange2);
		
		// 스트림 해제
		oos.close();
		fos.close();
		
		System.out.println("현재 폴더에 Orange.txt 객체파일 생성 완료!");
	}
}