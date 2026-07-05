import java.util.*;


public class ShallowDeep {
//    public String toString() {
//        return "Noor";
//    }

    String name;

    public ShallowDeep(String name) {
        this.name = name;
    }

    public static void main(String[] args) {


//        String s = new String("Noor");
//        String s1 = s.intern();
//
//        System.out.println(s1);
//
//        System.out.println(s == s1);
//
//        System.out.println(new ShallowDeep().toString());

        ShallowDeep s1 = new ShallowDeep("Noorain");
        ShallowDeep s2 = s1;

        s2.name = "salman";
        System.out.println(s1.name);

        int a = 10;
        int b = a;

        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);

        Enumeration<Integer> e = v.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }


        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator<Integer> li = list.listIterator();

        while (li.hasNext()) {
            System.out.println(li.next());
        }

        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
        System.out.println(li);

        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        for (Integer i : l1) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }


        Object obj = new Object() {
            public int hashCode() {
                return 42;
            }
        };
        System.out.println(obj.hashCode());

        System.out.println();


        String s = " Noor";
        System.out.println(s.hashCode());

        s = s + "java";
        System.out.println(s.hashCode());
    }
}




