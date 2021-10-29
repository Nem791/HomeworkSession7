import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class Cau2 {
    public void formatString() {
//        Câu 2
//        Viết chương trình thực hiện:
//
//        Nhập chuỗi là tên của bạn, tiến hành chuẩn hóa chuỗi đó
//        Nhập vào chuỗi bất kỳ, kiểm tra xem chuỗi đó có là chuỗi palindrome không

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String name = sc.nextLine();
        String fixName = name.trim().toLowerCase();
        fixName = fixName.replaceAll("\\s+", " ");
        String[] tempArray = fixName.split(" ");
        String temp = "";
        for (int i = 0; i < tempArray.length; i++) {
            temp += String.valueOf(tempArray[i].charAt(0)).toUpperCase() + tempArray[i].substring(1);
            temp += " ";
        }
        System.out.println(temp);
    }

    public String palindromeString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String name = sc.nextLine();
        int temp = 0;

        for (int i = 0; i < name.length() / 2; i++) {
            if (name.charAt(i) == name.charAt(name.length() - 1 - temp)) {
                System.out.println("");
            } else {
                return "Day ko phai chuoi palindrome";
            }
            temp++;
        }
        return "Day la chuoi palindrome";
    }
}
