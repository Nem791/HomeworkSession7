public class Cau3 {
    public void primeNumber(int limit) {
        int temp = 0;
        int i = 2;
        while (temp != 10) {
            if (i == 2) {
                System.out.println(i);
                temp++;
            } else if (i >= limit) {
                break;
            } else {
                int n = 0;
                for (int j = 2; j <= Math.sqrt(i) ; j++) {
                    if (i % j == 0) {
                        n++;
                    }
                }
                if (n == 0) {
                    System.out.println(i);
                    temp++;
                }
            }
            i++;
        }
    }
}
