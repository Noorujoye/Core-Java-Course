public class StringsExample {
    public static void main(String[] args) {
        String firstName = "Noorain";
        String secondName = "Warsi";
//        String concatination
        System.out.println("FullName is :" + firstName + " " + secondName);
        System.out.println("FullName is :" + firstName.concat(secondName));

//Strings - Special Characters

//        String txt = "We are the so-called "Vikings" from the north.";
        String ttxt = "We are the so-called \'Vikings\' from the north.";
        String txxt = "We are the so-called \"Vikings\" from the north.";
        String txtt = "We are the so-called //Vikings from the north.";
        String newLine= "We are the so-called \n Vikings from the north.";
        String Carriage_return = "We are the so-called\rVikings from the north.";
        String tab = "We are the so-called \t Vikings from the north.";
//        String form_feed = "We are the so-called \f Vikings from the north.";
        String Backspace = "We are the so-called\bVikings from the north.";



        System.out.println(ttxt);
        System.out.println(txxt);
        System.out.println(txtt);
        System.out.println(newLine);
        System.out.println(Carriage_return);
        System.out.println(tab);
        System.out.println(Backspace);

        int x = 10;
        int y = 20;
        int z = 13;
        int randomNumber = (int)(Math.random()*101);
        System.out.println(Math.max(x, y));
        System.out.println(Math.min(x, y));
        System.out.println(Math.sqrt(y));
        System.out.println(Math.sqrt(x));
        System.out.println(Math.abs(z));
        System.out.println(Math.random());

    }

}
