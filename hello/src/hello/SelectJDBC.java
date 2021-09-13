package hello;
import java.sql.*;

public class SelectJDBC {
 Connection con;

 public SelectJDBC(String id, String passwd) {
    try {
       Class.forName("org.gjt.mm.mysql.Driver").newInstance();
       String url = "jdbc:mysql://localhost:3306/mydb";
       con = DriverManager.getConnection(url, id, passwd);
    } catch (Exception e) {
       e.printStackTrace();
    }
 }

 public void getData() {
    String sql = "select name, phone, email, company from friends ";

    try {
       PreparedStatement stmt = con.prepareStatement(sql);
       ResultSet rs = stmt.executeQuery();
       while(rs.next()) {
          String name = rs.getString(1);
          String phone = rs.getString(2);
          String email = rs.getString(3);
          String company = rs.getString(4);

          System.out.println(name + " \t| " + phone + " \t| "
                + email + " \t| " + company);
        }
       rs.close();
       stmt.close();

    } catch(Exception e) {
       e.printStackTrace();
    }
 }

 public void close() {
    try {
       con.close();
    } catch(Exception e) { }
 }

 public static void main(String args[]) {
    SelectJDBC sj = new SelectJDBC("root", "mysql5");
    sj.getData();
    sj.close();
 }
}
