package Array;

/**
 *
 * @author niken riri
 */
public class TesArray {
    public static void main(String[] args) {
        int angka[] = new int[5];
        char nilai[] = {'C','D','B','A','E'};
        angka[0] = 5;
        angka[1] = 3;
        angka[2] = 7;
        angka[3] = 9;
        angka[4] = 2;
        int terbesar = 0;
        char nilaihuruf = 'x';
        for(int i = 0; i < 5; i++){
            if(terbesar < angka[i]){
                terbesar = angka[i];
                nilaihuruf = nilai[i];
            }
        }
        System.out.println("Terbesar : " + terbesar);
        System.out.println("Nilai Huruf : " + nilaihuruf);
    }
    
}
