## Comparable and comparator don't exist.

- suppose we have numbers
- int[] arr = {5,2,8,1,9};
- java can sort them.

``` 
Arrays.sort(arr);
println(Arrays.toString(arr));
// [1,2,5,8,9]
```

- easy! right, but let's change the problem

```
class Student{

    int id;
    String name;
    String course;
    // constructor-initialize the values
    
    main()
    
    Student s1 = new Student(101,"Nooru", "IT");
    Student s2 = new Student(102,"tashviq","AI");
    Student s3 = new Student(103,"shadab","ML");
    Student[] students={s1,s2,s3};
}
```

Question : Sort but according to what???

- A Student object has many properties.

##### Student

- id
- name
- course

Question : Should java sort it by what ???

- id
- name
- course

Java doesn't know

```
suppose Java developers hardcoded it based on this below states:
Student -> sort by Id
Then tommorow another developer says
No no, I want based on names
Impossible 
Java cannot guess.
so Java said

"Dear developers, You tell me how to compare."
```

## Let's ask the object itself how to compare

### This is how the Comparable was born

CHAPTER: 1

```
Java 1.2 (1998)
java.lang
It is an Interface -> Comparable<T>

Syntax :

public interface Comparable<T>{
    int compareTo(T obj);
}
```

Question: Why Inside java.lang ?
Because Java engineers considered it a fundamental behaviour. Just like String , Integer so it is a core language
utility.

Most built-in objects need natural ordering.
So it was placed inside java.lang.

Question: What is natural Ordering
Default order

```
String
A B C D

Integers
1 2 3 4


Date 
06-16-2026 then 07-16-2026
```

so java calls this as natural ordering,
One class = One default order.

## Example:

```java
class Student implements Comparable<Student> {

    int id;
    String name;
    String course;

    Student(int id, String name, String course) {

        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student std) {
        return compare(this.id, std.id);
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(103, "Nooru", 'IT'),
                new Student(101, "Aman", 'ML'),
                new Student(102, "Riya", 'CI')
        };

        Arrays.sort(students);
    }
}
```

Java knows
Because student itself knows how to compare.

## How compareTo works ???

```java

@Override
public int compareTo(Student std) {
    return compare(this.id, std.id);
}
    /*
     if return results,
     negative-> this comes first, means small is at right place
     positive-> std comes first, means it is small
     0 -> both are equal keep as it is.     
     */
```

## But wait...

- hat if clients requirement changes ?
- lients ask Course or name tomorrow??
- or how many times u will change that method ???

Our code

```java
class Student implements Comparable<Student> {

    compareTo() {
        return this.id - other.id;
    }
}
```

- Today we sort it by id
- Tomorrow we sort it by name or something else.
- so as the requirement changes we have to change the class code
- It is a Bad Design, One class can have only ONE compareTo.

### What we understand ?

``
That, at a time we can have only one way of sorting, that is default. 
This is huge limitation
Therefore CHAPTER-2 came in picture.
``

CHAPTER-2: ARRIVAL OF COMPARATOR INTERFACE

```java
/*
   Java 1.2
   java.util
   Comparator<T> for type Safety
 */
```

### Question: Why java.uti ?

Because it is a utility/ helper
It is not a property of the object itself.
It's a tool.

```java
//Syntax:
public interface Comparator<T> {

    int compare(T o1, T o2);

}
```

Example:

### Sort according to names

```java
import ComparableXComparator.Comparable.User;

import java.util.Comparator;

class NamesComparator implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        return Double.compare(u1.names, u2.names);
    }
}

void main() {
    Arrays.sort(user, new NamesComparator());

}
```

Done!!!



