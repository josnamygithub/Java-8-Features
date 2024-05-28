
import java.util.*;
import java.util.Iterator;

public class ForechDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,4,5,6,6,7,7);
        System.out.println(list);

        for(int i =0 ;i< list.size() ;i++){
            System.out.println(list.get(i));
        }
        for (Integer i :  list){
            System.out.println(i);
        }
       list.forEach(elemet ->System.out.println(elemet));
    }
}
