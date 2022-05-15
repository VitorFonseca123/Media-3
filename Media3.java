
package media3;
import java.util.Scanner;
/**
 *
 * @author Vitor
 */
public class Media3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        float[] nota= new float[4];
        int Final=0;
        for(int i=0; i<=3;i++){
            nota[i] = (in.nextFloat())*100;
        }
        float media = (((nota[0]*2)+(nota[1]*3)+(nota[2]*4)+(nota[3]*1))/10)/100;
        
        
        media(media, Final);
        
                
    }
    public static void exame(float media, int Final){
        Scanner in = new Scanner(System.in);
        float exame = in.nextFloat();
        
        System.out.println("Nota do exame: "+exame);
        media = (media+exame)/2;
        
        media(media, Final);
        
    }
    public static void media(float media, int Final){
        
        if(Final<=0){
                if(media>=7.0){
                    System.out.printf("Media: %.1f",media);
                    System.out.printf("\n");
                    System.out.println("Aluno aprovado.");
                }else if(media<5.0){
                    System.out.printf("Media: %.1f",media);
                    System.out.printf("\n");
                    System.out.println("Aluno reprovado.");
                }else if(media>=5.0 && media<=6.9){
                    Final++;
                    System.out.printf("Media: %.1f",media);
                    System.out.printf("\n");
                    System.out.println("Aluno em exame.");
                    exame(media, Final);
                    
                    
                }
            }else{
                if(media>=5.0){
                    System.out.println("Aluno aprovado.");
                    System.out.printf("Media final: %.1f",media);
                    System.out.printf("\n");
                }else{
                     System.out.println("Aluno reprovado.");
                     System.out.printf("Media final: %.1f",media);
                     System.out.printf("\n");
                     
                }
        }
        
    
    }
    
}
