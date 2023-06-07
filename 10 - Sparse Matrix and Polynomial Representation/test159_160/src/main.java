// my implementation ; works fine
import java.util.Scanner;

    public class main {
        static int m,n;
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("enter dimensions of matrix : row,column");
            m = sc.nextInt();
            n = sc.nextInt();
            System.out.println();


            create_3column_list obj1 = new create_3column_list(m, n);
            create_3column_list obj2 = new create_3column_list(m, n);

            creat_3column_list(obj1,sc);
            creat_3column_list(obj2,sc);

            obj1.set_total_elements();
            obj2.set_total_elements();

            //just  print the 3 column lists created
            System.out.println( obj1.a);
            System.out.println(obj2.a);

            Operations objAdd =new Operations(m,n);
            objAdd.addition(obj1.a,obj2.a); // add these 2  3-column lists created
            objAdd.set_total_elements();

            System.out.println("after addition "+objAdd.sum); // just print added the list
        }

        static void creat_3column_list(create_3column_list obj, Scanner sc) {
            System.out.println("lets creat a 3-column list");

            for (int i = 1; i <= m; i++) {

                for (int j = 1; j <= n; j++) {
                    obj.set(i, j, sc.nextInt());
                }

                System.out.println();
            }
        }

    }