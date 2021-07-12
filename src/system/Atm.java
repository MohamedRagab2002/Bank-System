package system;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Atm {
    private String userName;
    private double Balance;
    private double Money;
    Scanner scanner = new Scanner(System.in);
    public void setCardInformation() {
        System.out.println("please enter your name");
        userName = scanner.nextLine();
        System.out.println("please enter your Balance");
        Balance = Double.parseDouble(scanner.next());

    }
    public void getCardInformation(){
        System.out.println("welcome " + userName);
        System.out.println("your Balance "+ Balance);
    }
    public void depositMoney() {
        System.out.println("How much you want to deposit");
        Money = scanner.nextFloat();
        Balance = Balance + Money;
        printBalance();
    }
    public void checkBalance() {
        System.out.println("you have" + Balance);
    }
    public void withdrawMoney() {
        System.out.println("How much you want to withdraw");
        Money = scanner.nextFloat();
        Balance = Balance - Money;
        printBalance();
    }
    public void printBalance(){
        System.out.println("Your balance now: " + Balance);
    }
}
