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
        String s5 = "tôi đi tìm tôi";
        System.out.println(s5.indexOf("tôi"));

        //6. IndexOf: Kiểm tra vị trí xuất hiện cuối cùng của ký tự hoặc chuỗi
        // Trả về -1 nếu không  tìm thấy
        System.out.println(s5.lastIndexOf("tôi"));

        //7. contains: Kiểm tra chuỗi con
        String s7 = ".mp3";
        String s72 = "tuhoc.mp3";
        //Kiểm tra s62 có chứa cụm String của s6 không?
        boolean check = s72.contains(s7);
        if (check) {
            System.out.println("Chuỗi con");
        } else {
            System.out.println("Chuỗi không con");
        }

        //8. Substring: trích lộc chuỗi con từ chuỗi ban đầu
        // Substring(int beginIndex): Trích lộc đầu cuối cùng
        // Substring(int beginIndex, int endIndex): Trích lộc giá trị đầu và giá trị cuối cùng
        String s8 = "abcdefg";
        String s81 = s8.substring(2);
        System.out.println(s8);
        System.out.println(s81);
        String s82 = s8.substring(2, 7);
        System.out.println(s82);

        //9. replace("str old", "str new"): Thay thế chuỗi
        String s9 = "tôi đi tìm tôi";
        String s91 = s9.replace("tôi", "bạn");
        System.out.println(s9);
        System.out.println(s91);

        //10. replaceFirst("str old", "str new"): Thay thế đầu tiên
        String s10 = s9.replaceFirst("tôi", "bạn");
        System.out.println(s9);
        System.out.println(s10);

        //11. trim(): Xóa khoảng trắng\
        String s11 = "                          tôi đi tìm tôi                            ";
        String s111 = s11.trim();
        System.out.println(s11);
        System.out.println(s111);

        //12. trim(): Xóa toàn bộ khoảng trắng ở cuối
        //cách 1: biểu thức chính quy (regular expression)
        //dùng \s+$ để xóa tất cả các khoảng trắng ở cuối chuỗi
        String s12 = s11.replaceAll("\\s+$", "");
        System.out.println(s11);
        System.out.println(s11.length());
        System.out.println(s12);
        System.out.println(s12.length());

        //cách 2: Xoá khoảng trắng cuối chuổi bằng vòng lặp
        String s13 = "                          tôi đi tìm tôi                            ";
        while(s13.endsWith(" ")) {
            s13 = s13.substring(0, s13.length() - 1);
        }
        System.out.println(s13);

        //13. trim(): Xóa toàn bộ khoảng trắng ở đầu
        //cách 1: biểu thức chính quy (regular expression)
        //dùng ^\\s+$ để xóa tất cả các khoảng trắng ở đầu chuỗi
        String s14 = "                          tôi đi tìm tôi                            ";
        String s15 =s14.replaceFirst( "^\\s+","");
        System.out.println(s14);
        System.out.println(s15);

        //cách 2: Xoá khoảng trắng đầu chuổi bằng vòng lặp
        String s16 = "                          tôi đi tìm tôi                            ";
        while(s16.startsWith(" ")) {
            s16 = s16.substring(1);
        }
        System.out.println(s16);
    }
}
