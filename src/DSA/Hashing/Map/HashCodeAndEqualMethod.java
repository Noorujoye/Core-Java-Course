package DSA.Hashing.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class person {
    private String name;
    private int id;

    public person(String name , int id) {
        this.name= name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name   ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        person other = (person) obj;
        return id == other.getId() && Objects.equals(name , other.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name , id);
    }
//    What this does internally:
//    Converts name + id into a single integer
//    Used to choose bucket index
}

public class HashCodeAndEqualMethod {
    public static void main(String[] args) {

        HashMap<person , String> map = new HashMap<>();
        person p1 = new person("Noorain",1);
        person p2 = new person("Shama" , 2);
        person p3 = new person("Noorain" , 1);


        map.put(p1,"Engineer"); //hashCode1 --> index1
        map.put(p2, "designer"); //hashCode2 --> index2
        map.put(p3 , "Manager"); //hashCode1 --> index1 --> replace because key are same
        System.out.println("Map size: " + 2);
        System.out.println("value for p1 : "+ map.get(p1));
        System.out.println("value for p3 : "+ map.get(p3));


        // name , marks
        Map<String , Integer> map1 = new HashMap<>();
        map1.put("Virat" , 90); //hashcode --> index
        map1.put("rohit" , 85); //hashcode --> index
        map1.put("virat" , 99);
    }
}
