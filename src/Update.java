import java.sql.PreparedStatement;
import java.util.Scanner;
public class Update {
    void update(String querry,CreateConnection object)throws Exception
    {
        PreparedStatement pp=object.con.prepareStatement(querry);
        Scanner scan=new Scanner(System.in);
        System.out.println("enter new name ,old name");
        pp.setString(1,scan.next());
        pp.setString(2,scan.next());
      int row=  pp.executeUpdate();
        System.out.println(row+"  affected");
        pp.close();
    }
}
