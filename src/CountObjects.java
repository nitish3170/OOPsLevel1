import java.util.function.DoubleFunction;

public class CountObjects {

    private static int count=0;
    CountObjects(){
        count++;
    }
    private static int getCount(){
        return count;
    }

    public static void main(String[] args) {
        CountObjects obj1=new CountObjects();
        CountObjects obj2=new CountObjects();
        CountObjects obj3=new CountObjects();
        CountObjects obj4=new CountObjects();
        System.out.printf("Number of objects created : %d",CountObjects.count);
    }
}
