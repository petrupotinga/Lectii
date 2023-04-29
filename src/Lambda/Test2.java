package Lambda;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("salut"));
    }

    public static void main(String[] args) {
        def((String st) -> {
            return st.length();
        });
    }
}

interface I {
    int abc(String s);
}
