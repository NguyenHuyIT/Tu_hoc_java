package BaiTap;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BaiTap29_Collections {
    public static void main(String[] args) {
        System.out.println("Danh sách sau khi bình phương là: " + danhsachbinhphuong());
    }

    static ArrayList<Integer> danhsach(){
        System.out.print("Nhập vào số phần tử muốn tạo: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();
        System.out.print("Mời nhập vào phần tử: ");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            lst.add(element);
        }
        return lst;
    }

    static ArrayList<Integer> danhsachbinhphuong(){
        ArrayList<Integer> lst = danhsach();
        System.out.println("Danh sách trước khi bình phương là: " + lst);
        ArrayList<Integer> lst2 = new ArrayList<>();
        for(int value : lst){
            lst2.add((int) Math.pow(value, 2));
        }
        return lst2;
    }
}
