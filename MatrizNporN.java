package proyectomatrices;
import java.util.Scanner;
/**
 *
 * @author Carlos Ulises Ocampo Silva
 */
public class MatrizNporN {
    int valor;
    Scanner entrada = new Scanner(System.in);
    
    
    public void matriz(int filas, int columnas){
    
    int [][] MatrizA= new int [filas][columnas];
        //int [][] MatrizB= new int [filas][columnas];
                    
            for(int i=0;i<MatrizA.length;i++){
            
                for(int j=0;j<MatrizA.length;j++){
                     
                    System.out.println("Porfavor ingrese los valores dentros de la matriz");
                    valor = entrada.nextInt();
                    MatrizA[i][j] = valor;
                     
                    System.out.println("Posicion:"+"["+i+"]"+"["+j+"]"+" Valor actual de Matriz " + MatrizA[i][j] );
                
                }
                
                
            }
    }
     
    public void matrizDeterminante(){
       
       }
    
    public void matrizInversa(){
    
    }
    
    
    
    
}
