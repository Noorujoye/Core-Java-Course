package InterviewQuestion;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public int getId() {
        return this.id;
    }
}

public class GroupTheEmployeesBasedOnAge {

    public static Map<Integer, List<Integer>> groupEmployeeAgeWise1(ArrayList<Employee> empList) {

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (Employee emp : empList) {
            int age = emp.getAge();
            int id = emp.getId();

            if (map.containsKey(age)) {
                List<Integer> ids = map.get(age);
                ids.add(id);
            } else {

                List<Integer> ids = new ArrayList<>();
                ids.add(id);
                map.put(age, ids);
            }
        }
        return map;
    }

    public static Map<Integer, List<Integer>> groupEmployeeAgeWise(ArrayList<Employee> empList) {

        // (age ,    id's of emp)
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for (Employee emp : empList) {
            map.computeIfAbsent(
                    emp.getAge(),
                    age -> new ArrayList<>()
            ).add(emp.getId());
        }
        for (List<Integer> l : map.values()) {
            Collections.sort(l);
        }
        return map;
    }

    static void main() {

        ArrayList<Employee> empList = new ArrayList<>();
        {
            empList.add(new Employee(111, "Arjun", 26));
            empList.add(new Employee(112, "Pooja", 25));
            empList.add(new Employee(113, "Aakash", 21));
            empList.add(new Employee(114, "Simran", 22));
            empList.add(new Employee(115, "Yash", 27));
            empList.add(new Employee(116, "Riya", 24));
            empList.add(new Employee(117, "Harsh", 23));
            empList.add(new Employee(118, "Megha", 26));
            empList.add(new Employee(119, "Aditya", 25));
            empList.add(new Employee(120, "Kriti", 21));

            empList.add(new Employee(101, "Noorain", 21));
            empList.add(new Employee(102, "Aman", 22));
            empList.add(new Employee(103, "Rahul", 21));
            empList.add(new Employee(104, "Priya", 23));
            empList.add(new Employee(105, "Rohit", 24));
            empList.add(new Employee(106, "Sneha", 22));
            empList.add(new Employee(107, "Vikas", 25));
            empList.add(new Employee(108, "Anjali", 21));
            empList.add(new Employee(109, "Karan", 24));
            empList.add(new Employee(110, "Neha", 23));

            empList.add(new Employee(121, "Saurabh", 22));
            empList.add(new Employee(122, "Nikita", 24));
            empList.add(new Employee(123, "Deepak", 23));
            empList.add(new Employee(124, "Shreya", 25));
            empList.add(new Employee(125, "Abhishek", 27));
            empList.add(new Employee(126, "Payal", 26));
            empList.add(new Employee(127, "Manish", 22));
            empList.add(new Employee(128, "Tanya", 24));
            empList.add(new Employee(129, "Rakesh", 21));
            empList.add(new Employee(130, "Isha", 23));
        }
        Map<Integer, List<Integer>> ans = groupEmployeeAgeWise(empList);
        for (Map.Entry<Integer, List<Integer>> entry : ans.entrySet()) {
            System.out.println("Age is : " + entry.getKey() + " and " + entry.getValue());
        }
//        ans.forEach((age, id) -> System.out.println(age + " : " + id));
    }
}
