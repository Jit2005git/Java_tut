
public class scope {
 public static void main(String[] args){
    int a = 10;
    int b = 20;
    swap(a, b);
    System.out.println(a +""+ b);
    String name = "Iron man";
    changeName(name);
    System.out.println(name);


 }  
 static void changeName(String name){
    name = "Captain America";
 }
 static void swap(int a, int b){
    int temp = a;
    a = b;
    b = temp;
 }
}
