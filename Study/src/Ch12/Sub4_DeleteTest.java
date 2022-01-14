package Ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/*
 * 날짜 : 2022/01/13
 * 이름 : 박종우
 * 내용 : 자바 JDBC 삭제 실습
 */

public class Sub4_DeleteTest {

	public static void main(String[] args) {
		
		final String HOST = "jdbc:mysql://54.180.160.240:3306/lucky4527";
		final String USER = "lucky4527";
		final String PASS = "1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// 3단계 - SQL실행 객체생성(Statement)
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL실행
			String sql = "DELETE FROM `User1` WHERE `uid`='p101';";
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count+"개의 데이터가 수정 되었습니다.");
			
			// 5단계 - 결과처리(SELECT일 경우)
			// 6단계 - 데이터베이스 종료
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Delete 완료...");
		
	}
}
