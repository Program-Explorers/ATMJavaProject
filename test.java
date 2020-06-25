//hello test push
import java.util.*;
class Main {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        double balance = 10000.00;
        String userChoice = "";

        System.out.print("Type 1 for Withdraw"
        + "\nType 2 for Deposit" + "\nType 3 for Check Balance"
        + "\nChoose 4 for Exit" + "\nChoose the operation you want to perform: ");
        userChoice = keyboard.nextLine();

        if(userChoice.equals("1")){
            System.out.println("How much money(dollars) do you want to withdraw: ");
            userChoice = keyboard.nextLine();
            double userWithdraw = Double.parseDouble(userChoice);
            balance -= userWithdraw;
            System.out.print("You withdrew $" + userWithdraw);
        }

    }
}