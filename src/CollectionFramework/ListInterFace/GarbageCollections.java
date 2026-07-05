package CollectionFramework.ListInterFace;

import java.lang.ref.WeakReference;

class Phone {
    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

public class GarbageCollections {

    public static void main(String[] args) {

        //strong refernce
//        Phone phone = new Phone("Apple" , "15 pro");
//        System.out.println(phone);
//        phone = null;
//        System.out.println(phone);

        //weak reference
        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Apple", "15 pro max"));
        System.out.println(phoneWeakReference.get());
        System.gc();

        try {
            Thread.sleep(10000);

        } catch (Exception ignored) {

        }
        System.out.println(phoneWeakReference.get());
    }
}
