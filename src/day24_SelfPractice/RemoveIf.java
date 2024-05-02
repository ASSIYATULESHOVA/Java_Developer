package day24_SelfPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIf {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>() ;

        list.addAll(Arrays.asList(25,30,35,45,50,5,55,60,65,70,80));

        list.removeIf( p -> p < 50);

        System.out.println(list);








    }
}
