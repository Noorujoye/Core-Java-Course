package OOPS.InterfacesAndAbstraction;

interface Grandma{
    void stories();
}
class Father implements Grandma{
    public void stories(){
        System.out.println("Johnny Johnny yes papa");
    }
}
class Mother implements Grandma{
    public void stories() {
        System.out.println("Twinkle Twinkle Little Star");
    }
}
class Child{
    public void stories(Grandma fStories){
        fStories.stories();
    }
}
public class Main {
    public static void main(String[] args) {

        Grandma fStories = new Father();
        Grandma mStories = new Mother();
        Child boy = new Child();
        boy.stories(fStories);

    }
}
