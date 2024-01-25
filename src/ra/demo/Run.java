package ra.demo;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;

public class Run {
    public static void main(String[] args) {
        Collection<Integer> collection =new ArrayList<>();
        //thêm mới phần tử
        collection.add(10);
        collection.add(100);
        System.out.println(collection);
        //xóa phần tử
        collection.remove(10);
        //thêm 1 danh sách

    }
}
