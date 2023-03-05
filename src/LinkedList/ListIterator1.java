package LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator1 {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reversiterator = list.listIterator(list.size());
        boolean isPolindrome = true;
        while (iterator.hasNext() && reversiterator.hasPrevious()) {
            if (iterator.hasNext() != reversiterator.hasPrevious()){
                isPolindrome = false;
                break;
            }
        }
        if(isPolindrome) {
            System.out.println("Polindrom");
        }else{
            System.out.println("Not polindrom");
        }
    }
}

