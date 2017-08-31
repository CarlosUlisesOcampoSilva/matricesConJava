package proyectomatrices;
import java.util.Scanner;
/**
 *
 * @author Carlos Ulises Ocampo Silva
 */
public class ProyectoMatrices {

    /**
     * @param args 
     * 
     * Este programa tiene la finalidad de solucionar problemas con matrices
     * 2x2, 3x3, nxn buscando matriz inversa
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        MatrizDosPorDos obj = new MatrizDosPorDos();
        MatrizTresPorTres obj2 = new MatrizTresPorTres();
        MatrizNporN obj3 = new MatrizNporN();
        
        System.out.println("Porfavor ingrese las filas");
        int filas = entrada.nextInt();
        System.out.println("Porfavor ingrese las comlumnas");
        int columnas = entrada.nextInt();
        
        if(filas == 2 && columnas ==2){
      
            obj.Matriz(filas,columnas);
        
        }else if (filas ==3 && columnas ==3){
            
            obj2.Matriz(filas, columnas);
        
        }else if (filas >=4 && columnas >=4){
        
           if(filas%2 ==0 && columnas%2 == 0){
           
               //MatrizN*N
               obj3.matriz(filas, columnas);
               
           }else{
           
               System.out.println("La matriz no es cuadrada.\nlas matrices identidad tienen que ser cuadradas");
           }
        
        }else{
             System.out.println("La matriz no es cuadrada.\nlas matrices identidad tienen que ser cuadradas");
                     
        }
        
    }
    
}
