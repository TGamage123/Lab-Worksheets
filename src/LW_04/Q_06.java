package LW_04;

public class Q_06 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=10; i<50; i++) {
            System.out.print(i + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}
