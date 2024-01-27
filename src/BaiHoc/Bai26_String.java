package BaiHoc;

public class Bai26_String {
    public static void main(String[] args) {
        String s = "Hồi đó tôi chê mồm em rộng" +
                "\nKhông tin hai đứa chập mồm đo";
        System.out.println(s);

        // Khai báo đối tượng st
        StringBuilder st = new StringBuilder();
        // Các phương thức thường dùng

        //1. append: Thêm vào cuối chuỗi
        st.append("Xin chào, ");
        st.append("tôi chê mồm em rộng ");
        System.out.println(st);

        //2. insert(vị trí index, chuỗi cần chèn): Thêm trong chữa chuỗi
        st.insert(10, "Xin chào, ");
        System.out.println(st);

        //3. delete(start, end): Xóa chuỗi
        st.delete(2, 7);
        System.out.println(st);

        //4. st.length: trả về độ dài của chuỗi tính cả space
        System.out.println(st.length());

        //5. IndexOf: Kiểm tra vị trí xuất hiện đầu tiên của ký tự hoặc chuỗi
        // Trả về -1 nếu không  tìm thấy
        String s2 = "tôi đi tìm tôi";
        System.out.println(s2.indexOf("tôi"));

        //6. IndexOf: Kiểm tra vị trí xuất hiện cuối cùng của ký tự hoặc chuỗi
        // Trả về -1 nếu không  tìm thấy
        System.out.println(s2.lastIndexOf("tôi"));

        //7. contains: Kiểm tra chuỗi con
        String s3 = ".mp3";
        String s4 = "tuhoc.mp3";
        //Kiểm tra s62 có chứa cụm String của s6 không?
        boolean check = s4.contains(s3);
        if (check) {
            System.out.println("Chuỗi con");
        } else {
            System.out.println("Chuỗi không con");
        }

        //8. Substring: trích lộc chuỗi con từ chuỗi ban đầu
        // Substring(int beginIndex): Trích lộc đầu cuối cùng
        // Substring(int beginIndex, int endIndex): Trích lộc giá trị đầu và giá trị cuối cùng
        String s5 = "abcdefg";
        String s6 = s5.substring(2);
        System.out.println(s5);
        System.out.println(s6);
        String s7 = s5.substring(2, 7);
        System.out.println(s7);

        //9. replace("str old", "str new"): Thay thế chuỗi
        String s8 = "tôi đi tìm tôi";
        String s9 = s8.replace("tôi", "bạn");
        System.out.println(s8);
        System.out.println(s9);

        //10. replaceFirst("str old", "str new"): Thay thế đầu tiên
        String s10 = s8.replaceFirst("tôi", "bạn");
        System.out.println(s8);
        System.out.println(s10);

        //11. trim(): Xóa khoảng trắng\
        String s11 = "                          tôi đi tìm tôi                            ";
        String s12 = s11.trim();
        System.out.println(s11);
        System.out.println(s12);

        //12. trim(): Xóa toàn bộ khoảng trắng ở cuối
        //cách 1: biểu thức chính quy (regular expression)
        //dùng \s+$ để xóa tất cả các khoảng trắng ở cuối chuỗi
        String s13 = s11.replaceAll("\\s+$", "");
        System.out.println(s11);
        System.out.println(s11.length());
        System.out.println(s13);
        System.out.println(s13.length());

        //cách 2: Xoá khoảng trắng cuối chuổi bằng vòng lặp
        String s14 = "                          tôi đi tìm tôi                            ";
        while(s14.endsWith(" ")) {
            s14 = s14.substring(0, s14.length() - 1);
        }
        System.out.println(s13);

        //13. trim(): Xóa toàn bộ khoảng trắng ở đầu
        //cách 1: biểu thức chính quy (regular expression)
        //dùng ^\\s+$ để xóa tất cả các khoảng trắng ở đầu chuỗi
        String s15 = "                          tôi đi tìm tôi                            ";
        String s16 =s15.replaceFirst( "^\\s+","");
        System.out.println(s15);
        System.out.println(s16);

        //cách 2: Xoá khoảng trắng đầu chuổi bằng vòng lặp
        String s17 = "                          tôi đi tìm tôi                            ";
        while(s17.startsWith(" ")) {
            s17 = s17.substring(1);
        }
        System.out.println(s17);

        //14. split(): Tách chuỗi
        String s18 = "Hello world";
        String[] arr = s18.split(" ");
        //duyệt mảng
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //15. toLowcase() && toUpperCase()
        String s19 = "Tôi học lập trình tại tuhoc.cc";
        String s20 = s19.toLowerCase();
        System.out.println(s20);
        String s21 = s19.toUpperCase();
        System.out.println(s21);

        //16. toCharArray(): Tách chuỗi thành từng ký tự, cho vào mảng
        String s22 = "abcdefg123@";
        char[] arr2 = s22.toCharArray();
        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        //17. reverse(): Đảo nguồi chuỗi
        String s23 = "abcdefg";
        //Khai báo đối tượng thuộc class StringBuilder
        StringBuilder sb = new StringBuilder(s23);
        sb.reverse();
        String s24 = sb.toString();
        System.out.println(s24);
    }
}
