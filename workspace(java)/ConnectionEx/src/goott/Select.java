package goott;

import java.sql.*;

public class Select {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "goott";
		String password = "99229922";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			
			if(con != null) {
				System.out.println("오라클 데이터베이스 연결 성공!!!");
			}
			
			String sql = "SELECT * FROM products";
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			System.out.println("pnum\tcategory_fk\tproducts_name\tcode\tin_p\tout_p\tcost\tmile\tcompany");
			while(rs.next()) {
				int pnum = rs.getInt("pnum");
				String category = rs.getString("category_fk");
				String pname = rs.getString("products_name");
				String epCode = rs.getString("ep_code_fk");
				int inputPrice = rs.getInt("input_price");
				int outputPrice = rs.getInt("output_price");
				int transCost = rs.getInt("trans_cost");
				int mileage = rs.getInt("mileage");
				String company = rs.getString("company");
				
				System.out.println(pnum + "\t" + category + "\t" + pname + "\t" + epCode + "\t" + inputPrice + "\t" + outputPrice + "\t" + transCost + "\t" + 
						mileage + "\t" + company);
			}
			
			rs.close();
			pstmt.close();
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
