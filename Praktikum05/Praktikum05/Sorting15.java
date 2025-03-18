package Praktikum05;

public class Sorting15 {

    int [] data;
    int jmlData;

    public Sorting15(int Data[], int jmlDat) {
        jmlData=jmlDat;
        data=new int[jmlDat];
        for (int i=0; i<jmlData; i++) {
            data[i]=Data[i];
        }
    }

    void bubbleSort() {
        int temp=0;
        for (int i=0; i<jmlData; i++) {
            for (int j=1; j<jmlData-i; j++) {
                if (data[j-1]>data[j]){
                    temp=data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
                }
            }
        }
    }

    void insertionSort(){
        for (int i=1; i<=data.length-1; i++){
            int temp=data[i];
            int j=i-1;
            while (j>=0 && data[j]>temp){
                data[j+1]=data[j];
                j--;
            }
            data[j+1]=temp;
        }
    }

    void tampil(){
        for (int i=0; i<jmlData; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

}