package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMap1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("salut");
        list.add("cum treaba");
        list.add("ok");
        list.add("poka");
        System.out.println(list);
//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
     List<Integer> list2 =list.stream().map(element->
             element.length()).collect(Collectors.toList());
        System.out.println(list);
        int[]array = {5,9,3,8,1};
        Arrays.stream(array).map(e->{ if(e%3==0){
        e = e/3;
        } return e;
        }).toArray();
        System.out.println(Arrays.toString(array));
    }
}
