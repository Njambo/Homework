package Homework.Lesson5_Homework;

public class BankAccount {
    int id = 10;
    String name = "Nikita";
    double balance = 100;

    // addingFundsToYourAccount - пополнение счета
// theAmountOfTheDeposit - сумма пополнения
    void addingFundsToYourAccount(double theAmountOfTheDeposit) {
        System.out.println("баланс до пополнения: " + balance);
        System.out.println("баланс пополняется на: " + theAmountOfTheDeposit);
        balance += theAmountOfTheDeposit;
        System.out.println("баланс после пополнения: " + balance);
        System.out.println();
    }
    // withdrawalFromTheAccount - снятие со счета
// withdrawalAmount - сумма снятия
    void withdrawalFromTheAccount(double withdrawalAmount){
        System.out.println("баланс до пополнения: " + balance);
        System.out.println("Баланс уменьшился на: " + withdrawalAmount);
        balance -= withdrawalAmount;
        System.out.println("баланс после снятия: " + balance);
        System.out.println();
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        MyAccount.addingFundsToYourAccount(30.5);
        MyAccount.withdrawalFromTheAccount(20.5);
    }
}