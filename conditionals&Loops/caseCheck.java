import java.util.Scanner;
public class caseCheck {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char ch = in.next().trim().charAt(0);
    // String word="hello";
    // // System.out.println("The character is: " + ch);
    // System.out.println("The character is: " + word.charAt(2));
        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("Uppercase");
        }
        else{
            System.out.println("Invalid input");
        }

    }
}
