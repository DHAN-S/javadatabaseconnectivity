import java.sql.*;
import java.util.Scanner;
public class Main {
    static long second = System.currentTimeMillis();
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        CreateConnection connectionobject = new CreateConnection();
        if (connectionobject.connect() == true) {
            System.out.println("connection done!!");
            outer:
            {
                while (true) {
                    Display.choice();
                    int option = scan.nextInt();
                    switch (option) {
                        case 1: {
                            Display displayobject = new Display();
                            displayobject.display(Querry.displayquery, connectionobject);
                            break;
                        }
                        case 2: {
                            Insert insertobject = new Insert();
                            insertobject.insert(Querry.insertquery, connectionobject);
                            break;
                        }
                        case 3: {
                            Search searchobject = new Search();
                            searchobject.search(Querry.findquery, connectionobject);
                            break;
                        }
                        case 4: {
                            TruncateClass truncateobject = new TruncateClass();
                            truncateobject.truncate(Querry.truncatequerry, connectionobject);
                            break;
                        }
                        case 5:
                        {  DropClass dropobject = new DropClass();
                            dropobject.drop(Querry.dropquerry,connectionobject);
                            break;
                        }
                        case 6: {
                            Update updateobject = new Update();
                            updateobject.update(Querry.updatequerry, connectionobject);
                            break;
                        }
                        case 7:{
                            Delete deleteobject=new Delete();
                            deleteobject.delete(Querry.deletequerry,connectionobject);
                            break;
                        }
                        case 8: {
                            System.out.println("If you want modify all these things happen in this connection(Y/N) :");
                            char p= scan.next().charAt(0);
                            if(p=='Y'||p=='y')
                                 connectionobject.con.commit();
                            connectionobject.con.close();
                            break outer;
                        }
                        default:{
                            System.out.print("please enter valid number!!!!");
                            break;
                        }
                    }
                }
            }
            connectionobject.con.close();
            connectionobject.st.close();
        }
    }
}