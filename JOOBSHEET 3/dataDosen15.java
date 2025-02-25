
public class dataDosen15 {
    int usia, pria=0, wanita=0;
        private String nama;
    
        void dataSemuaDosen(dosen15[] arrayOfDosen15){
            for(int i=0;i<arrayOfDosen15.length;i++){
                System.out.println("Data Dosen");
                System.out.println("Kode Dosen: " + arrayOfDosen15[i].kode);
                System.out.println("Nama Dosen: " + arrayOfDosen15[i].nama);
                String kelamin=arrayOfDosen15[i].jenisKelamin != null?"Pria":"Wanita";
                System.out.println("Jenis Kelamin: " + kelamin);
                System.out.println("Usia: " + arrayOfDosen15[i].usia);
                System.out.println("------------------------------------");
            }
        }
    
        void jumlahDosenPerJenisKelamin(dosen15[] arrayOfDosen15){
            for (int i=0; i<arrayOfDosen15.length; i++){
                if (arrayOfDosen15[i].jenisKelamin.equals(true)){
                    pria++;
                } else{
                    wanita++;
                }
            }
            System.out.println("Jumlah Dosen Pria : " + pria);
            System.out.println("Jumlah Dosen Wanita : " + wanita);
        }
    
        void rerataUsiaDosenPerJenisKelamin(dosen15[] arrayOfDosen15) {
            int usiaDosenPria=0, usiaDosenWanita=0;
            for (int i=0; i<arrayOfDosen15.length; i++){
                if (arrayOfDosen15[i].jenisKelamin.equals(true)){
                    usiaDosenPria+=arrayOfDosen15[i].usia;
                } else if (arrayOfDosen15[i].jenisKelamin.equals(false)){
                    usiaDosenWanita+=arrayOfDosen15[i].usia;
                }
            }
    
            double rataPria=(double)usiaDosenPria/pria;
            double rataWanita=(double)usiaDosenWanita/wanita;
            System.out.println("Rata-Rata Usia Dosen Pria   : " + rataPria);
            System.out.println("Rata-Rata Usia Dosen Wanita : " + rataWanita);
        }
    
        void infoDosenPalingTua(dataDosen15[] arrayOfDosen15){
            int palingTua=0, indeks=0;
            for (int i=0; i<arrayOfDosen15.length; i++){
                if(arrayOfDosen15[i].usia>palingTua){
                    palingTua = arrayOfDosen15[i].usia;
                    indeks = i;
                }
            }
            System.out.println("Dosen Paling Tua : " + arrayOfDosen15[indeks].nama + " , Usia : " + arrayOfDosen15[indeks].usia);
    }

    void infoDosenPalingMuda(dataDosen15[] arrayOfDosen15){
        int palingMuda=100, indeks=0;
        for (int i=0; i<arrayOfDosen15.length; i++){
            if(arrayOfDosen15[i].usia<palingMuda){
                palingMuda = arrayOfDosen15[i].usia;
                indeks = i;
            }
        }
        System.out.println("Dosen Paling Muda : " + arrayOfDosen15[indeks].nama + " , Usia : " + arrayOfDosen15[indeks].usia);
    }
}   