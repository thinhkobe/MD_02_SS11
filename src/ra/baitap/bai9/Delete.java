package ra.baitap.bai9;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Delete {
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>();
        creatArray(arr1);
        System.out.println("trước khi xóa"+arr1);
        ArrayList<Integer> arr2 = getIntegers(arr1);
        System.out.println("mảng sau khi xóa"+arr2);
    }

   
    private static ArrayList<Integer> getIntegers(ArrayList<Integer> arr1) {
        ArrayList<Integer> arr2=new ArrayList<>();
        for (Integer integer : arr1) {
            if (!arr2.contains(integer)) {
                arr2.add(integer);
            }
        }
        return arr2;
    }

    private static void creatArray(ArrayList<Integer> randomIntegerList) {
        for (int i = 0; i < 11; i++) {
            int randomNumber=(int)(Math.random()*10)+1;
            randomIntegerList.add(randomNumber);

        }
    }
}
