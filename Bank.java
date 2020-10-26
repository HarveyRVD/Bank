import java.util.Scanner;

public class Bank {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the account number : ");
        int accountNb = input.nextInt();

        System.out.println("Please enter the initial balance : ");
        int balance = input.nextInt();

        System.out.println("Please enter the account pin : ");
        int pin = input.nextInt(); //must be 1234
        if(pin != 1234) {
            do {
                System.out.println("Error ! Please, enter PIN number again : ");
                pin = input.nextInt();
            }
            while (pin != 1234);
        }

        System.out.println("Amount to be deposited : ");
        double depositedAmount = input.nextDouble();
        double newBalance = balance + depositedAmount;
        System.out.println("Amount deposited. The new balance is : " + newBalance);

        System.out.println("Amount to be withdrawn : ");
        double withdrawnAmount = input.nextDouble();
        if(withdrawnAmount > newBalance){
            do{
                System.out.println("You're not that rich ! Enter a correct amount : ");
                withdrawnAmount = input.nextDouble();
            }
            while(withdrawnAmount > newBalance);
        }
        System.out.println(withdrawnAmount + "$ was withdrawn from the account.");
        newBalance = newBalance - withdrawnAmount;
        System.out.println("The new balance is : " + newBalance);


    }
}
