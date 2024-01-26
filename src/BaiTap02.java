import java.util.Scanner;

public class BaiTap02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào bán kính đường tròn r: ");
        double r = sc.nextDouble();
        double C = 2 * Math.PI * r;
        double S = Math.PI * Math.pow(r, 2);
        // Output the result
        System.out.println("Chu vi hình tròn là: " + C);
        System.out.println("Diện tích hình tròn là: " + S + "\n");
    }
}
