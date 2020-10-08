/************************
 * @author Andre Stadler
 * 8.10.2020
 ***********************/

package Main_Package;
import java.util.Scanner;

public class Main
{
        public static void main(String[] args)
        {
            try
            {

                Scanner sc = new Scanner(System.in);

                int i = sc.nextInt();
                int x = sc.nextInt();


                System.out.printf("Die Ergebnisse lauten: ");
                System.out.println("Addition:");
                System.out.println(x + i);
            }
            catch (Exception e)
            {
                System.out.printf("Fehler");
            }




        }
    }

