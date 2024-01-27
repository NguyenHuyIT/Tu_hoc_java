package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap27_Array {
    /*1. Viết chương trình tạo 1 mảng 1 chiều gồm các phần tử là số nguyên,
        có n phần tử ngẫu nhiên, n do người dùng nhập từ bàn phím
    2. Xuất các giá trị trong mảng
    3. Đảo ngược mảng, và xuất mảng sau khi đảo ngược
    4. Sắp xếp mảng tăng dần
    5. Tính tổng các phần tử trong mảng
    6. Cho người dùng nhập 1 số bất kỳ, kiểm tra số đó có tồn tại trong mảng hay không,
        nếu có xuất ra vị trí index của số đó trong mảng    */
    public static void main(String[] args) {
        int[] ds = nhap();
        xuat(ds);
        System.out.print("Mảng sau khi đảo ngược là: ");
        daoNguoc(ds);
        Arrays.sort(ds);
        System.out.println("\nMảng sau khi sắp xếp tăng dần: " + Arrays.toString(ds));
        System.out.println("Tổng các phần tử trong mảng: " + tong(ds));
        timkiem(ds);
    }

     static int[] nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập số phần tử trong mảng: ");
        int n = sc.nextInt();
         int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.printf("arr[%s] = ", i);
            arr[i] = sc.nextInt();
        }
         return arr;
     }

     static void xuat(int[] arr){
         System.out.println("Các giá trị trong mảng: ");
        for(int i = 0; i < arr.length; i++){
            System.out.printf("arr[%s] = %s \n", i, arr[i]);
        }
     }

     static void daoNguoc(int[] arr){
         for(int i = 0, j = arr.length - 1; i < j; i++, j--){
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
         }
         System.out.print(Arrays.toString(arr));
     }

     static int tong(int[] arr){
        int sum = 0;
         for (int i = 0; i < arr.length; i++) {
             sum+=arr[i];
         }
         return sum;
     }

     static void timkiem(int[] arr){
        Scanner sc = new Scanner(System.in);
         System.out.print("Mời nhập vào số cần tìm: ");
        int index = sc.nextInt();
        for (int i = 0; i < arr.length; i++){
            if (index == arr[i]){
                System.out.println("Vị trí cần tim: " + i);
            }
        }
     }
}
