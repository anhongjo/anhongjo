package hello;
import java.sql.*;
import java.util.Scanner;

public class InsertDB {
   Connection con;

   public InsertDB(String id, String passwd) {
      try {
         Class.forName("org.gjt.mm.mysql.Driver").newInstance();
         String url = "jdbc:mysql://localhost:3306/mydb";
         con = DriverManager.getConnection(url, id, passwd);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public void insert(String na, String ph, String em, String co) {
      String sql = "insert into friends(name, phone, email, company)"
            + " values ( ?, ?, ?, ?)";

      try {
         PreparedStatement st = con.prepareStatement(sql);
         st.setString(1, na);
         st.setString(2, ph);
         st.setString(3, em);
         st.setString(4, co);
         st.executeUpdate();
         st.close();
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
      Scanner sc = new Scanner(System.in);
      System.out.print("이름:");
      String name = sc.nextLine();
      System.out.print("전화번호:");
      String phone = sc.nextLine();
      System.out.print("이메일:");
      String email = sc.nextLine();
      System.out.print("회사:");
      String company = sc.nextLine();
      InsertDB id = new InsertDB("root", "mysql5");
      id.insert(name, phone, email, company);
      id.close();
   }
}
