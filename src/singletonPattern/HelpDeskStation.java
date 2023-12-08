package singletonPattern;
import java.util.Scanner;

public class HelpDeskStation {
    public static void main(String[] args){

        QueuingSystem queuingSystem = QueuingSystem.getInstance();

        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("[1] Get current queue number");
            System.out.println("[2] Increment queue number");
            System.out.println("[3] Reset queue number");
            System.out.println("[4] Exit");
            System.out.print("\nChoose a option: ");
            Integer choice = input.nextInt();
            input.nextLine();
            System.out.println();

            switch(choice){
                case 1:
                    queuingSystem.getCurrentQueueNum();
                    System.out.println();
                    break;

                case 2:
                    queuingSystem.incrementQueueNum();
                    System.out.println();
                    break;

                case 3:
                    System.out.print("\tEnter new queuing number: ");
                    Integer resetNum = input.nextInt();
                    queuingSystem.resetQueueNum(resetNum);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Exiting the Queueing System. Thank you for using our services!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    System.out.println();
                    break;
            }
        }
    }
}
