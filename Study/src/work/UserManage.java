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
				System.out.println("0:����, 1:���, 2:��ȸ, 3:�˻�");
				System.out.print("�۾����� : ");
				int answer = sc.nextInt();
				
				if (answer == 0) {
					// ����
					break;
				}else if(answer == 1) {
					// ���
					System.out.println("���̵�, �̸�, �޴���, ���� ������� ������ �Է�(����� ����)");
					System.out.println("�Է� : ");
					String uid = sc.next(); 
					String name = sc.next(); 
					String hp = sc.next();
					int age = sc.nextInt();
					
					String sql = "INSERT INTO `User1` VALUES('"+uid+"', '"+name+"', '"+hp+"', "+age+");";
					int result = stmt.executeUpdate(sql);
					
					System.out.println(result+"���� �����Ͱ� ��ϵǾ����ϴ�.");
					
					
				}else if(answer == 2) {
					// ��ȸ
					String sql = "SELECT * FROM `User`;";
					ResultSet rs1 = stmt.executeQuery(sql);
					
					System.out.println("--------- ������ ��ȸ ---------");
					while(rs1.next()) {
						String uid = rs1.getString(1);
						String name = rs1.getString(2);
						String hp = rs1.getString(3);
						String age = rs1.getString(4);
						System.out.printf("|%s|%s|%s|%d|\\n", uid, name, hp, age);
					}
					System.out.println("----------------------------");
				
				}else if(answer == 3) {
					// �˻�
					System.out.println("�̸��˻� : ");
					String search = sc.next();
					String sql = "SELECT * FROM `User` WHERE `name`='"+search+"';";
					ResultSet rs2 = stmt.executeQuery(sql);
					
					int count = 0;
					
					System.out.println("-------- ������ �˻���� --------");
					while(rs2.next()) {
						String uid = rs2.getString(1);
						String name = rs2.getString(2);
						String hp = rs2.getString(3);
						String age = rs2.getString(4);
						System.out.printf("|%s|%s|%s|%d|\\n", uid, name, hp, age);
						count++;
						
						if(count == 0) {
							System.out.println(search+"���� ã�� �� �����ϴ�.");
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
		System.out.println("���α׷� ����...");
	}
}
