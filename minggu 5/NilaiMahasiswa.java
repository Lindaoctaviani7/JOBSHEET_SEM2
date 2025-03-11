public class NilaiMahasiswa {
    
    public static int MaxDC(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = (left + right) / 2;
        int maxKiri = MaxDC(arr, left, mid);
        int maxKanan = MaxDC(arr, mid + 1, right);
        return Math.max(maxKiri, maxKanan);
    }

    public static int MinDC(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = (left + right) / 2;
        int minKiri = MinDC(arr, left, mid);
        int minKanan = MinDC(arr, mid + 1, right);
        return Math.min(minKiri, minKanan);
    }

    public static double hitungRataBF(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return (double) total / arr.length;
    }
}

/*public class NilaiMahasiswa {
    
    public static int cariMaxDC(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = (left + right) / 2;
        int maxKiri = cariMaxDC(arr, left, mid);
        int maxKanan = cariMaxDC(arr, mid + 1, right);
        return Math.max(maxKiri, maxKanan);
    }

    public static int cariMinDC(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = (left + right) / 2;
        int minKiri = cariMinDC(arr, left, mid);
        int minKanan = cariMinDC(arr, mid + 1, right);
        return Math.min(minKiri, minKanan);
    }

    public static double hitungRataBruteForce(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return (double) total / arr.length;
    }

    public static int[] inputNilai(int jumlah, String jenis) {
        Scanner sc15 = new Scanner(System.in);
        int[] nilai = new int[jumlah];
        System.out.println("Masukkan " + jenis + " untuk " + jumlah + " mahasiswa:");
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Mahasiswa " + (i + 1) + ": ");
            nilai[i] = sc15.nextInt();
        }
        return nilai;
    }
}*/
