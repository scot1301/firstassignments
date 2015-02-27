import hsa.Console;
public class Change {

    static Console c;
    static int change;
    static int pen, nickel, dime, quart, loonie, toonie;
    static double money;
    public static void main(String[] args) {
        c = new Console();

        
        
        while(true){
            try{
            c.print("Enter amount: ");
            money = c.readDouble();
            if(money>5)c.println("Error - Enter an amount lower than 5!");
            if(money<5){
                change = (int) (money*100);
                toonie = change/200;
                change = change%200;
                loonie = change/100;
                change = change%100;
                quart = change/25;
                change = change%25;
                dime = change/10;
                change = change%10;
                nickel = change/5;
                change = change%5;
                pen = change/1;
                change = change%1;
                c.println("===================");
                c.println("Toonies needed: " + toonie);
                c.println("Loonies needed: " + loonie);
                c.println("Quarters needed: " + quart);
                c.println("Dime needed: " + dime);
                c.println("Nickel needed: " + nickel);
                c.println("Pennies needed: " + pen);
                break;
            }
            }catch(NumberFormatException e){
                
            }
        }
        
    }
    
    
}
