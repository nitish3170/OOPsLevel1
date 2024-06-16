import java.util.Scanner;

public class Area {
    private static void area(float a){
        System.out.printf("Area of circle : %.2f\n",3.14*a*a);
    }
    private static void area(int s){
        System.out.printf("Area of square: %d\n",s*s);
    }
    private static void area(int l, int b){
        System.out.printf("Area of rectangle: %d\n",l*b);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the side of square: ");
        int s=sc.nextInt();
        area(s);
        System.out.println("Enter the length of rectangle: ");
        int l=sc.nextInt();
        System.out.println("Enter the width of rectangle: ");
        int b=sc.nextInt();
        area(l,b);
        System.out.println("Enter the radius of circle :");
        float r=sc.nextFloat();
        area(r);
    }
}
