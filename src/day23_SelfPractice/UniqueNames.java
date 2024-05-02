package day23_SelfPractice;

import java.util.ArrayList;

public class UniqueNames {
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

        for (String eachName : names) {
            if(names.indexOf(eachName)==names.lastIndexOf(eachName)){
                System.out.println(eachName);
            }
        }









    }
}
