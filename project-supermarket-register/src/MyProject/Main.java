package MyProject;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    Scanner myobj = new Scanner(System.in);
    String name;
    ArrayList<String> product = new ArrayList<>();
    ArrayList<Integer> value = new ArrayList<>();
    int action;
    while(true) {
        //show actions that can be performed//
        System.out.println("=== MENU ===");
        System.out.println("1 - Register new product");
        System.out.println("2 - List Products");
        System.out.println("3 - Browse product by name");
        System.out.println("4 - Update Product Quantity");
        System.out.println("5 - Exit");
        System.out.print("Choose an option: ");
        action = myobj.nextInt();
        switch (action){
            case 1:
                System.out.print("\nInform the number of products you want to register: ");
                int quantity = myobj.nextInt();
                myobj.nextLine();

                for (int i = 0; i < quantity; i++) {
                    System.out.print("\nInsert the name of the product: ");
                    name = myobj.nextLine();
                    product.add(name);

                    System.out.print("Insert the value of the product: ");
                    while (!myobj.hasNextInt()) { // check if the input is a number
                        System.out.print("Please enter a valid number for value: ");
                        myobj.next(); // discard invalid input
                    }
                    int val = myobj.nextInt();
                    myobj.nextLine();
                    value.add(val);
                }
                break;

            case 2:
            for (int i =0; i < product.size(); i++){
                System.out.println((i+1) + "° product is " + product.get(i) + " and the value is " + value.get(i));
            }
        break;
        case 3:
            myobj.nextLine();
            System.out.println("\ninsert the name of product of you wanna search:");
            String search = myobj.nextLine();
            boolean exist = false;
            for (int i = 0; i < product.size(); i++){
                if (product.get(i).equalsIgnoreCase(search)){
                    System.out.println("\nin the system have this product");
                    exist = true;
                    break;
                }
            }
            if(!exist){
                System.out.println("\nproduct not found in the system");
            }
            break;
            case 4:
                System.out.println("\nin the system have " + product.size() + " of product in total");
            break;
            case 5:
                System.out.println("\nclosing the system...");
                return;
            default:
                System.out.println("inform a valid option");
        }
    }
    }
}