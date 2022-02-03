import java.util.*;

class Circle {

    static float PI = 3.14f;

    // This method describes the program
    static void describeApplication() {
        System.out.println("This program will ask for a radius and will calculate");
        System.out.println("the circumference OR the area of a circle with that radius,based on your selection.");
        System.out.println("Then it will repeat..");
    }

    // Method to calculate circumference
    public static float calculateCircumference(float radius) {
        return 2 * PI * radius;
    }

    // Method to calculate area
    public static float calculateArea(float radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        char answer = 'y';
        char option;
        float radius = 0f;
        Scanner input = new Scanner(System.in);

        describeApplication();

        do {
            System.out.println("Enter the radius:");
            radius = input.nextFloat();
            System.out.println("What would you like to calculate? (press a for area, c for circumference):");

            // set user input
            option = input.next().charAt(0);

            // determine output based on input
            if (option == 'a') {
                calculateArea(radius);
                System.out.println(calculateArea(radius));
            } else if (option == 'c') {
                calculateCircumference(radius);
                System.out.println(calculateCircumference(radius));
                answer = input.next().charAt(0);
            } else if (option != 'a' & option != 'c') {
                System.out.println("invalid input");
            }
            // break or continue in loop
            System.out.println("Do you want to continue? (y/n)");
            answer = input.next().charAt(0);
        } while (answer == 'y');
        input.close();
    }
}
