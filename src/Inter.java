public interface Inter {
    void show();

    default void showName() {
        System.out.println("my name is noorain....");
    }
}
