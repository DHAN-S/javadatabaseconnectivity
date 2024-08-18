
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

public class Search {
    Scanner scan = new Scanner(System.in);
    void search(String querry,CreateConnection object)throws Exception {
        System.out.println("enter the s.no whose full details you want :");
        int num = scan.nextInt();
        querry = String.format("select *from demo where S_NO=%d", num);
        ResultSet rs = object.st.executeQuery(querry);
        ResultSetMetaData rr = rs.getMetaData();
        while (rs.next()) {
            for (int i = 1; i <= rr.getColumnCount(); i++)
                System.out.print(rs.getString(i) + " ");
            System.out.println();
        }
    }
}