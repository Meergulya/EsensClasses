package Object_Topic_Saturday;

public class BankAccount {
String type;
int accountNumber;
double balance;
String holderName;




public void deposit(double add){
    System.out.println( add + " is deposited to your account");
    this.balance+=add;

}
public void transfer(double amount) {
    if (balance >= amount) {

        System.out.println(amount + " $" + " is transferred from your account");
        balance -= amount;
    }else{
        System.out.println(" You don't have enough funds. Transfer failed. ");
    }
}
public void info (){

    System.out.println( "\n Name : " + this.holderName);
    System.out.println(" Balance : " + this.balance);
    System.out.println( " Type : " + this.type);
    System.out.println(" Account number : " + this.accountNumber);
}







}
