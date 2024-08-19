import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Scanner;

class Insert {
    Scanner scan = new Scanner(System.in);

    void insert(String query, CreateConnection object) throws Exception {
        System.out.print("name: ");
        String name = scan.next();
        System.out.print("age: ");
        int age = scan.nextInt();
        System.out.print("enter DOB: ");
        String dob = scan.next();
        PreparedStatement pp = object.con.prepareStatement(query);
        pp.setString(1, name);
        pp.setInt(2, age);
        Date date = Date.valueOf(dob);
        pp.setDate(3, date);
        pp.executeUpdate();
    }
}
