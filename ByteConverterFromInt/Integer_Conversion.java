import java.util.Scanner;

public class Integer_Conversion

{

    public static void main(String[] args)

    {

        int a;

        byte b;

        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter any integer:");

        do {
            a = s.nextInt();
            b = (byte) a;
            System.out.println("Conversion into byte:" + b);
            System.out.println("\nEnter another number:");
        } while (s.hasNextInt());
        {
            a = s.nextInt();
            b = (byte) a;
            System.out.println("Conversion into byte:" + b);
            System.out.println("\nEnter another number:");
        }

    }

}