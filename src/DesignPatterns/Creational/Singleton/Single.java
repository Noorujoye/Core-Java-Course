package DesignPatterns.Creational.Singleton;

public final class Single {
    /*
    static instance belongs to the class, not to an object.
    Since no object exists initially, the Singleton reference
    must be static so it can be accessed through getInstance().

    volatile prevents instruction reordering and ensures
    visibility of changes across threads.
     */
    private static volatile Single instance;

    // prevents normal multiple instantiation
    // and some reflection-based attacks after instance creation.
    private Single() {
        if (instance != null) {
            throw new RuntimeException("use getInstance method");
        }
    }

    // no clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    // call this , only one way to get
    public static Single getInstance() {
        //    synchronized (single) { // here null pointer excetpion because we not have object
        if (instance == null) {
            synchronized (Single.class) {
                if (instance == null) {
                    instance = new Single();
                    return instance;
                }
            }
        }
        return instance;
    }

    public void show() {
        System.out.println("Object created " + this.hashCode());
    }
}
