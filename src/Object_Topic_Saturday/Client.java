package Object_Topic_Saturday;

public class Client {

    public static void main(String[] args) {


   BankAccount myBank = new BankAccount();
   myBank.holderName = " President Trump";
   myBank.accountNumber = 787976;
   myBank.type = " Super Private";
   myBank.balance = 1234.0000;



   myBank.info();
   myBank.deposit(546.00);
   myBank.info();
   myBank.transfer(7000);
   myBank.info();







    }





}
