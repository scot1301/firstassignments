import hsa.Console;
public class IsLegal {

    static Console c;
    public static void main(String[] args) {
        c = new Console();
        int age;
        char isLegal;
        int option;
        c.println("Is she legal? (y/n)");
        isLegal = c.readChar();
        if(isLegal == 'y'){
            c.println("Whats her ag m8?");
            age = c.readInt();
            if(age >= 18)c.println("Good Boy!");
            else if(age <=17)c.println("You're going to jail m8!");
        }
        else if(isLegal == 'n'){
            
            c.println("You're a naughty boy!");
            c.println("Do she got da booty tho?(1 for yes/2 for no)");
            option = c.readInt();
            if(option == 1)c.println("Then who cares how old she is!");
            else if(option == 2)c.println("Then why the F**K are you interested in her?");  
            
        }
    }
    
}
