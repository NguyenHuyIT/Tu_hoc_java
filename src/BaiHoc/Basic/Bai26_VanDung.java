package BaiHoc.Basic;

import java.util.Scanner;

public class Bai26_VanDung {
    public static void main(String[] args) {
    /*
    Nhập vào 1 chuỗi từ bàn phím,
    1. đếm xem có bao nhiêu ký tự thường
    2. bao nhiêu in hoa
    3. bao nhiêu số
    4. bao nhiêu space
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào 1 chuỗi: ");
        //đọc dữ liệu và gán vào biến
        String s = sc.nextLine();
        //gán biến đếm
        int demSo = 0;
        int demInThuong = 0;
        int demInHoa = 0;
        int demSpace = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c))
                demSo++;
            if(Character.isLowerCase(c))
                demInThuong++;
            if(Character.isUpperCase(c))
                demInHoa++;
            if (Character.isWhitespace(c))
                demSpace++;
        }
        System.out.println("Số lượng ký tự số là: " + demSo);
        System.out.println("Số lượng ký tự chữ thường là: " + demInThuong);
        System.out.println("Số lượng ký tự chữ hoa là: " + demInHoa);
        System.out.println("Số lượng ký tự khoảng trắng là: " + demSpace);
    }
}
