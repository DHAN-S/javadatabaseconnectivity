import java.util.Random;
import java.util.Scanner;
public class TruncateClass  extends Main{
    Scanner scan=new Scanner(System.in);
    void truncate(String querry,CreateConnection object)throws Exception
    {
        if (System.currentTimeMillis() > super.second) {
            System.out.println("ARE YOU SURE WANT TO TRUNCATE:(Y/N)");
            char choice = scan.next().charAt(0);
            int attempt = 0;
            if (choice == 'Y' || choice == 'y') {
                for (int i = 0; i < 2; i++) {
                    System.out.print("Enter password:");
                    String pas = scan.next();
                    if (pas.equals(object.password)) {
                        System.out.println("password matched");
                        object.st.executeUpdate(querry);
                        break;
                    } else {
                        System.out.println("password mis matched ");
                        attempt++;
                    }
                    if (attempt == 2) {
                        System.out.println("try after few minutes");
                        Random rand=new Random();
                       // int penaltly=rand.nextInt(10000);
                        super.second = System.currentTimeMillis()+100000;
                        break;
                    }
                }
            }
            else if(choice=='n'||choice=='N')
            {
                System.out.println("ok");
            }
        } else {
            System.out.println("please wait for "+ (super.second-System.currentTimeMillis())/1000+"seconds");
        }
    }
}
