import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 class CreateConnection {
     Environmentclass variable=new Environmentclass();
     String url =variable.MYSQL_ADDON_URI ;
     String username = variable.MYSQL_ADDON_USER;
     String password =variable.MYSQL_ADDON_PASSWORD;
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
        System.out.print(e);
        return false;
    }}
}