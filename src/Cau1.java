public class Cau1 {
    public void leftTriangle() {
        //        Câu 1
        //        Viết chương trình thực hiện:
        //        In ra màn hình hình tam giác *
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void triangle() {
        int row = 4;
        for (int i = 0; i < row; i++) {
            for (int j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void square() {
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
