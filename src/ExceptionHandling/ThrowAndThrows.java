package ExceptionHandling;

class Demo{
    public void show() throws ClassNotFoundException {
        Class.forName("calc");
    }
}
public class ThrowAndThrows {
    public static void main(String[] args) {
        Demo a = new Demo();
        try {
            a.show();
        }catch (ClassNotFoundException e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}









