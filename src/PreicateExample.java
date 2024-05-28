import java.util.*;
import java.util.function.*;

public class PreicateExample {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();

        arr.add(1);arr.add(3);arr.add(30);arr.add(40);arr.add(50);arr.add(45);arr.add(60);arr.add(53);

        System.out.println(arr.size());
        //Predicate<Collection> p = aa -> arr.size() >10;
        //System.out.println(p.test(arr));

        //Here i want to find the list values which is even or odd

        Predicate<Integer> p  = no-> (no %2 !=0);
        Predicate<Integer> p1 = no -> no <10 ;



//        for(int i =0;i<arr.size() ;i++) {
//            System.out.println( p.test(arr.get( i)));
//        }

        check(p.negate() , arr) ;
        System.out.println("next predicate ");
        check(p1 , arr) ;
        System.out.println("Odd 'and' greater thaan 10  ");
        check(p.and(p1) ,arr);

        System.out.println("Odd 'OR' greater thaan 10  ");
        check(p.or(p1) ,arr);
        }


    private static void check(Predicate<Integer> p, ArrayList<Integer> arr) {
        for(int i =0;i<arr.size() ;i++) {
//            System.out.println(p.test(arr.get(i))  +"   " + arr.get(i));
                if(p.test(arr.get(i))==true){
                    System.out.println( arr.get(i));
                }

        }
    }

}

