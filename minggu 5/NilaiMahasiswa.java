public class NilaiMahasiswa {
    String nama;
    int uts;
    int uas;

    public NilaiMahasiswa(String nama, int uts, int uas) {
        this.nama = nama;
        this.uts = uts;
        this.uas = uas;
    }
}

class AnalisaNilai {
    public static int MaxUTS(int[] uts, int l, int r) {
        if (l == r) return uts[l];
        
        int mid = (l + r) / 2;
        int leftMax = MaxUTS(uts, l, mid);
        int rightMax = MaxUTS(uts, mid + 1, r);
        
        if (leftMax > rightMax) {
            return leftMax;
        } else {
            return rightMax;
        }        
    }

    public static int MinUTS(int[] uts, int l, int r) {
        if (l == r) return uts[l];
        
        int mid = (l + r) / 2;
        int leftMin = MinUTS(uts, l, mid);
        int rightMin = MinUTS(uts, mid + 1, r);
        
        if (rightMin > leftMin) {
            return leftMin;
        } else {
            return rightMin;
        } 
    }

    public static double hitungRataUAS(int[] uas) {
        int total = 0;
        for (int nilai : uas) {
            total += nilai; 
        }
        return (double) total / uas.length;
    }
}