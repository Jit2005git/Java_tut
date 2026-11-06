import java.util.Scanner;
public class passingExample {
    public static void main(String []args){
        // String chacha ="Iron man";
        // greet(chacha);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = in.nextLine();
        String naam = in.next();
        String personalised = myGreet( naam);
        System.out.println(personalised);
    }

    static String myGreet(String name){
        return "Hello, " + name + "!";
    }
}
