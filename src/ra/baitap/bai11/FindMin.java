package ra.baitap.bai11;

import java.util.ArrayList;
import java.util.Collections;

public class FindMin {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        creatArray(arrayList);
        System.out.println("mang so"+arrayList);
        Integer min=Collections.min(arrayList);
        System.out.println("số nhỏ nhất :"+min);
    }
    private static void creatArray(ArrayList<Integer> randomIntegerList) {
        for (int i = 0; i < 11; i++) {
            int randomNumber = (int) (Math.random() * 10) + 1;
            randomIntegerList.add(randomNumber);
        }
    }
}
