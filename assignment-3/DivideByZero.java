import java.util.Scanner;


public class DivideByZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a=input.nextDouble();
        System.out.print("Enter b: ");
        double b=input.nextDouble();
        try{
          double result =a/b;  
          System.out.println("a/b = " + a + "/" + b +" = " + result);
        }catch(ArithmeticException e){
          System.out.println("Division by zero");
        }
        
    }
}