package Stream;

import java.util.Arrays;

public class TestForEach {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
//        Arrays.stream(array).forEach(elem -> {
//            elem *= 2;
//            System.out.println(elem);
//        });
//        Arrays.stream(array).forEach(System.out::println);
//        Arrays.stream(array).forEach(Utils::myMethod);
//        Arrays.stream(array).forEach(el->Utils.myMethod(el));

        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));
    }
}

class Utils {
    public static void myMethod(int a) {
        a = a + 5;
        System.out.println("Element a = " + a);
    }
}