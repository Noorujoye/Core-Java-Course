import java.lang.Runnable;
class NumberAndLetters implements Runnable {
    private String taskName;

    NumberAndLetters(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        if (taskName.equals("Numbers")) {
            for (int i=1; i<=5; i++) {
                System.out.println(i);
            }
        } else if (taskName.equals("Letters")) {
            for (char i='A'; i<='E'; i++) {
                System.out.println(i);
            }
        }
    }


}
public class NumLetthers {

    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberAndLetters("Numbers"));
        Thread t2 = new Thread(new NumberAndLetters("Letters"));

        t1.start();
        t2.start();
    }
}