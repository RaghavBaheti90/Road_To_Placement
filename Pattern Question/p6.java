public class p6 {
    public static void tri1(int n) {
        for (int i = 0; i <=n; i++) {
            for (int j = 1; j<n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        int n  ;
        tri1(5);
    }  
} 
