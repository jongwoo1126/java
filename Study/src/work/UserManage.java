package work;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UserManage {
	public static void main(String[] args) {
		
		final String HOST =  "jdbc:mysql://54.180.160.240:3306/lucky4527";
		final String USER =  "lucky4527";
		final String PASS = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			Statement stmt = conn.createStatement();
		
			while(true) {
				System.out.println("0:종료, 1:등록, 2:조회, 3:검색");
				System.out.print("작업선택 : ");
				int answer = sc.nextInt();
				
				if (answer == 0) {
					// 종료
					break;
				}else if(answer == 1) {
					// 등록
					System.out.println("아이디, 이름, 휴대폰, 나이 순서대로 데이터 입력(띄어쓰기로 구분)");
					System.out.println("입력 : ");
					String uid = sc.next(); 
					String name = sc.next(); 
					String hp = sc.next();
					int age = sc.nextInt();
					
					String sql = "INSERT INTO `User1` VALUES('"+uid+"', '"+name+"', '"+hp+"', "+age+");";
					int result = stmt.executeUpdate(sql);
					
					System.out.println(result+"개의 데이터가 등록되었습니다.");
					
					
				}else if(answer == 2) {
					// 조회
					String sql = "SELECT * FROM `User`;";
					ResultSet rs1 = stmt.executeQuery(sql);
					
					System.out.println("--------- 데이터 조회 ---------");
					while(rs1.next()) {
						String uid = rs1.getString(1);
						String name = rs1.getString(2);
						String hp = rs1.getString(3);
						String age = rs1.getString(4);
						System.out.printf("|%s|%s|%s|%d|\\n", uid, name, hp, age);
					}
					System.out.println("----------------------------");
				
				}else if(answer == 3) {
					// 검색
					System.out.println("이름검색 : ");
					String search = sc.next();
					String sql = "SELECT * FROM `User` WHERE `name`='"+search+"';";
					ResultSet rs2 = stmt.executeQuery(sql);
					
					int count = 0;
					
					System.out.println("-------- 데이터 검색결과 --------");
					while(rs2.next()) {
						String uid = rs2.getString(1);
						String name = rs2.getString(2);
						String hp = rs2.getString(3);
						String age = rs2.getString(4);
						System.out.printf("|%s|%s|%s|%d|\\n", uid, name, hp, age);
						count++;
						
						if(count == 0) {
							System.out.println(search+"님을 찾을 수 없습니다.");
						}
						System.out.println("-----------------------------");	
						
					}
				}
			} // while end
			conn.close();	
			
		}catch(Exception e) {
				e.printStackTrace();
		}
		
		sc.close();
		System.out.println("프로그램 종료...");
	}
}
