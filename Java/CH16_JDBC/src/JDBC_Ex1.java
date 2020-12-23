import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Ex1 {
	public static void main (String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL ����̹� �ε�
			Connection conn = DriverManager.getConnection("jdbc:Mysql://localhost:3306/sampledb?serverTimezone=UTC", "root","1234"); // JDBC ����
			System.out.println("DB ���� �Ϸ�");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
		}
	}
}