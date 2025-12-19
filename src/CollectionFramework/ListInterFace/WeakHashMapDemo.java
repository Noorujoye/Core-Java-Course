package CollectionFramework.ListInterFace;

import java.util.WeakHashMap;
import java.util.concurrent.TransferQueue;

class Image {
    String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class WeakHashMapDemo {
    private static void simulateApplicationRunning() {
        try {
             System.out.println("simulating....");
             Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

    }
    public static void main(String[] args) {
        WeakHashMap<String,Image> imageCache = new WeakHashMap<>();
        imageCache.put("img1" , new Image("Image 1"));
        imageCache.put("img2" , new Image("image 2"));
        System.out.println(imageCache);
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after running : " + imageCache);

    }
}


// see strong reference yani ki new keyword okk

//ab upar mein dekh jo key hai wo ek string literal jo ki strong reference hot  h.qwertwuop[
// a
//
//img hai, agr wo key strong refernce nhi hoti toh jvm remove krdeta value ko , mtlb humne sleep ke baad garbage collector chalaya fir bhi nhi hua kyku string lieteral tha