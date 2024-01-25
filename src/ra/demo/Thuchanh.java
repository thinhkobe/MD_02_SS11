package ra.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Thuchanh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //đếm số từ được nhập vào từ người dùng có ở trong đoạn văn
        String paragraph="đếm số từ được nhập vào từ người dùng có ở trong đoạn văn";
        char[] arr=paragraph.toCharArray();
        //tạo một collection
        List<Character> chars = new ArrayList<>() ;
        for (int i = 0; i < arr.length; i++) {
            chars.add(arr[i]);
        }
        System.out.println("mảng cần đếm "+chars);

        System.out.println("nhập từ cần đếm");
        char key =sc.nextLine().charAt(0);
        int number=0;
        for (int i = 0; i < chars.size(); i++) {
            if (chars.get(i).equals(key)){
                number+=1;
            }
        }
        if (number==0) {
            System.out.println("không có phần tử nào giống " + key);
        }else{
            System.out.println("có " +number+"chữ "+key+"trong đoạn văn");
        }

    }
}
