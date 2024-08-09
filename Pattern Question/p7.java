public class p7 {
    public static void tri1(int n) {
        for (int i = 0; i
         < n; i++) {
            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            //stars
            for (int k = 0; k < i*2+1; k++) {
                System.out.print("*");
            }
            //space
            for (int l = 0; l < n-i-1; l++) {
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        int n  ;
        tri1(5);
    }  
}
