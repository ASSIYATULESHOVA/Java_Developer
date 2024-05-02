package day23_SelfPractice;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>()  ;

        names.add("Asiyah");      //0
        names.add("Michelle");    //1
        names.add("Moldir");     //2
        names.add("Michelle");    //3
        names.add("Rustam");     //4
        names.add("Moldir");    //5
        names.add("Madina");   //6
        names.add("Moldir");    //7

        ArrayList<String> nonDup = new ArrayList<>();

        for (String each : names) {

            if(nonDup.contains(each)){
                continue;
            }
            nonDup.add(each);
        }

        System.out.println(nonDup);
    }
}
