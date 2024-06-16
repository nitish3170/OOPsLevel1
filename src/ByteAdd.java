import java.util.Scanner;

public class ByteAdd {
    private static void add(byte a,byte b){
        int aa=(int)a;
        int bb=(int)b;
        System.out.printf("Addition : %d",aa+bb);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first byte");
        byte a=sc.nextByte();
        System.out.println("Enter the second byte");
        byte b=sc.nextByte();
        add(a,b);
    }
}
