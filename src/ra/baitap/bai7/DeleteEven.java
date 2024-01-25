package ra.baitap.bai7;

import java.util.ArrayList;
import java.util.List;

public class DeleteEven {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        creatArray(list);
        System.out.println("trước khi xóa"+list);
        list=delateEven(list);
        System.out.println("sau khi xoas"+list);

    }
    private static void creatArray(ArrayList<Integer> randomIntegerList) {
        for (int i = 0; i < 10; i++) {
            int randomNumber=(int)(Math.random()*10)+1;
            randomIntegerList.add(randomNumber);

        }
    }
    private static ArrayList<Integer> delateEven(ArrayList<Integer> a){
        ArrayList<Integer> rerult=new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) %2!=0){
                rerult.add(a.get(i));
            }
        }
        return  rerult;
    }
}
