package perulangan;

/**
 *
 * @author niken riri
 */
public class TesPerulangan {
    public static void main(String[] args) {
        int i;
        //for
        System.out.println("Perulangan for...");
        for (i = 0; i < 10; i++){
            System.out.println("Perulangan ke : " + i);
        }
        
        //while
        System.out.println("Perulanagn while...");
        i = 0;
        while(i < 10){
            System.out.println("Perulangan ke : " + i);
            i++;
        }
        
        //Do-While
        System.out.println("Perulangan Do-While...");
        i = 0;
        do{
            System.out.println("Perulangan ke : " + i);
            i++;
        }while(i < 10);
    }
    
}
