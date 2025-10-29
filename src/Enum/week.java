package Enum;


enum week {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday,Sunday;


    public static void main(String[] args) {

        week day = week.Monday;
        switch (day){
            case Sunday: {
                System.out.println("Today is Weekend");
                break;
            }
            case Saturday: {
                System.out.println("Today is Weekend");
                break;
            }
            default : {
                System.out.println("Today is MidWeek");
                break;
            }
        }
        /*
        String day = "Monday";

        if (day.equals("Monday")) {
            System.out.println("Today is " + day);
        } else if (day.equals("Tuesday")) {
            System.out.println("Today is " + day);
        } else if (day.equals("Wednesday")) {
            System.out.println("Today is " + day);
        } else if (day.equals("Thursday")) {
            System.out.println("Today is " + day);
        } else if (day.equals("Friday")) {
            System.out.println("Today is " + day);
        } else if (day.equals("Saturday")) {
            System.out.println("Today is " + day);
        } else {
            System.out.println("Not a valid day!");
        }
         */
    }
}
