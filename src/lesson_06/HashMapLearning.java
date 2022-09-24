package lesson_06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLearning {
    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113, "CSCD");
        emergencyList.put(115, "Cuu Hoa");
        emergencyList.put(116, "Others");
        //System.out.println(emergencyList.get(113));
        Set<Integer> allKeys = emergencyList.keySet();
        //loop all key
        //emergencyList.replace(116, "ABC");
       // emergencyList.replace(116, "Others", "ABE");

        for (Integer key : allKeys){
            emergencyList.remove(key, "Others");


            /*if(emergencyList.get(key).equals("Others")){
                emergencyList.remove(key);
            }*/
        }
        for (Integer key : allKeys){
            System.out.println(emergencyList.get(key));
        }
        System.out.println(emergencyList.containsValue(new String("Others")));
        System.out.println(emergencyList.containsKey(116));
        emergencyList.size();
        emergencyList.isEmpty();

    }
}
