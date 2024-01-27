package BaiTap;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BaiTap28_Collections {
    public static void main(String[] args) {
        System.out.println("Danh sách sau khi tạo ngẫu nhiên là: " + danhsach());
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
}
