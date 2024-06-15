import java.util.Scanner;

public class AreaOfTriangleRectangle {
    float param1;
    float param2;
    AreaOfTriangleRectangle(float a, float b){
        this.param1=a;
        this.param2=b;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first parameter: ");
        float a=sc.nextFloat();
        System.out.println("Enter the second parameter: ");
        float b=sc.nextFloat();
        AreaOfTriangleRectangle obj1=new AreaOfTriangleRectangle(a,b);
        areaRectangle(obj1);
        areaTriangle(obj1);

    }

    private static void areaTriangle(AreaOfTriangleRectangle obj1) {
        float area= obj1.param1*obj1.param2;
        System.out.printf("Area of rectangle= %.2f\n",area);
    }

    private static void areaRectangle(AreaOfTriangleRectangle obj1) {
        float area= (float) (0.5*obj1.param1*obj1.param2);
        System.out.printf("Area of triangle: %.2f\n",area);
    }
}
