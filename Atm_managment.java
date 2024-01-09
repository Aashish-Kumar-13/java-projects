import java.util.Scanner;

public class Atm_managment {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String card1, card2, card3;
        int choice;
         int card;
        System.out.println("Enter Your Card Name ");
        System.out.println("Select a card to use:");
        System.out.println("1. Card 1");
        System.out.println("2. Card 2");
        System.out.println("3. Card 3");
        System.out.print("Enter your choice: ");
        choice = sc1.nextInt();
        switch (choice) {
            case 1:
                System.out.println("visa");
                break;
            case 2:
                System.out.println("rupay");
                break;
            case 3:
                System.out.println("master");
                break;

            default:
                break;
        }

        System.out.println("enter your amount");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int bal = 50000000;
        // int pin = sc.nextInt();
        if (amount > bal) {
            System.out.println("insufficent amount");
        } else if (amount <= bal) {
            System.out.println("enter your pin");
        } else {
            System.out.println(".");
        }
        int pin = sc.nextInt();
        if (pin > 10000) {
            System.out.println("wrong pin");
        } else if (pin < 10000) {
            System.out.println(" please wait cash is widrow");
        } else {
            System.out.println("re-enter your card");
        }
    }
}