package BaiHoc;

import java.util.ArrayList;
import java.util.List;

public class Bai28_ArrayList {
    public static void main(String[] args) {
        //1. Khai báo list
        ArrayList<Integer> lst = new ArrayList<>();
        // Khai báo với số lượng phần tử ban đầu
        ArrayList<Integer> lst2 = new ArrayList<>(5);
        // Khởi tạo list với các phần tử ban đầu
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(12, 2, 3, 4, 5, 56));

        // Xuất list
        System.out.println(lst);
        System.out.println(lst2);
        System.out.println(lst3);

        //2. Add thêm phần tử
        ArrayList<Integer> lst4 = new ArrayList<>();
        //add phần tử
        lst4.add(7);
        System.out.println("ArrayList sau khi add là: " + lst4);

        //add (index,element) vào vị trí chỉ định
        lst4.add(1, 99);
        System.out.println("ArrayList sau khi add 99 là: " + lst4);

        //2.2 size: trả về số phần tử của list
        System.out.println("Số phần tử lst4 là: " + lst4.size());

        //2.3 get(int index): trả về giá trị list tại vị trí index
        System.out.println(lst4.get(1));

        //2.4 remove (index)
        lst4.remove(1);
        System.out.println("lst4 sau khi xóa giá trị tại vị trí index 1 là: " + lst4);

        //2.5 remove (1 phần tử chỉ định)
        ArrayList<Integer> lst5 = new ArrayList<>(List.of(12, 2, 3, 4, 5, 56));
        System.out.println("lst5 = " + lst5);
        lst5.remove(Integer.valueOf(3));
        System.out.println("lst5 sau khi xóa = " + lst5);

        //2.6 set(index, element): thay đổi thông tin
        ArrayList<Integer> lst6 = new ArrayList<>(List.of(12, 2, 3, 4, 5, 56));
        System.out.println("lst6 = " + lst6);
        lst6.set(2,99);
        System.out.println("lst6 sau khi đổi thông tin là: " + lst6);
    }
}
