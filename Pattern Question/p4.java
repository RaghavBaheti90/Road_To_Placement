public class p4 {

    public static void tri1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i+1+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        int n  ;
        tri1(5);
    }
}
