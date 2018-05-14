
package numero.de.cedula;
import java.util.Scanner;
        
/**
 *
 * @author Karen
 */
public class NumeroDeCedula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
int []cedula ={0,5,0,0,1,4,1,2,0,5};
int []verificar =new int [9];
//System.out.println("Digite su numero de cedula");
//for (int i=0;i<10;i++){
  
  //cedula[i]=scan.nextInt();
//}


 if(cedula[0]<=2&&cedula[0]>=0){
     if((cedula[0]==0&&cedula[1]<=9&&cedula[1]>=0)||(cedula[0]==1&&cedula[1]<=9&&cedula[1]>=0)||(cedula[0]==2&&cedula[1]<=4&&cedula[1]>=0)){
    if(cedula[2]>=0&&cedula[2]<=6){
     for(int i=0;i<9;i++){ 
     if(i%2==0){
         verificar[i]=cedula[i]*2;
         if(verificar[i]>9){
             verificar[i]=verificar[i]-9;
         }
     }else{
         verificar[i]=cedula[i]*1;
     }
     
     
     }
     int suma=verificar[0]+verificar[1]+verificar[2]+verificar[3]+verificar[4]+verificar[5]+verificar[6]+verificar[7]+verificar[8];
     int decenaSuperior=suma;
     
     do{
         decenaSuperior++;
     }while(decenaSuperior%10==0);
     int resultado= decenaSuperior-suma;
     System.out.println(resultado);
     if (resultado==cedula[9]){
         System.out.println("Esta bien ingreado el numero de cedula");
         for(int i =0; i <10 ;i++){
          System.out.print(cedula[i]+" "); 
         }
                
     }else{
          System.out.println("Esta mal ingreado el numero de cedula");
     }
    }
 }
 }else{
     System.out.println("Esta mal ingreado el numero de cedula");
 }
    


    }


}
