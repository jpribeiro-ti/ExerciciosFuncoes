public class exerc1 {
    public static void main (String[] args) {
        int n = 5;

        // 5 5 5 5 5
        imprimeNum(n);

    }

    static void imprimeNum(int n) {
        int i, j;

        for (i=1; i <= n; i++) {
            for (j=0; j < i; j++) {
                System.out.print(i+ " ");
            }
            System.out.println(" ");
        }
    }
}