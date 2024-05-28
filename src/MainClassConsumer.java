import java.util.*;
import java.util.function.*;

public class MainClassConsumer {
    public static void main(String[] args) {

        List<Integer> li = Arrays.asList(10, 12, 54, 33, 10);
//        Consumer cc = (a) -> System.out.println(a);
//        cc.accept(45);
//        li.forEach(cc);

        //here cc and (a) -> System.out.println(a); these are equal know , so we can re write like this
        li.forEach((a) -> System.out.println(a));
    }
}
