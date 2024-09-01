import java.sql.PreparedStatement;
import java.util.Scanner;
public class Delete {
    public void delete(String query, CreateConnection object)throws Exception
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter id to delete: ");
        int id=scan.nextInt();
        PreparedStatement pp = object.con.prepareStatement(query);
        pp.setInt(1,id);
        int count=pp.executeUpdate();
        if(count>=1)
            System.out.println("successfully deleted "+count);
        else System.out.println("not deleted anything ");
    }
}
