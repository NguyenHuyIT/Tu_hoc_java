package BaiTap;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BaiTap31_Collections {
    public static void main(String[] args) {
        ArrayList<Integer> danhsach = danhsach();
        System.out.println("Danh sách sau khi tạo là: " + danhsach);
        System.out.println(sonho(danhsach));
    }

    static ArrayList<Integer> danhsach(){
        System.out.print("Nhập vào số phần tử muốn tạo: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();
        Random generator = new Random();
        for (int i = 0; i < n; i++) {
            lst.add( generator.nextInt(100) + 1);
        }
        return lst;
    }

     static String sonho(ArrayList<Integer> danhSach) {
        int count = 0;
        StringBuilder vitri = new StringBuilder();
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i) < 80) {
                count++;
                vitri.append(i).append(" ");
            }
        }
        if (count == 0) {
            return "Không có phần tử nào bé hơn 80.";
        } else {
            return "Số phần tử bé hơn 80 là: " + count + "\nVị trí của các phần tử là: " + vitri.toString().trim();
        }
    }
}
