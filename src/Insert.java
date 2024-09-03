import java.sql.PreparedStatement;
import java.util.Date;
import java.util.Scanner;
class Insert {
    Scanner scan = new Scanner(System.in);
    void insert(String query, CreateConnection object) throws Exception {
        System.out.print("name: ");
        String name = scan.next();
        System.out.print("age: ");
        int age=scan.nextInt();
        System.out.print("salary: ");
        int salary=scan.nextInt();
        System.out.print("DOB: ");
        String dateobj=scan.next();
        PreparedStatement pp = object.con.prepareStatement(query);
        pp.setString(1, name);
        pp.setInt(2, age);
        pp.setInt(3, salary);
        pp.setString(4, dateobj);
        pp.executeUpdate();
    }
}
