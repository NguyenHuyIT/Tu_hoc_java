package BaiHoc.Basic;

import java.util.Arrays;
import java.util.Scanner;

public class Bai27_VanDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào số phần tử tối đa của mảng: ");
        int n = sc.nextInt();
        //tạo mảng có n phần tử
        int[] arr_n = new int[n];
        //Nhập dữ liệu cho tưng phần tử
        for (int i = 0; i < n; i++) {
            System.out.printf("M[%s] = ", i);
            arr_n[i] = sc.nextInt();
        }
        //Xuất mảng
        for(int i = 0; i < n; i++){
            System.out.print(arr_n[i] + "\t");
        }
        System.out.println(Arrays.toString(arr_n));
    }
}
