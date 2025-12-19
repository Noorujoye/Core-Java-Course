package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Employee {
    String name;
    String dept;
    int age;
    int salary;
    Employee(String n , String d , int a , int b) {
        this.name=n;
        this.dept=d;
        this.age=a;
        this.salary=b;
    }
}

class User {
    String name;
    Optional<String> phone;

    User(String name, String phone) {
        this.name = name;
        this.phone = Optional.ofNullable(phone);
    }
}

class Product {
    String name;
    Optional<Integer> price;

    Product(String name, Integer price) {
        this.name = name;
        this.price = Optional.ofNullable(price);
    }
}


public class StreamByGpt {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        Stream<Integer> l = list.stream();
        System.out.println(list);

        //from array
        int[] arr = {1, 2, 3};
        IntStream i = Arrays.stream(arr);
        System.out.println();

        Stream<String> s = Stream.of("A", "B", "C");
        System.out.println();

        List<Employee> emps = List.of(
                new Employee("Aman","IT",25,60000),
                new Employee("Rohit","HR",30,50000),
                new Employee("Neha","IT",29,80000),
                new Employee("Sara","IT",21,40000),
                new Employee("Arjun","IT",26,55000)
        );

        List<String> res =
                emps.stream()
                        .filter(e -> e.dept.equals("IT"))
                        .filter(e -> e.salary > 50000)
                        .sorted(Comparator.comparing(e -> e.age))
                        .map(e -> e.name)
                        .toList();
        System.out.println(res);

        List<User> users = List.of(
                new User("Aman", "9876543210"),
                new User("Rohit", null),
                new User("Sara", "9988776655"),
                new User("Neha", null),
                new User("Arjun", "9123456780")
        );

        List<String> phone =
                users.stream()
                        .map(u -> u.phone)
                        .flatMap(Optional::stream)
                        .sorted()
                        .toList();

        List<Product> products = List.of(
                new Product("Laptop", 50000),
                new Product("Phone", null),
                new Product("Mouse", 800),
                new Product("Keyboard", 1200),
                new Product("Monitor", null),
                new Product("Tablet", 35000)
        );


        double avg =
                products.stream()
                        .map(p -> p.price)                // Stream<Optional<Integer>>
                        .flatMap(Optional::stream)        // Stream<Integer>
                        .mapToInt(Integer::intValue)      // IntStream
                        .average()                        // OptionalDouble
                        .orElse(0.0);                     // default value

        int maxPrice =
                products.stream()
                        .map(p -> p.price)
                        .filter(Optional::isPresent)
                        .map(Optional::get)
                        .mapToInt(Integer::intValue)
                        .max()
                        .orElse(0);

    }
}
