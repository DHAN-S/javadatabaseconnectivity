
import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 class CreateConnection {
     Dotenv envVariable = Dotenv.load();
    String url ="jdbc:mysql://uqdlrxcgcohqaufg:A3wHVAkC7w43K7mjV0Vv@bey0m7sl1icdq1kj3hoc-mysql.services.clever-cloud.com:3306/bey0m7sl1icdq1kj3hoc";
    String username =envVariable.get("MYSQL_ADDON_USER") ;
    String password =envVariable.get("MYSQL_ADDON_PASSWORD");
     Connection con=null;
     Statement st=null;
   public boolean connect(){
    try{
     Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection(url ,username, password);
    st = con.createStatement();
    return true;
     }    catch(Exception e)
    {
        System.out.print(e.getMessage());
        return false;
    }}
}