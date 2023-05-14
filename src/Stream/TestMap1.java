package Stream;

import java.util.*;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class TestMap1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("salut");
        list.add("cum treaba");
        list.add("ok");
        list.add("poka");
//        System.out.println(list);
//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
        List<Integer> list2 = list.stream().map(element ->
                element.length()).collect(toList());
//        System.out.println(list);
        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).map(e -> {
            return e % 3 == 0 ? e / 3 : e;
        }).toArray();

//        System.out.println(Arrays.toString(array));
        Set<String> set = new TreeSet<>();
        set.add("salut");
        set.add("cum treaba");
        set.add("ok");
        set.add("poka");
        System.out.println(set);
        Set<Integer> set2 = set.stream().map(String::length).collect(toSet());
        List<Integer> list3 = set.stream().map(String::length).collect(toList());
        System.out.println(set2);
        System.out.println(list3);
    }
}
