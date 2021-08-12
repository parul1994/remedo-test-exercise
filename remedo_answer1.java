import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class remedo_answer1 {

	public static void main(String[] args) {
		try {
			System.out.println("Welcome to Remedo!");
			String remedoCommission=null;
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://mysql.remedoapp.com:3306/remedo-database","remedo","mypass");  

		try
		{			
			PreparedStatement ps= conn.prepareStatement("SELECT users.user_id, users.address, "
					+ " transactions.total_invoice_amount, transactions.invoice_amount_paid, transactions.remedo_commission "
					+ " FROM users INNER JOIN transactions "
					+ " ON transactions.user_id=users.user_id "
					+ " WHERE users.user_id='u1'");
			ResultSet resultSet=ps.executeQuery();
			while (resultSet.next()){
				System.out.println("User id : "+resultSet.getString("user_id")
				+"\nAddress : "+resultSet.getString("address") 
				+"\nTotal Invoice Amount : "+resultSet.getString("total_invoice_amount") 
				+"\nInvoice Amount Paid : "+resultSet.getString("invoice_amount_paid") 
				+"\nRemedo Commission : "+resultSet.getString("remedo_commission"));
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(SQLException sqlException2){
				sqlException2.printStackTrace();
			}
		}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
