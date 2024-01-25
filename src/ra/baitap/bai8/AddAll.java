package ra.baitap.bai8;

import java.util.ArrayList;

public class AddAll {
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>();
        creatArray(arr1);
        ArrayList<Integer> arr2=new ArrayList<>();
        creatArray(arr2);
        arr2.addAll(arr1);
        System.out.println("sau khi thêm"+arr2);
    }
    private static void creatArray(ArrayList<Integer> randomIntegerList) {
        for (int i = 0; i < 10; i++) {
            int randomNumber=(int)(Math.random()*10)+1;
            randomIntegerList.add(randomNumber);

        }
    }
}
