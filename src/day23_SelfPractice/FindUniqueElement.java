package day23_SelfPractice;

import java.util.ArrayList;

public class FindUniqueElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>() ;

        list.add(11);
        list.add(11);
        list.add(9);
        list.add(12);
        list.add(12);
        list.add(10);
        list.add(13);
        list.add(14);
        list.add(14);

        System.out.println(list);  list.add(11);

        for (Integer element : list) {

            int frequency = 0;
            for (Integer each : list) {
                if(element == each){
                    frequency++;
                }
            }
            if(frequency==1){
                System.out.println(element);
            }

        }









    }
}
