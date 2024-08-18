import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 class CreateConnection {
     String url = "jdbc:mysql://localhost:3306/table_dhanush";
     String username = "DHANUSH";
     String password = "4751";
     Connection con=null;
     Statement st=null;
   public boolean connect(){
    try{
     Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection(url, username, password);
    st = con.createStatement();
    return true;
     }
    catch(Exception e)
    {
        System.out.print("connection failure ");
        return false;
    }}
}
