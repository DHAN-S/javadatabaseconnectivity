import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 class CreateConnection {
     Dotenv envVariable = Dotenv.load();
     String password =envVariable.get("MYSQL_ADDON_PASSWORD");
     String url= envVariable.get("MYSQL_ADDON_URI");
     Connection con=null;
     Statement st=null;
   public boolean connect(){
    try{
     Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection(url);
    st = con.createStatement();
    con.setAutoCommit(false);
    return true;
     }    catch(Exception e)
    {
        System.out.print(e.getMessage());
        return false;
    }}
}