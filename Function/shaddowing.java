public class shaddowing {
    static int x =9;//this will be shadowed at line 7
    public static void main(String[] args){
        System.out.println(x);
        int x = 90;
        System.out.println(x);
        fun();
          
    }
    static void fun(){
        System.out.println(x);
    }
}
