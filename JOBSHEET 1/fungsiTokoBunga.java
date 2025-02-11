public class fungsiTokoBunga {
        public static void main(String[] args) {
            int[][] stock = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9} };
            int[] harga = {75000, 50000, 60000, 10000};
            
            for (int i = 0; i < stock.length; i++) {
                int pendapatan = hitungPendapatan(stock[i], harga);
                System.out.println("Pendapatan RG " + (i + 1) + ": " + pendapatan);
            }
        }
        
        public static int hitungPendapatan(int[] stock, int[] harga) {
            int totalPendapatan = 0;
            for (int i = 0; i < stock.length; i++) {
                totalPendapatan += stock[i] * harga[i];
            }
            return totalPendapatan;
        }
    }
