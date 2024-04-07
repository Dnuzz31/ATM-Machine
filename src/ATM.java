//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

// Class A represents an ATM with basic operations
class A {
    float balance = 100; // Initial balance
    int PIN = 17785; // Default PIN

    // Method to check the entered PIN
    public void pinChecking() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("ENTER YOUR PIN  :");
        int enteredPIN = sc2.nextInt();
        if (PIN == enteredPIN) {
            System.out.println("welcome to java ATM");
            MENU(); // Calls the menu method if PIN is correct
        } else {
            System.out.println("wrong pin enter your PIN again");
        }
    }

    // Method to display the menu and handle user input
    public void MENU() {
        System.out.println("select any option given below");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Change PIN");
        System.out.println("4. Withdraw Money");
        System.out.println("5. EXIT");

        Scanner sc3 = new Scanner(System.in);
        int option = sc3.nextInt();

        switch (option) {
            case 1:
                CheckAccountBalance();
                break;
            case 2:
                DepositMoney();
                break;
            case 3:
                ChangePIN();
                break;
            case 4:
                WithdrawMoney();
                break;
            case 5:
                EXIT();
                break;
            default:
                System.out.println("invalid option");
                break;
        }
    }

    // Method to display account balance
    public void CheckAccountBalance() {
        System.out.println("available balance :" + balance);

        MENU(); // Shows the menu again after displaying the balance
    }

    // Method to deposit money into the account
    public void DepositMoney() {
        System.out.println("enter amount to be deposited ");
        Scanner sc4 = new Scanner(System.in);
        int depositAmount = sc4.nextInt();
        balance = balance + depositAmount;
        System.out.println("AMOUNT DEPOSITED ");
        System.out.println("YOUR TOTAL AVAILABLE BALANCE :" + balance);
        MENU(); // Shows the menu again after depositing money
    }

    // Method to change the PIN (Not implemented)
    public void ChangePIN() {
        System.out.println("PIN cannot be changed at the moment please try again later ");
        MENU(); // Shows the menu again
    }

    // Method to withdraw money from the account
    public void WithdrawMoney() {
        System.out.println("enter the amount you want to withdraw :$");
        Scanner sc = new Scanner(System.in);
        int withdrawAmount = sc.nextInt();

        if (balance > withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println("remaining balance is    :" + balance);
        } else {
            System.out.println("insufficient balance");
        }
        MENU(); // Shows the menu again after withdrawing money
    }

    // Method to exit the ATM program
    public void EXIT() {
        System.out.println("thank you for choosing us ");
    }
}

// Main class to run the ATM program
public class ATM {
    public static void main(String[] args) {
        A objectOFclassA = new A();
        objectOFclassA.pinChecking(); // Starts the ATM program
    }
}
