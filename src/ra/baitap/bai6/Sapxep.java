package ra.baitap.bai6;

import java.util.ArrayList;
import java.util.List;

public class Sapxep {
    public static void main(String[] args) {
        List<Integer> randomIntegerList = new ArrayList<>();

        creatArray(randomIntegerList);
        System.out.println("chuỗi chưa sắp xếp"+randomIntegerList);
        sortArray(randomIntegerList);
        System.out.println("chuỗi đã sắp xếp"+randomIntegerList);
    }

    //phương thức sắp xếp lại mảng
    private static void sortArray(List<Integer> randomIntegerList) {
        for (int i = 0; i < randomIntegerList.size()-1; i++) {
            for (int j = i+1; j < randomIntegerList.size(); j++) {
                int N=0;
                if(randomIntegerList.get(i)< randomIntegerList.get(j)){
                    N= randomIntegerList.get(j);
                    randomIntegerList.set(j, randomIntegerList.get(i));
                    randomIntegerList.set(i,N);
                }
            }
        }
    }
    //phương thức tạo mảng
    private static void creatArray(List<Integer> randomIntegerList) {
        for (int i = 0; i < 10; i++) {
            int randomNumber=(int)(Math.random()*10)+1;
            randomIntegerList.add(randomNumber);

        }
    }
}
