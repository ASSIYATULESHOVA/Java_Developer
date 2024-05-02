package day23_SelfPractice;

import java.util.ArrayList;

public class AverageNumber {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        number.add(100);
        number.add(200);
        number.add(300);
        number.add(400);
        number.add(500);
        number.add(600);

        System.out.println(number);

        int sum = 0;

        for (Integer each : number) {
            sum += each;
        }

        System.out.println(sum);// 100+200+300+400+500+600 = 2100


            double average = sum / (double)number.size(); // 2100 / 6 = 350
        System.out.println(average);



    }
}
