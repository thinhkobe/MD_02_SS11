package ra.baitap.bai4;

import java.util.ArrayList;

public class collectionString {
    public static void main(String[] args) {
        String a ="Rekkei Academy để nông dân biết code";
        String[] strings=a.split("\\s");
        ArrayList<String> b=new ArrayList<>();

        for (String string : strings) {
            if (string.length()>3){
                b.add(string);
            }
        }
        ArrayList<String> c=new ArrayList<>();

        for (String s : b) {
            if (s.length()>4){
                c.add(s);
            }
        }
        System.out.println("mảng kí tự lớn hơn 3 "+b);
        System.out.println("mảng chữ có kí tự lớn hơn 4"+c);
    }
}
