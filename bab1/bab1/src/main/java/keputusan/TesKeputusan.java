package keputusan;

/**
 *
 * @author niken riri
 */
public class TesKeputusan {
    public static void main(String[] args) {
        char jenisKelamin = 'W';
    
    //nested if
    if(jenisKelamin == 'L'){
        System.out.println("Cowok");
    }else if(jenisKelamin == 'P'){
        System.out.println("Cewek");
    }else{
        System.out.println("Banci");
    }
    
    //ternary
        System.out.println(jenisKelamin == 'L'? "Dia pasti cowok" : "Dia pasti cewek");
 
    //switch case
    switch(jenisKelamin){
        case 'P':
            System.out.println("Cowok");
            break;
        case 'L':
            System.out.println("Cewek");
            break;
        default:
            System.out.println("Banci");
            break;
    }
    
  }
    
}
