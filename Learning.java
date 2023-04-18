package Learning;
import java.util.ArrayList;
import java.util.Scanner;



public class Learning {
    
    public static void main(String[] args) {

        Scanner myNum = new Scanner(System.in);
        Scanner myString = new Scanner(System.in);
        int answer = 0;
    
        System.out.println("Calculator");
            
        System.out.println("Enter first number");
    
        int a = myNum.nextInt();
    
        System.out.println("Enter Second number");
    
        int b = myNum.nextInt();
    
        System.out.println("Enter operator");
    
        String op = myString.nextLine();
    
        switch(op){
            case "+":
                answer = a+b;
                break;
            case "-":
                answer = a-b;
                break;
            case "/":
                answer = a/b;
                break;
            case "*":
                answer = a*b;
                break;
          }
            //test
        System.out.println(answer);
    }    
}
