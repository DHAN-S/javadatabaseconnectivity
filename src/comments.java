import java.sql.Date;
import java.sql.Time;

//    System.out.print(System.currentTimeMillis());
//    Date date=new Date(System.currentTimeMillis());
//    System.out.println(date);
//    String str="2015-03-31";
//    Date dat=Date.valueOf(str); System.out.println(dat);
//    Time t=new Time(System.currentTimeMillis());
//    System.out.println(t);

/* localhost
String url = "jdbc:mysql://localhost:3306/table_dhanush";
String username = "DHANUSH";
String password = "4751";
 */

/* display
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
 */
