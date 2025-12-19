package DSA.Hashing.Map;

import java.util.HashMap;

public class JourneyOfCities {
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String,String > reverseMap = new HashMap<>();

        for (String key : tickets.keySet()) {
            reverseMap.put(tickets.get(key),key);
        }
        //loop to find start which is available in "from" but not in "TO"
        for (String key : tickets.keySet()) {
            if (!reverseMap.containsKey(key)) {
                return key; // this is my starting point
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");
        String start = getStart(tickets);
        System.out.print(start);
        for (String key : tickets.keySet()) {
            System.out.println("->" + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();

    }
}
