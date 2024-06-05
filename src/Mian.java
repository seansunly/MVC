import controller.UserController;
import view.View;

import java.util.Scanner;


public class Mian {
    public static void main(String[] args) {


        int options;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("===========================================");
            System.out.println("1. INPUT FOR GET ALL");
            System.out.println("2. INPUT FOR CREATE ALL");
            System.out.println("3. INPUT FOR DELETE ALL");
            System.out.println("4. INPUT FOR GET ALL");
            System.out.println("5. INPUT FOR GET ALL");
            System.out.println("6. EXIT");
            System.out.println("===========================================");
            System.out.print("INPUT OPTION: ");
            options = scanner.nextInt();

            switch (options) {
                case 1:
                    View.UI();
                    break;
                case 2:
                    System.out.println(View.createUsers());
                    break;
                case 3:
                    // Add your code for case 3 here
                    View.delete();
                    break;
                case 4:
                    // Add your code for case 4 here
                    break;
                case 5:
                    // Add your code for case 5 here
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (options != 6);

        scanner.close();
    }
}
