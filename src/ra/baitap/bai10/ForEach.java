package ra.baitap.bai10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        creatArray(arrayList);
        System.out.println("Mảng số: " + arrayList);
        int sum = sumArr(arrayList);
        System.out.println("Tổng các phần tử trong mảng: " + sum);
    }

    private static Integer sumArr(List<Integer> array) {
//        Integer sum=0;
//        array.forEach(number ->sum+=number);
//        return sum
        AtomicInteger sum = new AtomicInteger();
        array.forEach(element -> sum.addAndGet(element));
        return sum.get();
    }

    private static void creatArray(ArrayList<Integer> randomIntegerList) {
        for (int i = 0; i < 11; i++) {
            int randomNumber = (int) (Math.random() * 10) + 1;
            randomIntegerList.add(randomNumber);
        }
    }
}
