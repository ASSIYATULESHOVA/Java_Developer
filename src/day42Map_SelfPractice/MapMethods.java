package day42Map_SelfPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {


        Map<String, Object> personInfo = new LinkedHashMap<>();

        personInfo.put("name", "Asiya");
        personInfo.put("age", 28);
        personInfo.put("gender",'F');
        personInfo.put("job_title","Developer");
        personInfo.put("salary",120000);

      //  System.out.println(personInfo);

        System.out.println(personInfo.size()); //5

        System.out.println("---------------------------------------------------");

        System.out.println(personInfo.get("salary")); // get method   120000
        System.out.println(personInfo.get("age")); // 28

        System.out.println("---------------------------------------------------");

       personInfo.replace("age",30);

        System.out.println(personInfo);

        System.out.println("---------------------------------------------------");

        System.out.println(personInfo);

     //   personInfo.remove("salary");
       // System.out.println(personInfo);

        System.out.println("---------------------------------------------------");

     boolean r1 = personInfo.containsKey("name");
     boolean r2 = personInfo.containsValue("company");

        System.out.println(r1);  //true
        System.out.println(r2);   // false

        System.out.println("---------------------------------------------------");

       // System.out.println(personInfo.isEmpty()); //false
      //  personInfo.clear();
       // System.out.println(personInfo.isEmpty()); //true

        for (String eachKey : personInfo.keySet()) {
            System.out.println(eachKey);
        }

        System.out.println("---------------------------------------------------");

        for (Object eachValue : personInfo.values()) {
            System.out.println(eachValue);
        }

        System.out.println("---------------------------------------------------");

        for (Map.Entry<String, Object> eachEntry : personInfo.entrySet()) {
           // System.out.println(eachEntry);
            System.out.println(eachEntry.getKey()+" : "+eachEntry.getValue());

            if(eachEntry.getKey().equals("salary")){
                eachEntry.setValue(2000000);
            }

        }
        System.out.println(personInfo);
    }
}
