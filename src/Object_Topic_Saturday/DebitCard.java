package Object_Topic_Saturday;

public class DebitCard {


    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;

    public DebitCard() {

    }

    public void info() {

        System.out.println("Card Number: " + this.cardNumber);
        System.out.println("Holder Name: " + this.holderName);
        System.out.println("Balance: " + this.balance);
        if (cardType != null) {
            System.out.println(" Card type: " + this.cardType);
        }

    }

    public DebitCard(long cardNumber, String holderName, double balance) {
            this.holderName=holderName;
            this.balance=balance;
        if (cardNumber + "".length() == 16) {
            //System.out.println(" Valid Card Number");
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Invalid Card Number");
        }

    }

    public DebitCard(String cardType, int pin, double balance, String holderName, long cardNumber) {

                   this.balance=balance;
                   this.holderName=holderName;
                   this.cardNumber=cardNumber;

        if (cardType.equalsIgnoreCase("Mastercard") || cardType.equalsIgnoreCase("Visa")) {
            this.cardType = cardType;
        } else {
            System.out.println("Invalid Card");
        }

        if (pin + "".length() == 4) {
            this.pin = pin;
        } else {
            System.out.println(" Invalid pin length");
        }


    }
}