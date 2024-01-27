import java.util.Scanner;

public class BaiTap26_String {
    /*
    Nhập vào 1 chuỗi => Tối ưu hoá chuỗi (chuẩn hoá chuỗi) theo quy tắc :
    1, không có khoảng trắng dư thừa
    2, các từ cách nhau bởi 1 khoảng trắng
    3, Ký tự đầu tiên của mỗi từ phải được viết hoa, chữ cái phía sau viết thường
    Ví dụ : input: “ Gà lạI LẬp TRìnH ”
            Output: “Gà Lại Lập Trình”
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập chuỗi cần tối ưu hoá: ");
        String inputString = sc.nextLine().trim(); // Loại bỏ khoảng trắng ở đầu và cuối chuỗi
        String[] words = inputString.split("\\s+"); // Tách chuỗi thành mảng các từ

        StringBuilder optimizedString = new StringBuilder();

        // Duyệt qua mảng các từ
        for (String word : words) {
            // Kiểm tra xem từ có ký tự nào không
            if (!word.isEmpty()) {
                // Chuẩn hóa từ và thêm vào kết quả
                optimizedString.append(word.substring(0, 1).toUpperCase());
                optimizedString.append(word.substring(1).toLowerCase());
                optimizedString.append(" ");
            }
        }

        // Hiển thị kết quả sau khi loại bỏ khoảng trắng dư thừa ở cuối chuỗi
        System.out.println(optimizedString.toString().trim());
    }
}
