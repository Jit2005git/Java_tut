
import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner in= new Scanner (System.in);
        // String fruit = in.next();

        // // String a="apple";
        // // String b="apple";
        // //  System.out.println(a==b);
          
        // switch(fruit){
        //     case "apple":
        //         System.out.println("This is a red fruit Apple ");
        //         break;
        //     case "banana":
        //         System.out.println("This is a yellow fruit Banana ");
        //         break;
        //     case "mango":
        //         System.out.println("This is a tropical fruit Mango ");
        //         break;
        //         case "orange":
        //         System.out.println("This is a citrus fruit Orange ");
        //         break;
        //     default:
        //         System.out.println("Unknown fruit PLease Enter a valid fruit name");
        // }
        int day = in.nextInt();
        switch(day){

            // case 1 -> System.out.println("Monday");
            // case 2 -> System.out.println("Tuesday"); 
            // case 3 -> System.out.println("Wednesday");
            // case 4 -> System.out.println("Thursday");
            // case 5 -> System.out.println("Friday");
            // case 6 -> System.out.println("Saturday");
            //  case 7 -> System.out.println("Sunday"); 

            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            
        }
    
    }
}
