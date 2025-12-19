# Java Generics

## 1. Generics — Fundamental Concept (ZERO LEVEL)

### Official Definition

**Generics in Java enable classes, interfaces, and methods to operate on parameterized types, providing compile‑time type safety.**

### Simple Meaning

* Pehle hi decide kar lo **kis type ka data** aayega
* Compiler galat type ko **allow hi nahi karta**
* Runtime errors avoid hote hain

---

## 2. Why Generics Were Introduced 

### Without Generics (Raw Type Problem)

```java
class Box {
    Object value;  // Object can store ANY type

    void set(Object value) {
        this.value = value;
    }

    Object get() {
        return value;
    }
}
```

### Usage

```java
Box box = new Box();
box.set("Java");   // storing String

Integer x = (Integer) box.get(); // Runtime error
```

### Problem Analysis (Technical)

* No compile‑time checking
* Explicit casting required
* `ClassCastException` at runtime

**This problem is the exact reason Generics were introduced**

---

## 3. Generic Class — Core Foundation

```java
class Box<T> {  // T = Type Parameter

    private T value;  // value will be of type T

    // Setter accepts only T type
    public void set(T value) {
        this.value = value;
    }

    // Getter returns T type
    public T get() {
        return value;
    }
}
```

### Usage

```java
Box<String> box = new Box<>(); // T = String
box.set("Java");

// box.set(10);  Compile‑time error

String data = box.get(); // No casting needed
```

### Key Technical Points

* `T` is a **formal type parameter**
* Actual type is provided at **object creation**
* Compiler enforces strict type safety

---

## 4. Why Compile‑Time Safety Matters

```java
Box<Integer> box = new Box<>();
box.set(100);

// box.set("Java"); Compiler stops here
```

✔ Error detected before execution
✔ Application becomes stable and predictable

---

## 5. Generics in Collections Framework (REAL‑WORLD CORE)

### Without Generics (Dangerous)

```java
ArrayList list = new ArrayList();
list.add("Java");
list.add(10);
```

### With Generics (Correct Way)

```java
ArrayList<String> list = new ArrayList<>();
list.add("Java");
list.add("Spring Boot");

// list.add(10);  Compile‑time error
```

### Backend Reality

```java
List<User> users = userRepository.findAll();
```

---

## 6. Generic Method (Independent of Class)

```java
class Utility {

    // <T> declares method‑level generic
    public static <T> void print(T value) {
        System.out.println(value);
    }
}
```

### Usage

```java
Utility.print(10);
Utility.print("Backend");
Utility.print(3.14);
```

### Rule (Exam Line)

> Generic method introduces its own type parameter before return type.

---

## 7. Multiple Type Parameters (Key‑Value Pattern)

```java
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }
}
```

### Real Usage

```java
Pair<Long, String> employee = new Pair<>(101L, "Noorain");
```

---

## 8. Bounded Type Parameters (`extends`)

### Problem

Allow only numeric types

```java
class Calculator<T extends Number> {

    private T number;

    Calculator(T number) {
        this.number = number;
    }

    double square() {
        // doubleValue() available because of Number bound
        return number.doubleValue() * number.doubleValue();
    }
}
```

### Allowed

* Integer
* Double
* Float

### Not Allowed

* String

---

## 9. Wildcards (`?`) — Controlled Flexibility

### 9.1 Unbounded Wildcard

```java
void show(List<?> list) {
    for (Object obj : list) {
        System.out.println(obj);
    }
}
```

Accepts any List
Cannot add elements

---

### 9.2 Upper Bounded Wildcard (`extends`) — PRODUCER

```java
void readData(List<? extends Number> list) {
    for (Number n : list) {
        System.out.println(n);
    }
}
```

Safe to READ
Not safe to WRITE

---

### 9.3 Lower Bounded Wildcard (`super`) — CONSUMER

```java
void writeData(List<? super Integer> list) {
    list.add(10);
    list.add(20);
}
```

Safe to WRITE
Read only as Object

---

## 10. PECS Rule (INTERVIEW MUST)

> **PECS = Producer Extends, Consumer Super**

| Operation | Wildcard |
| --------- | -------- |
| Reading   | extends  |
| Writing   | super    |

Memory Rule:

> GET → extends
> PUT → super

---

## 11. Type Erasure (JVM CONCEPT)

### Definition

Generics exist only at compile time and are removed at runtime.

```java
List<String> list = new ArrayList<>();
```

Runtime:

```java
List list = new ArrayList();
```

### Effects

* No `instanceof List<String>`
* No `new T()`
* No generic arrays

---

## 12. Important Restrictions (EXAM)

- Primitive types not allowed

```java
List<int> list; // wrong
List<Integer> list; // correct
```

- Static members cannot use T

```java
class Test<T> {
    static T data; // wrong
}
```

---

## 13. Generics with Interfaces (Spring Style)

```java
interface Repository<T> {
    void save(T entity);
}
```

```java
class UserRepository implements Repository<User> {
    public void save(User user) {
        System.out.println("User saved");
    }
}
```

---

## 14. Real Backend Usage

* `List<User>`
* `Map<Long, Employee>`
* `Optional<T>`
* `ResponseEntity<T>`
* `JpaRepository<Entity, ID>`

---

## 15. FINAL REVISION SUMMARY

✔ Generics = Compile‑time type safety
✔ Prevents ClassCastException
✔ Uses type parameters (T, K, V)
✔ Controlled flexibility via wildcards
✔ PECS rule ensures safety

---

> **One Golden Line:**
> *Generics move type checking from runtime to compile time.*

---

