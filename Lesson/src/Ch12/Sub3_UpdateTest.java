package Ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ��¥ : 2022/01/13
 * �̸� : ������
 * ���� : �ڹ� JDBC Update �ǽ��ϱ� ���� P557
 */
public class Sub3_UpdateTest {

	public static void main(String[] args) {
		
		// DB ����
		final String HOST = "jdbc:mysql://54.180.160.240:3306/lucky4527";
		final String USER = "lucky4527";
		final String PASS = "1234";
		
		try {
			// 1�ܰ� - JDBC ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2�ܰ� - �����ͺ��̽� ����
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// 3�ܰ� - SQL���� ��ü����(Statement)
			Statement stmt = conn.createStatement();
			
			// 4�ܰ� - SQL����
			String sql = "UPDATE `User1` SET `age` = `age`+1 WHERE `uid`='p101';";
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count+"���� �����Ͱ� ���� �Ǿ����ϴ�.");
			
			// 5�ܰ� - ���ó��(SELECT�� ���)
			// 6�ܰ� - �����ͺ��̽� ����
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Update �Ϸ�...");
	}
}