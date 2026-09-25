
import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();
        switch(empId){
            case 1:
                System.out.println("Employee 1");
                switch(department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "HR":
                        System.out.println("HR Department");
                        break;
                    default:
                        System.out.println("No department found");
                }
                break;
            case 2:
                System.out.println("Employee 2");
                switch(department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "HR":
                        System.out.println("HR Department");
                        break;
                    default:
                        System.out.println("No department found");
                }
                break;
            default:
                System.out.println("No employee found");
        }
    }
    
}
