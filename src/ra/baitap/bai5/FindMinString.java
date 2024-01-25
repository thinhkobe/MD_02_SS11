package ra.baitap.bai5;

import java.util.ArrayList;
import java.util.Collections;

public class FindMinString {
    public static void main(String[] args) {
        String a="Viết chương trình cho sẵn một đoạn văn hoặc một câu, và tìm ra chữ ngắn nhất (ít ký tự nhất) trong câu";
        String[] arr=a.split("\\s");

        ArrayList<String> stringArrayList=new ArrayList<>();
        Collections.addAll(stringArrayList, arr);
        String minString= stringArrayList.get(0);

        for (String string : stringArrayList) {

            if (string.length()<minString.length()){
                minString=string;
            }
        }
        System.out.println("chỗi ngắn nhất là :"+minString);
    }
}
