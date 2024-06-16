import java.util.Scanner;

public class MethodNesting {
    private int length;
    private int breadth;
    private int height;
    MethodNesting(int l,int b,int h){
        this.length=l;
        this.breadth=b;
        this.height=h;
    }
    private static void volume(MethodNesting obj){
        area(obj);
        int vol= obj.length* obj.breadth* obj.height;
        System.out.printf("Volume of cuboid : %d\n",vol);
    }
    private static void area(MethodNesting obj){
        perimeter(obj);
        int area=2*(obj.length* obj.breadth+ obj.height* obj.breadth+obj.height* obj.length);
        System.out.printf("Area of cuboid : %d\n",area);
    }
    private static void perimeter(MethodNesting obj){
        int perimeter=4*(obj.length+ obj.height+ obj.breadth);
        System.out.printf("Perimeter of cuboid: %d\n",perimeter);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int l= sc.nextInt();
        System.out.println("Enter breadth");
        int b=sc.nextInt();
        System.out.println("Enter heigth");
        int h=sc.nextInt();
        MethodNesting obj=new MethodNesting(l,b,h);
        obj.volume(obj);

    }
}
