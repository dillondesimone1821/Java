import java.util.Scanner;

public class Shop {

    // 3.1 Create main function
    public static void main(String[] args) {
        // 3.2 Creat an array of Product called inventory to store 5 products
        Product[] inventory = new Product[5];
        // 3.3 - 3.7 Assign an index to reference new Product object and it's attributes
        inventory[0] = new Product("Business Ritual Womens Long Sleeve Top", 65.39, "Apparel", 4, 'L', "Blue");
        inventory[1] = new Product("The Art of Computer Programming", 190.54, "Books", 9, "Donald E. Knuth");
        inventory[2] = new Product("Men’s Business Casual Shirt", 57.10, "Apparel", 2, 'M', "Teal");
        inventory[3] = new Product("Organic Turmeric Soap", 11.25, "Bath & Beauty", 1);
        inventory[4] = new Product("Head First Design Pattern", 37.35, "Books", 3, "Eric Freeman");

        // 3.8 Declare local variables
        double totalAmount = 0.0;
        double currentPrice = 0.0;
        int userInput = 0;
        Scanner getUserInput = new Scanner(System.in);

        // 3.9 Run menu option in while loop
        while (true) {
            System.out.println(
                    "Enter the product index (0 to 4) you want to buy. To exit the shopping cart, enter any number other than 0 to 4.");
            // display index number : product name in the menu
            for (int i = 0; i < inventory.length; i++) {
                System.out.println(i + ": " + inventory[i].getName());
            }
            // 3.10 Try / Catch userInput
            try {
                userInput = getUserInput.nextInt();
                if (userInput >= 0 && userInput <= 4) {
                    if (inventory[userInput].buy()) {
                        System.out.println("\nYour purchase was successful\n");
                        currentPrice = +inventory[userInput].getPrice();
                        totalAmount = totalAmount + currentPrice;
                    } else {
                        System.out.println("\nSorry! This product is out of stock.\n");
                    }

                }
                if (userInput > 4) {
                    System.out.println("Thank you for shopping with us! The total amount is " + totalAmount + "\n");
                    break;
                }

            } catch (Exception e) {
                System.out.println("Invalid input, exiting the shopping cart! Your total amount is " + totalAmount);
                break;
            }

        }
        getUserInput.close();

    }

}
