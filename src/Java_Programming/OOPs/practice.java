package OOPs;

public class practice {
    public static class Person {
        private String name;    // instance field
        private int age;       // instance field

        public Person(String name, int age) {
            this.name = name;   // use of 'this'
            this.age = age;
        }

        public void celebrateBirthday() {
            this.age++;
            System.out.println(name + " is now " + age + " years old!");
        }

        public void printInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    public static void main(String[] args) {
            Person p = new Person("Alice", 30);
            p.celebrateBirthday();
            p.printInfo();
            p.celebrateBirthday();
            p.printInfo();
            p.celebrateBirthday();
            p.printInfo();
    }
}
