import java.util.Scanner;

public class BaiTap10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào điểm trung bình: ");
        double dtb = sc.nextDouble();
        String xeploai = (dtb >= 8.0) ? "Giỏi" : (dtb >= 6.5) ? "Khá" : (dtb >= 5.0) ? "Trung bình" : "Yếu";
        System.out.print(xeploai);
        sc.close();
    }
}
