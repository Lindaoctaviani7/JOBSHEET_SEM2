public class Matkul1315 {
    String kodeMK;
    String namaMK;
    int sks;

    public Matkul1315(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public void tampilMatakuliah() {
        System.out.println("KodeMK: " + kodeMK + " | NamaMK: " + namaMK + " | SKS: " + sks);
    }
}
