public class Main{
    public static void main(String [] args){
        
        int salary = 10000;
        // if(salary > 10000){
        //     salary = salary + 2000;
        //     System.out.println("You are a rich person");

        // }
        // else{
        //     salary = salary + 1000;
        //     System.out.println("You are a poor person");
        // }
        //Multiple if else statements

    if(salary > 10000){
        salary+= 2000;
    }
    else if(salary>5000){
        salary+= 1000;
    }
    else{
        salary+= 500;
    }
    }
        System.out.println("Your salary is: " + salary);

    }
}
