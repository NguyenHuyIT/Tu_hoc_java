package BaiTap;

public class BaiTap24_String {
    /*  Viết chương trình trích lọc string từ đường dẫn D:/galailaptrinh/music/remix.mp3
    1, tách tên tệp bao gồm cả đuôi : remix.mp3
     2, tách tên file : remix
     */
    public static void main(String[] args) {
        String filelocation = "D:/galailaptrinh/music/remix.mp3";
        String allnamefile = filelocation.substring(filelocation.lastIndexOf("/") + 1);
        String namefile = allnamefile.substring(0, allnamefile.lastIndexOf("."));
        System.out.println("Tên tệp bao gồm cả đuôi: " + allnamefile);
        System.out.println("Tên file: " + namefile);
    }
}
