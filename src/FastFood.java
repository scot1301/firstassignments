import hsa.Console;
import java.util.Random;
public class FastFood {

    static double paymoney, change, total, tax, subtotal;
    static Console c;
    static int numburgs, numfries, numdrinks, numonions, nummilks;
    static Random r;
    static int x;
    public static void main(String[] args) throws InterruptedException {
        c = new Console();
        final double taxpercent=0.13;
        char paymethod;
        final double burgers=1.69, fries=1.09, drinks=0.99, onionRings=1.28, milkshake=1.15;
        
        c.print("Enter the number of burgers: ");
        numburgs =(int) c.readDouble();
        c.print("Enter the number of fries: ");
        numfries =(int) c.readDouble();
        c.print("Enter the number of drinks: ");
        numdrinks =(int) c.readDouble();
        c.print("Enter the number of onion rings: ");
        numonions =(int) c.readDouble();
        c.print("Enter the number of milkshakes: ");
        nummilks =(int) c.readDouble();
        subtotal= numburgs*burgers
                +numfries*fries
                +numdrinks*drinks
                +numonions*onionRings
                +nummilks*milkshake;
        c.println("");
        c.println("Subtotal: $" + Math.floor(subtotal * 100) / 100);
        tax=subtotal*taxpercent;
        c.println("Tax: $" + Math.floor(tax * 100) / 100);
        total = subtotal+tax;
        c.println("Total: $" + Math.floor(total * 100) / 100);
        c.println("");
        c.println("What method would you like to pay with? (c=cash, d=debit, e=creditcard) ");
        while(true){
            paymethod = c.readChar();
            if(paymethod == 'c'){
                payCash();
                break;
            }
            if(paymethod == 'd'){
                payDebit();
                break;
            }
            if(paymethod == 'e'){
                payCredit();
                break;
            }
            else c.println("Please enter a method to pay!");
        }
    }
    public static void payCash(){
        c.print("Enter amount tendered: ");
        paymoney = c.readDouble();
        change = paymoney-total;
        c.println("Change Due: " + Math.floor(change * 100) / 100);
    }
    public static void payDebit() throws InterruptedException{
        c.clear();
        c.println("Please enter your 4 digit pin: ");
        int pin;
        char option;
        while(true){
            pin = c.readInt();
            if(pin >= 1000 && pin <=9999){
                Thread.sleep(250);
                c.print("Processing");
                Thread.sleep(500);
                c.print(".");
                Thread.sleep(500);
                c.print(".");
                Thread.sleep(500);
                c.println(".");
                Thread.sleep(1000);
                c.println("Accepted!");
                Thread.sleep(200);
                c.println("Thank you for your purchase!");
                Thread.sleep(200);
                c.println("Print reciept? (y/n)");
                option = c.readChar();
                if (option == 'y')printReciept();
                if(option == 'n')c.println("Will not print reciept, Enjoy!");
                break;
            }
            else c.println("Please enter a valid 4 digit pin!");
        }
    }
    public static void payCredit() throws InterruptedException{
        c.clear();
        c.println("Please enter your pin: ");
        int pin2;
        final int pinO;
        char option;
        int count=0;
        while(true){
            pin2 = c.readInt();
            if(pin2 >= 1000 && pin2 <=9999){
                pinO = pin2;
                processing();
                Thread.sleep(1000);
                x = 1 + (int)(Math.random()*3);
                System.out.println(x);
                if(x==1){
                    c.println("Accepted!");
                    Thread.sleep(200);
                    c.println("Thank you for your purchase!");
                    Thread.sleep(200);
                    c.println("Print reciept? (y/n)");
                    option = c.readChar();
                    if (option == 'y')printReciept();
                    if(option == 'n')c.println("Will not print reciept, Enjoy!");
                    c.close();
                    break;
                }
                else if(x==2){
                    Thread.sleep(200);
                    c.println("Transaction Denied!");
                    Thread.sleep(200);
                    c.println("Unable to process the funds from your account!");
                    Thread.sleep(200);
                    c.println("Sorry.. No food for you :/");
                    c.close();
                    break;
                }
                else if(x==3){
                    Thread.sleep(200);
                    c.println("There was an error while processing");
                    Thread.sleep(200);
                    c.println("Please re-enter your pin to try again");
                    pin2 = c.readInt();
                    if(pin2 == pinO){
                        processing();
                        c.println("Accepted!");
                        Thread.sleep(200);
                        c.println("Thank you for your purchase!");
                        Thread.sleep(200);
                        c.println("Print reciept? (y/n)");
                        option = c.readChar();
                        if (option == 'y')printReciept();
                        if(option == 'n')c.println("Will not print reciept, Enjoy!");
                        c.close();
                        break;
                    }
                    else if(pin2 != pinO){
                        c.println("Please re-enter you pin correctly!"); 
                    }
                }
                option = c.readChar();
                if (option == 'y')printReciept();
                if(option == 'n')c.println("Will not print reciept, Enjoy!");
                c.close();
                break;
            }
            else c.println("Please enter a valid 4 digit pin!");
        }
    }
    public static void processing() throws InterruptedException{
        Thread.sleep(250);
        c.print("Processing");
        Thread.sleep(500);
        c.print(".");
        Thread.sleep(500);
        c.print(".");
        Thread.sleep(500);
        c.print(".");
        Thread.sleep(500);
        c.print(".");
        Thread.sleep(500);
        c.print(".");
        Thread.sleep(500);
        c.println(".");
    }
    public static void printReciept() throws InterruptedException{
        Thread.sleep(250);
        c.println("==========================");
        Thread.sleep(250);
        c.println("|   Scotty's Restaurant  |");
        Thread.sleep(250);
        c.println("|        Product         |");
        Thread.sleep(250);
        c.println("");
        Thread.sleep(250);
        c.println("Burgers: " + numburgs);
        Thread.sleep(250);
        c.println("Fries: " + numfries);
        Thread.sleep(250);
        c.println("Drinks: " + numdrinks);
        Thread.sleep(250);
        c.println("Onion Rings: " + numonions);
        Thread.sleep(250);
        c.println("Milkshakes: " + nummilks);
        Thread.sleep(250);
        c.println("");
        Thread.sleep(250);
        c.println("==========================");
        Thread.sleep(250);
        c.println("Subtotal: $" + Math.floor(subtotal * 100) / 100);
        Thread.sleep(250);
        c.println("Tax: $" + Math.floor(tax * 100) / 100);
        Thread.sleep(250);
        c.println("Total: $" + Math.floor(total * 100) / 100);
        c.println("==========================");
        String exit;
        c.println("Enter in 'close' to close");
        while(true){
        exit = c.readString();
        if(exit=="close"){
            c.close();
            break;
        }
        else c.println("Please enter 'close' to close!!");
        }
    }
}
