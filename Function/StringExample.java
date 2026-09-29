import java.util.Scanner;
public class StringExample {
    public static void main(String[] args){
        // String message = greet();
        // System.out.println(message);
        // String personalised = myGreet("Jit");
        // System.out.println(personalised);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = in.nextLine();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }
    static String myGreet(String name){
        String greeting = "Hello, " + name + "! Welcome to the program!";
        return greeting;
    }
    static String greet(){
        String greeting = "Hello, welcome to the program!";
        return greeting;
       }

   
}
