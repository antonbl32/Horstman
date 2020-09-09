package second;
import org.omg.CORBA.IntHolder;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        System.out.println(list);
        list.set(0,4);
        System.out.println(list);
        IntHolder j=new IntHolder(5);
        System.out.println(j.value);
        summ(j);
        System.out.println(j.value);
        Size m=Size.BIG;
    }
    public static void summ(IntHolder k){ k.value++;}
    public enum Size{SMALL,BIG, LOW,HIGHT}

}
