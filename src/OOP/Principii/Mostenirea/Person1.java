package OOP.Principii.Mostenirea;

    public class Person1 {
        private String name;
        private int age;

        public Person1(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String username) {
            if (username.isEmpty()) {
                System.out.println("Cimpul nu poate fi gol");
            } else {
                name = username;
            }
        }

        public void setAge(int userage) {
            if (userage < 0) {
                System.out.println("Valoarea nu poate fi negativa");
            } else {
                age = userage;
            }
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person1{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
