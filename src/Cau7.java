import java.util.Arrays;
import java.util.Scanner;

public class Cau7 {
    public void mainLinear(int n) {
        int[][] matrix = new int[n][n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Nhap matrix[%d][%d]: ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
//        System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Cac phan tu nam tren duong cheo chinh");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    System.out.printf("matrix[%d][%d]: %d\n", i, j, matrix[i][j]);
                }
            }
        }
    }

}
