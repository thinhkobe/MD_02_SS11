package ra.baitap.bai12;

public class MyListTest {
    public static void main(String[] args) {

        // Kiểm thử lớp MyList
        MyList<Double> myList = new MyList();

        // Thêm phần tử vào danh sách
        myList.add(1.0);
        myList.add(3.14);

        // In danh sách
        System.out.println("Danh sách ban đầu:");
        myList.printList();

        // Lấy phần tử theo index
        System.out.println("Phần tử tại index 1: " + myList.get(1));

        // In kích thước danh sách
        System.out.println("Kích thước danh sách: " + myList.size());
    }
}



