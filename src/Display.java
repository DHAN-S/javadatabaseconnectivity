import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
class Display {
    static void choice() {
        System.out.println("enter your option\n1.show all data\n2.insert data\n3.search by S.NO\n4.truncate table\n5.update\n6.delete\n7.exit");
    }
    public void display(String query, CreateConnection object) throws Exception {
        ResultSet rs = object.st.executeQuery(query);
        ResultSetMetaData rr = rs.getMetaData();
        String border = "+---------------------------------------------------------------+";
        String column = "|  id  |       NAME       |     AGE    |   SALARY |     DOB     |";
        System.out.print(border + "\n" + column + "\n" + border + "\n");
        while (rs.next()) {
           String disp = String.format("| %4s  %15s   %7s     %10s %12s   " +
                   "|", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
        System.out.println(disp);
        }
        System.out.println(border);
        rs.close();
    }

}
