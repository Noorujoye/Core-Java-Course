package DesignPatterns.Creational.Singleton;

public enum Singleton {

//    INSTANCE;
//
//    public static void main(String[] args) {
//        Singleton constructor = Singleton.INSTANCE;
    /// /        constructo
//
//        Singleton s = Singleton.INSTANCE;
//        Singleton s1 = Singleton.INSTANCE;
//        System.out.println(s == s1);
//    }


    INSTANCE;

    private int count;

    public void inc() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.INSTANCE;
        Singleton s2 = Singleton.INSTANCE;

        s1.inc();
        s2.inc();
        System.out.println(s2.getCount());
    }
}
/*
Why does an enum have a constructor if we cannot create enum objects?

Enum constructors exist to initialize enum constants.
Although programmers cannot directly create enum objects using new,
the JVM creates each enum constant and invokes the constructor exactly once during enum initialization.
-----------------------------------------------
Why can't we create an Enum object using new?
Answer:
Enum instances are created and managed exclusively by the JVM.
Java restricts explicit instantiation using new because enums represent a fixed set of predefined instances.
Allowing new would violate the enum contract and break guarantees such as singleton-like behavior, reflection safety, and serialization safety.

------------------------------------------------

package DesignPatterns.Creational.Singleton;

public enum Singleton {
    INSTANCE;
    public static void main(String[] args) {
        Singleton s = Singleton.INSTANCE;
        Singleton s1 = Singleton.INSTANCE;
        System.out.println(s == s1);
    }
}
Why is Enum Singleton considered the best Singleton implementation?
Enum Singleton is thread-safe by design, prevents reflection attacks, prevents cloning,
handles serialization automatically, and guarantees a single instance through JVM-level enforcement.


can't call the enum constrcutor directly
if new Singleton() allow kr diya toh , toh enum ka fixed constant wala purpose hi khtm ho jayega.
Enum extends Enum class internally with type of enum we declared.


 why clone fails -
 Normal singleton = super.clone -> new bject can be created
 Enum singleton = Singleton.INSATNCE.clone() -> Compiler/JVM cloning allow nahi karti.
 */
