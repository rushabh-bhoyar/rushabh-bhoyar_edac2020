public class A2{

    public static void main(String[] args) {
        int rows = 10, k = 1;

        for(int i = 1; i <= rows; ++i, k = 1) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while(k!=i) {
                System.out.print(k+"   ");
                ++k;
            }

            System.out.println();
        }
    }
}