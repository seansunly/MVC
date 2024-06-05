package view;

import controller.UserController;
import model.User;
import model.dto.UserCreate;

import java.util.*;

public class View {
    private static final UserController userController=new UserController();

    public static void UI(){
        System.out.println("this is view");
        userController.findAllUser().stream().forEach(System.out::println);
    }
    public static List<UserCreate> createUsers() {
        System.out.println("Create new users");

        List<UserCreate> userCreates = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


            System.out.print("Enter name  ");
            String name = scanner.nextLine();

            System.out.print("Enter email: ");
            String email = scanner.nextLine();

        Random rand = new Random();

        // Generate a random integer between 1 and 1 million
        int id = rand.nextInt(1000000) + 1;

            UserCreate userCreate = new UserCreate(id, name, email);
            userCreates.add(userCreate);
            userController.createNew(userCreate);
            System.out.println("User created successfully.");
            System.out.println();


        return userCreates;
    }
    public static void delete(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input id :");
       Integer id = scanner.nextInt();
        userController.delete(id);
        System.out.println(id);
    }
}
