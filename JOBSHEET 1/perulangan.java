import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        String nim = sc15.nextLine();
        
        String duaDigitTerakhirNIM = nim.substring(nim.length() - 2);
        int n = Integer.parseInt(duaDigitTerakhirNIM);
        System.out.println("n: " + n);

        int i = 1; 
        do {
            if (i == 6 || i == 10) {
                i++; 
                continue;
            }
            if (i % 2 == 1) {
                System.out.print("* "); 
            } else {
                System.out.print(i + " "); 
            }
            i++; 
        } while (i <= n); 
        
        sc15.close(); 
    }
}