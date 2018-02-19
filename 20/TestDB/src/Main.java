import java.sql.*;

public class Main {
	public static final String DB_NAME = "testjava.db";
	public static final String CONNECTION_STRING = "jdbc:sqlite:/Volumes/Production/Courses/Programs/JavaPrograms/TestDB/" + DB_NAME;

	public static final String TABLE_CONTACTS = "contacts";

	public static final String COLUMN_NAME = "name";
	public static final String COLUMN_PHONE = "phone";
	public static final String COLUMN_EMAIL = "email";


	public static void main(String[] args) {

		try {
			Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/seth/IdeaProjects/udemy-java-masterclass/20/TestDB/testjava.db");
			conn.setAutoCommit(false);
			Statement statement = conn.createStatement();
			statement.execute("CREATE TABLE IF NOT EXISTS contacts " +
					"(name TEXT, phone INTEGER, email TEXT)");
			statement.execute("INSERT INTO contacts (name, phone, email) " +
							"VALUES('Joe', 45632, 'joe@anywhere.com')");

			insertContact(statement,"Tim", 6545678, "tim@email.com");
			insertContact(statement,"Joe", 45632, "joe@anywhere.com");
			insertContact(statement,"Jane", 4829484, "jane@somewhere.com");
			insertContact(statement,"Fido", 9038, "dog@email.com");

			statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
					COLUMN_PHONE + "=5566789" +
					" WHERE " + COLUMN_NAME + "='Jane'");

			statement.execute("DELETE FROM " +TABLE_CONTACTS +
					" WHERE " + COLUMN_NAME + "='Joe'");


			statement.execute("SELECT * FROM contacts");
			ResultSet results = statement.getResultSet();
			while(results.next()) {
				System.out.println(results.getString("name") + " " +
						results.getInt("phone") + " " +
						results.getString("email"));
			}

			results.close();
			statement.close();
			conn.close();

//            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\databases\\testjava.db");
//            Class.forName("org.sql.JDBC");

		} catch (SQLException e) {
			System.out.println("Something went wrong: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
		statement.execute("INSERT INTO " + TABLE_CONTACTS +
				" (" + COLUMN_NAME + ", " +
				COLUMN_PHONE + ", " +
				COLUMN_EMAIL +
				" ) " +
				"VALUES('" + name + "', " + phone + ", '" + email + "')");
	}
}