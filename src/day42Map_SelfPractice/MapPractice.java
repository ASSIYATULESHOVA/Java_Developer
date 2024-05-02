package day42Map_SelfPractice;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Asiya",28);
        map.put("Moldir", 29);
        map.put("David",35);

        System.out.println(map);

        System.out.println("----------------------------------------------");

        Map<String, Object> personInfo = new LinkedHashMap<>();

        personInfo.put("name", "Asiya");
        personInfo.put("age", 28);
        personInfo.put("gender",'F');
        personInfo.put("job_title","Developer");
        personInfo.put("salary",120000);

        System.out.println(personInfo);

        System.out.println("----------------------------------------------");

        Map<String , Character> nameGender = new TreeMap<>();
        nameGender.put("Molly",'F');
        nameGender.put("Asiya",'F');
        nameGender.put("David", 'M');
        nameGender.put("Katya",'F');
        nameGender.put("Aaron", 'M');

        System.out.println(nameGender);

        System.out.println("-----------------------------------------------");

        Map<String , Long> nameCell = new Hashtable<>();

        nameCell.put("Asiya", 9293857503L);

        System.out.println(nameCell);











    }
}
