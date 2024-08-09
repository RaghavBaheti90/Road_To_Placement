public class p5 {
    public static void tri1(int n) {
        for (int i = n; i >0; i--) {
            for (int j = i; j >0; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        int n  ;
        tri1(5);
    }
}
