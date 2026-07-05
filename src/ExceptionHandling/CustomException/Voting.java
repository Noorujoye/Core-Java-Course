package ExceptionHandling.CustomException;

public class Voting {
    int age;

    Voting(int age) {
        this.age = age;
    }

    public static void isVoteable(int age) {
        try {
            if (age < 18) {
                throw new InvalidAgeException("Not Eligible...");
            }
        } catch (InvalidAgeException i) {
            System.out.println(i.getMessage());
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void main(String[] args) {
        isVoteable(-4);
    }
}
