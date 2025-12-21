package CollectionFramework.ListInterFace;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

//refer to line no-> 113
class myComparatorForInteger implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
// Ascending order - 3 ,5 || return -1 ||  o1 - o2 || 3-5 = -2
//Descending order - 3 5  || return +1 ||  o2 - o1 || 5-3 =  2

// for custom order for string
class myComparatorForString implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        //Ascending order
//        return s1.compareTo(s2);
        //Descending order
        return s2.compareTo(s1);
    }
}

//ordering according to size of strings

class StringLengthComparator implements Comparator<String> {
    public int compare(String s1,  String s2) {
        //according to bigger size first
        return s2.length() - s1.length();
        //according to smaller size
//       return s1.length() - s2.length();
    }
}


public class ArrayListClass {
    public static void main(String[] args) {

        //Default capacity is 10 and store in object called elementData
        //we can also set capacity of ArrayList like -> new ArrayList<>(1000);
        ArrayList<Integer> list = new ArrayList<>();

        //adding element in empty list
        list.add(10);// 0
        list.add(20);// 1
        list.add(30);// 1

        System.out.println("Element at Index: " + list.get(2));
        System.out.println("Size of List: " + list.size());
        System.out.println("" + list.set(2 , 25));
        System.out.println("Element at Index: " + list.get(2));
        list.remove(2);

//      //this will print all elements
        System.out.println("Elements in the list ");
        for (int i : list) {
            System.out.println(i);
        }

        //wanted to add btw indexes
        list.add(1,15);
        System.out.println("before using set Function and using add function");
        for (int i : list) {
            System.out.println(i);
        }

        //this will replace the element at given index
        list.set(1,17);
        System.out.println("After using set function");
        for (int i : list) {
            System.out.println(i);
        }


        // or to print u can directly print with name if list class
        System.out.println("elements in list :" + list);

        //list.contains
        System.out.println("Is 17 is present in List or not : " + list.contains(17));

        //different Ways of creating ArrayList are :

        List<String> list1 = new ArrayList<>();
        System.out.println("Empty");
        System.out.println(list1.getClass().getName());

        List<String> list2 = Arrays.asList("Monday","Tuesday","Wednesday");
        System.out.println(list2);
        System.out.println(list2.getClass().getName());

        String[] list3 = {"Noorain","Mahin","Shama","Firoj","Dadi"};
        //convert first it into strings arraylist
        System.out.println(Arrays.toString(list3));
        System.out.println(list3.getClass().getName());

        // u can replace in asList
        List<String> list31 = Arrays.asList(list3);
        System.out.println(list31);
        System.out.println(list31.getClass().getName());

        /* u can do it with primitive data types
        int[] num =  {1,2,3,4,5,6};
        List<Integer>num1 = Arrays.asList(num);
         */


        // u cant replace here in .of
        List<Integer> list4 = List.of(1,2,3,4,5,6);
        System.out.println("Of : " + list4);
        System.out.println(list4.getClass().getName());

        System.out.println("" + (list4));
        System.out.println(((list4)).getClass().getName());

        //Accessing Elements

        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(10);
        array.add(5);
        array.add(1);

        //just converting a list into objects
//        Object[] array1 = list.toArray();
        //converting list into Integer array and  "new Integer[0]" java will automatically create an internal array
//        Integer[] array2 = list.toArray(new Integer[0]);

        // collection can also be use but using name is enough
        Collections.sort(array);
        array.sort(null);
        System.out.println("Sorting with Collections :");
        System.out.println("Sorting in Ascending order " + array);


        //but what if we want to sort in descending order or other way
        // then we will use comparator -> refer to class myComparator line no : 7

        array.sort(new myComparatorForInteger());
        System.out.println("Sorting in Descending order" + array);

        List<String> string = new ArrayList<>();
        string.add("Apple");
        string.add("Grapes");
        string.add("Mango");
        string.add("Watermelon");

        string.sort(new myComparatorForString());
        System.out.println("String Sorted in Descending order : " + string);

        System.out.println("Sorting according to length of Strings");
        string.sort(new StringLengthComparator());
        System.out.println("Sorting in Descending Order according to size of string :" + string);

        //Let's do it with Lambda expression
        System.out.println("LAMBDA EXPRESSION ,No NEED TO CREATE CLASS AND ALL");
        List<Character> characters = new ArrayList<>(20);
        for(int i=0; i<=10; i++) {
            characters.add((char) ('z' - i)); // z , y, x ....
        }
        System.out.println("Default chars are : " + characters);
        characters.sort(Comparator.comparingInt(a -> a));
//        characters.sort((a,b) -> a - b);
        System.out.println("After Sorting they will appear in a b c format");
        System.out.println(characters);

        List<String> names = Arrays.asList("Noorain","Mahin","Shama","Firoj", "Sweetu");
        names.sort((a,b) -> b.length() - a.length());
        System.out.println("names are arranged in higher length order : " + names);


        System.out.println(array);
        System.out.println(array.get(1));
        System.out.println(array.getFirst());
        System.out.println(array.getLast());

        array.add(0,0);
        System.out.println("After adding at index one : " +  array);

        System.out.println(string);
        System.out.println(string.get(1));
        System.out.println(string.getFirst());
        System.out.println(string.getLast());

        string.add(0,"Pineapple");
        System.out.println("After adding at index one : " +  string);

        //removing
        string.remove(1);
        string.remove("apple");
        System.out.println("final string of fruits : " + string);

        //converting a list of string  into string array
        String[] arr = string.toArray(new String[0]);
        System.out.print("After converting a list into array : ");
        for (String i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();


        int[] i = {1, 2, 3};
        List<Integer> lNum = new ArrayList<>();
        for (int num : i) {
            lNum.add(num);
        }
        List<Integer> num = Arrays.stream(i)
                .boxed().
                collect(Collectors.toList());
        System.out.println(num);


        List<Students> studentsList = new ArrayList<>();
        studentsList.add(new Students("Noorain",100));
        studentsList.add(new Students("pavan",80));
        studentsList.add(new Students("Divyam",75));
        studentsList.add(new Students("priya",99));

       // studentsList.sort(null); // it will answer in ascending order but will give error because compiler don't know whom to compare
       studentsList.sort(Comparator.comparing(Students::getName).thenComparing(Comparator.comparing(Students::getGpa).reversed()));

        for (Students nme : studentsList) {
            System.out.println(nme.getName() + " : " + nme.getGpa());
        }
    }
}
class Students {
    private String name;
    private int gpa;

    Students (String name,int gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }
    public int getGpa() {
        return gpa;
    }
}
