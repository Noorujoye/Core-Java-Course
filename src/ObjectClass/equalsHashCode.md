# Java equals() & hashCode() Complete Interview Revision Sheet

## 1. Object Class Default Implementation

Every class indirectly extends Object.

```java
class Employee {
}

// Actually
class Employee extends Object {
}
```

### Object.equals()

```java
public boolean equals(Object obj) {
    return (this == obj);
}
```

Meaning:

- Reference compare karta hai
- Same object => true
- Different object => false

---

### Object.hashCode()

```java
public native int hashCode();
```

Meaning:

- Object identity based hash
- Generally different objects => different hashcodes
- Collision possible hai (guarantee nahi hai ki hamesha different hi hon)

---

## 2. Difference Between == and equals()

| Operator | Checks                                       |
|----------|----------------------------------------------|
| ==       | Reference                                    |
| equals() | Class ke implementation par depend karta hai |

Example:

```java
Employee e1 = new Employee();
Employee e2 = new Employee();

System.out.

println(e1 ==e2);      // false
System.out.

println(e1.equals(e2)); // false
```

Reason:

```java
Object.equals()
↓
        this==obj
↓
        false
```

---

## 3. String Class Overrides equals()

String content compare karta hai.

Conceptually:

```java
public boolean equals(Object obj) {

    if (this == obj)
        return true;

    if (!(obj instanceof String))
        return false;

    String other = (String) obj;

    return contentCompare();
}
```

Meaning:

```java
String s1 = new String("Java");
String s2 = new String("Java");

System.out.

println(s1.equals(s2));
```

Output:

```java
true
```

Because content same hai.

---

## 4. String Class Overrides hashCode()

String hashCode content se calculate hota hai.

Example:

```java
String s1 = "Noor";
String s2 = new String("Noor");

System.out.

println(s1.hashCode());
        System.out.

println(s2.hashCode());
```

Output:

```java
Same hashcode
```

Because content same hai.

---

## 5. Literal vs Literal

```java
String s1 = "Noor";
String s2 = "Noor";
```

Memory:

String Pool

    "Noor"
      ↑

s1 s2

Check:

```java
System.out.println(s1 ==s2);
```

Output:

```java
true
```

Same pooled object.

---

Check:

```java
System.out.println(s1.equals(s2));
```

Output:

```java
true
```

Content same.

---

## 6. Literal vs new

```java
String s1 = "Noor";
String s2 = new String("Noor");
```

Memory:

String Pool

    "Noor"
      ↑
      s1

Heap

    "Noor"
      ↑
      s2

Check:

```java
System.out.println(s1 ==s2);
```

Output:

```java
false
```

Different references.

---

Check:

```java
System.out.println(s1.equals(s2));
```

Output:

```java
true
```

String content compare karta hai.

---

Check:

```java
System.out.println(s1.hashCode() ==s2.

hashCode());
```

Output:

```java
true
```

Because content same hai.

---

## 7. HashCode Contract

### Rule 1

If:

```java
a.equals(b) ==true
```

Then:

```java
a.hashCode() ==b.

hashCode()
```

Must be true.

---

### Rule 2

If:

```java
a.hashCode() ==b.

hashCode()
```

Then:

```java
a.equals(b)
```

Can be:

```java
true
```

OR

```java
false
```

Both possible.

---

## 8. Famous Interview Example

```java
String s1 = "FB";
String s2 = "Ea";

System.out.

println(s1.hashCode());
        System.out.

println(s2.hashCode());
```

Output:

```java
2236
        2236
```

Check:

```java
System.out.println(s1.hashCode() ==s2.

hashCode());
```

Output:

```java
true
```

---

Check:

```java
System.out.println(s1.equals(s2));
```

Output:

```java
false
```

This is called:

```text
Hash Collision
```

Meaning:

Different objects
↓
Same hashcode
↓
Collision

---

## 9. HashSet Internal Working

When:

```java
set.add(obj);
```

Internally:

```java
1.hashCode()
2.
Find Bucket
3.

equals() if needed
```

Flow:

hashCode()
|
v
Find Bucket
|
+---- Empty
| |
| v
| Add Object
|
+---- Occupied
|
v
equals()
|
+-------+-------+
| |
true false
| |
Duplicate Add Object

---

## 10. Does HashSet Always Call equals()?

NO

Case 1:

```java
hash1 !=hash2
```

Different buckets.

equals() may never be called.

---

Case 2:

```java
hash1 ==hash2
```

Same bucket.

Now equals() will be called.

---

## 11. Which equals() Gets Called?

HashSet internally does:

```java
existingObject.equals(newObject);
```

Now JVM checks actual runtime type.

If object is String:

```java
String.equals()
```

runs.

---

If object is Employee:

```java
Employee.equals()
```

runs.

---

If Employee has not overridden equals():

```java
Object.equals()
```

runs.

---

## 12. Important Confusion Clear

Suppose:

```java
Employee e1 = new Employee();
Employee e2 = new Employee();
```

Assume:

```java
e1.hashCode() ==e2.

hashCode()
```

(Hash Collision)

HashSet now calls:

```java
e1.equals(e2);
```

If Employee has NOT overridden equals:

```java
Object.equals()
```

runs.

Which means:

```java
return(this==obj);
```

Check becomes:

```java
e1 ==e2
```

Output:

```java
false
```

Therefore HashSet stores both objects.

---

## 13. Custom equals() Example

```java
class Employee {

    int id;

    @Override
    public boolean equals(Object obj) {

        Employee e = (Employee) obj;

        return this.id == e.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
```

Now:

```java
Employee e1 = new Employee(101);
Employee e2 = new Employee(101);

System.out.

println(e1.equals(e2));
```

Output:

```java
true
```

Because ids same.

---

## 14. Why Override hashCode() with equals()?

Wrong:

```java

@Override
public boolean equals(Object obj) {
    return id == ((Employee) obj).id;
}
```

But NO hashCode override.

Problem:

```java
e1.equals(e2) ==true
```

But

```java
e1.hashCode() !=e2.

hashCode()
```

Possible.

Then HashSet/HashMap break logically.

---

Correct:

```java

@Override
public boolean equals(Object obj) {
    return id == ((Employee) obj).id;
}

@Override
public int hashCode() {
    return id;
}
```

---

## Ultimate Interview Lines

==

```text
Reference comparison
```

Object.equals()

```text
Reference comparison
```

String.equals()

```text
Content comparison
```

Object.hashCode()

```text
Identity based hash
```

String.hashCode()

```text
Content based hash
```

HashSet

```text
hashCode() -> Find Bucket
equals()   -> Verify Equality
```

Golden Line:

hashCode() decides:

```text
WHERE to search
```

equals() decides:

```text
WHETHER objects are equal
```