package ra.baitap.bai2;

import java.util.ArrayList;
import java.util.List;

public class Reverce {
    public static void main(String[] args) {
        //tạo ra một danh sách ngẫu nhiên 10 sô
        List<Integer> randomIntegerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNumber=(int)(Math.random()*10)+1;
            randomIntegerList.add(randomNumber);

        }
        System.out.println("danh sách trước khi đảo ngược"+randomIntegerList);
    //đảo ngược chuỗi với for
        List<Integer> reverceList = new ArrayList<>();

        for (int i = 0; i < randomIntegerList.size(); i++) {
            reverceList.add(i,randomIntegerList.get(randomIntegerList.size()-1-i));
        }
        System.out.println("danh sách sau khi đảo ngược"+reverceList);
    }
}
