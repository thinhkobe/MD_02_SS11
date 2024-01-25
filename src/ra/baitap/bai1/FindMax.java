package ra.baitap.bai1;

import java.util.*;

public class FindMax {
    //viết chương trình in ra 10 phần tử
    public static void main(String[] args) {

        List<Integer> randomIntegerList = new ArrayList<>();




        for (int i = 0; i < 10; i++) {
            int randomNumber=(int)(Math.random()*10)+1;
            randomIntegerList.add(randomNumber);

        }
        System.out.println(randomIntegerList);

        System.out.println(Collections.max(randomIntegerList));

    }
}
