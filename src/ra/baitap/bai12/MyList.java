package ra.baitap.bai12;

import java.util.Arrays;

public class MyList<E> {
    private static final int INITIAL_CAPACITY = 10;
    private E[] elements;
    private int size;

    // Constructor mặc định
    public MyList() {
        this.elements = (E[]) new Object[INITIAL_CAPACITY]; // Ép kiểu để tạo mảng đối tượng
        this.size = 0;
    }

    // Phương thức để thêm một phần tử vào danh sách
    public void add(E element) {
        ensureCapacity();
        elements[size++] = element;
    }

    // Phương thức để lấy phần tử tại một index cho trước
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return elements[index];
    }

    // Phương thức để lấy kích thước của danh sách
    public int size() {
        return size;
    }

    // Phương thức để đảm bảo rằng mảng có đủ dung lượng để thêm phần tử mới
    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, 2 * size);
        }
    }

    // Phương thức để in danh sách
    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
    // Phương thức để xóa một phần tử tại một index cho trước
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        // Di chuyển các phần tử bên phải của index lên một vị trí
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
    }

    // Phương thức kiểm tra xem phần tử có tồn tại trong danh sách không
    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    // Phương thức để lấy index của một phần tử trong danh sách
    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1; // Trả về -1 nếu phần tử không tồn tại trong danh sách
    }
}
