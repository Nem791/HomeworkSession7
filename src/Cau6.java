import java.util.Scanner;

public class Cau6 {
    public void checkEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap email: ");
        String email = sc.nextLine();
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        System.out.println(email.matches(regex));
    }
}
