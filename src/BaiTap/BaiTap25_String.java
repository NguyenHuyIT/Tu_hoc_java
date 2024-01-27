package BaiTap;

import java.util.Scanner;

public class BaiTap25_String {
    /*Viết chương trình kiểm tra 1 chuỗi nhập vào từ bàn phím có phải Panlyndrom
    (là chuỗi có đảo ngược cũng bằng chính nó, ví dụ madam, radar …)*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập chuỗi cần kiểm tra Panlyndrom: ");
        String panlyndrom = sc.nextLine();
        String sb = new StringBuilder(panlyndrom).reverse().toString();
        if(panlyndrom.equalsIgnoreCase(sb))
            System.out.println("Chuỗi vừa nhập là chuỗi Panlyndrom");
        else
            System.out.println("Chuỗi vừa nhập không là chuỗi Panlyndrom");
    }
}
