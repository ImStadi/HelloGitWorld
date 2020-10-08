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


                System.out.printf("Das ergebniss Lautet: ");
                System.out.println(x + i);
            }
            catch (Exception e)
            {
                System.out.printf("Fehler");
            }


        }
    }

