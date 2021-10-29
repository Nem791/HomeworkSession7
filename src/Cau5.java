import java.util.Random;

public class Cau5 {
    public void checkPrime(int min, int max) {
        Random random = new Random();
        int number = random.nextInt(max - min) + min;
        System.out.println("So ngau nhien: " + number);
        if (number == 2) {
            System.out.println("Day la so nguyen to");
        } else if (number < 2) {
            System.out.println("Day ko phai so nguyen to");
        } else {
            int n = 0;
            for (int j = 2; j <= Math.sqrt(number) ; j++) {
                if (number % j == 0) {
                    n++;
                }
            }
            if (n == 0) {
                System.out.println("Day la so nguyen to");
            } else {
                System.out.println("Day ko phai so nguyen to");
            }
        }
    }
}
