import java.util.Scanner;

public class ArithmeticSum {
    private static void sum(float a, float b){
        System.out.printf("Sum of 2 numbers: %.2f\n",a+b);
    }
    private static void sum(float a, float b, float c){
        System.out.printf("Sum of 3 numbers: %.2f\n",a+b+c);
    }
    private static void sum(float a, float b, float c, float d){
        System.out.printf("Sum of 3 numbers: %.2f\n",a+b+c+d);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        float a=sc.nextFloat();
        System.out.println("Enter the 2nd number: ");
        float b=sc.nextFloat();
        System.out.println("Enter the 3rd number: ");
        float c=sc.nextFloat();
        System.out.println("Enter the 4th number: ");
        float d=sc.nextFloat();
        sum(a,b);
        sum(a,b,c);
        sum(a,b,c,d);
    }

}
