package OOP.Static;

public class Static1 {
        String name;
        int course;
        static int count;   // variabila statica se refera la clasa nu la obiect

        public Static1(String name, int course) {
                count++;
                this.name = name;
                this.course = course;
                System.out.println("Studentul " + count + " este cursul " + course);
        }
        void showInfo () {
                System.out.println("Studentul meu invata bine");
        }
}
 class StudentTest {
         public static void main(String[] args) {
                 Static1 st1 = new Static1("Ion", 4);
                 Static1 st2 = new Static1("Misa", 3);
                 Static1 st3 = new Static1("Maria", 2);

                 System.out.println(Static1.count);  // se apeleaza variabila fara a crea un obiect
                 st2.showInfo();
         }
 }             // metodele statice le putem apela fara a crea obiecte     ex: showInfo();
               // metodele le apelam numai prin obiect     ex: st2.showInfo();






