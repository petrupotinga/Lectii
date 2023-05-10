package Stream;

import java.util.ArrayList;
import java.util.List;

public class TestReduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);
//        int rezult = list.stream().reduce((accumulator, element) ->
//                accumulator * element).get();
//        System.out.println(rezult);

//        int rezult2 = list.stream().reduce(1,(accumulator, element) ->
//                accumulator * element);
//        System.out.println(rezult2);

//        List<Integer> list100 = new ArrayList<>();
//        Optional<Integer> o = list100.stream().reduce((accumulator, element) ->
//                accumulator * element);
//        if (o.isPresent()) {
//            System.out.println(o.get());
//        } else {
//            System.out.println("Not present");
//        }
    }
}
