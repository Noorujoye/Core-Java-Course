package small_projects;

public class Employee {
    private int ID;
    private String name;
    private int age;
    private static int nextId = 1;

//    why satic because to keep shared it among all objects

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = nextId++;
    }

    public void show() {
        System.out.println("ID =" + ID + "\nName = " + name + "\nAge = " + age);
    }

    public void showNextId() {
        System.out.println("NeXt emplOyee id will be = " + nextId);
    }

    protected void finalize(){
        --nextId;
    }
}

    class UseEmployee{
        public static void main(String[] args){
            Employee E = new Employee("NOORAIN1" , 57);
            Employee F = new Employee("NOORAIN2" , 58);
            Employee G = new Employee("NOORAIN3" , 59);

            E.show();
            F.show();
            G.show();
            E.showNextId();
            F.showNextId();
            G.showNextId();

//              Sub blocks to keep all interns
            {
                Employee X = new Employee("NOORAIN4" , 60);
                Employee Y = new Employee("NOORAIN5" , 61);
                X.show();
                Y.show();
                X.showNextId();
                Y.showNextId();

                X = Y = null;
                System.gc();
                System.runFinalization();
            }
            E.showNextId();
        }
}
