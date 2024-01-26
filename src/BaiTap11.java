import java.util.Scanner;

public class BaiTap11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Mời bấm số để chọn:\s
                1. tìm theo tên\s
                2. tìm theo tác giả\s
                3. tìm theo nhà xuất bản\s
                4. tìm theo tiêu đề\s
                """);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Tìm theo tên");
                break;
            case 2:
                System.out.println("Tìm theo tác giả");
                break;
            case 3:
                System.out.println("Tìm theo nhà xuất bản");
                break;
            case 4:
                System.out.println("Tìm theo tiêu đề");
                break;
            default:
                System.out.println("Phím bấm không hợp lệ");
                break;
        }
    }
}
