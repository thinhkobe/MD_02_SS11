package ra.baitap.bai3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        //tạo ra một danh sách ngẫu nhiên 10 sô
        ArrayList<Integer> randomIntegerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNumber=(int)(Math.random()*10)+1;
            randomIntegerList.add(randomNumber);

        }
        System.out.println("danh sách trước khi sắp xếp"+randomIntegerList);
        Collections.sort(randomIntegerList,(a,b)->b-a);
        System.out.println("danh sách sau khi sắp xếp"+randomIntegerList);
    }
}
