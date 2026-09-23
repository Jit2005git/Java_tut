
import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner in= new Scanner (System.in);
        String fruit = in.next();

        // String a="apple";
        // String b="apple";
        //  System.out.println(a==b);
          
        switch(fruit){
            case "apple":
                System.out.println("This is a red fruit Apple ");
                break;
            case "banana":
                System.out.println("This is a yellow fruit Banana ");
                break;
            case "mango":
                System.out.println("This is a tropical fruit Mango ");
                break;
                case "orange":
                System.out.println("This is a citrus fruit Orange ");
                break;
            default:
                System.out.println("Unknown fruit PLease Enter a valid fruit name");
        }
    
    }
}
