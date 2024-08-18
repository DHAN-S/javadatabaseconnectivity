import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

class Display {
    static void choice() {
        System.out.println("enter your option:\n1.show all data:\n2.insert data:\n3.search by S.NO\n4.truncate table\n5.exit");
    }
    public void display(String query, CreateConnection object) throws Exception {
        ResultSet rs = object.st.executeQuery(query);
        ResultSetMetaData rr = rs.getMetaData();
        String border = "+--------------------------------------------------+";
        String column = "|  S_N0  |       NAME       |  AGE | DATE_OF_BIRTH |";
        System.out.print(border + "\n" + column + "\n" + border + "\n");
        while (rs.next()) {
            String disp = String.format("| %4s  %20s  %2s  %12s     |", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            System.out.println(disp);
        }
        System.out.println(border);
        rs.close();
    }

}
