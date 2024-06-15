import java.util.Scanner;

public class Calculator {
    private static float Sum(float a, float b){
        return a+b;
    }
    private static void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float a=sc.nextFloat();
        System.out.println("Enter the second number: ");
        float b =sc.nextFloat();
        float sum=Sum(a,b);
        System.out.printf("Sum of %.2f and %.2f : %.2f",a,b,sum);
    }
    public static void main(String[] args) {
        input();

    }
}