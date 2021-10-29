public class Cau4 {
    public void countNumber(String name) {
        String[] tempArray = name.split(" ");
        System.out.printf("So tu trong chuoi: %d", tempArray.length);
        
    }
    public void countO(String name) {
        int count = 0;
        System.out.print("Index: ");
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'o') {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.print("\nSo ky tu o: " + count);
    }
}
