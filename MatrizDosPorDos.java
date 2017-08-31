package proyectomatrices;
import java.util.Scanner;
/**
 *
 * @author Carlos Ulises Ocampo Silva
 */
public class MatrizDosPorDos {
    double valor=0;
    double determinante=0;
    Scanner entrada = new Scanner(System.in);
    
    //Se asigna valores a la matriz 
    public void Matriz(int filas, int columnas){
        
        
        double [][] MatrizA= new double [filas][columnas];
        //int [][] MatrizB= new int [filas][columnas];
                    
            for(int i=0;i<MatrizA.length;i++){
            
                for(int j=0;j<MatrizA.length;j++){
                     
                    System.out.println("Porfavor ingrese los valores dentros de la matriz");
                    valor = entrada.nextInt();
                    MatrizA[i][j] = valor;
                     
                    System.out.println("Posicion:"+"["+i+"]"+"["+j+"]"+" Valor actual de Matriz " + MatrizA[i][j] );
                 
                }
            }
                    
                    matrizInverza(MatrizA);
              
    }
    
    //Aqui se realiza la operacion para determinar la DETERMINANTE de la matriz
    public void matrizDeterminante(double [][] MatrizA){
        
         System.out.println("La matriz queda a si:\n"+"["+MatrizA[0][0]+"]"+ " [" + MatrizA[0][1]+"]\n"
                                                     + "["+MatrizA[1][0]+"]"+" [" + MatrizA[1][1]+"]");
 
            
            System.out.println("Para poder tener la inversa de esta matriz primeramente tenemos que"
                    + " verificar que su DETERMINANTE sea !=0 esto se logra de la siguiente manera:\n");
            
            determinante = (MatrizA[0][0] * MatrizA[1][1]) - (MatrizA[0][1] * MatrizA[1][0]);
            
            System.out.println("(MatrizA[0][0] * MatrizA[1][1]) - (MatrizA[0][1] * MatrizA[1][0]");
            System.out.println("El resultado es: " + determinante);
          
            
    }

    //Se hace la operación inverza de la matrizA 
    public void matrizInverza(double [][] MatrizA){    
           
            matrizDeterminante(MatrizA);
      
            if(determinante !=0){
            
                System.out.println("La matriz tiene determinate diferente de cero por lo tanto es invertible");
                
                System.out.println("Ahora metemos la matriz adjunta");
                System.out.println("La matriz queda a si:\n"+"["+MatrizA[1][1]+"]"+ " [" + ((-1)*MatrizA[0][1])+"]\n"
                                                        + "["+((-1)* MatrizA[1][0])+"]"+" ["+MatrizA[0][0]+"]");
                System.out.println("Multiplicacmos (1/determinante)* Matriz adjunta");
                System.out.println("Esta es la matriz inversa:\n");
                
                System.out.println("["+(1/determinante) * MatrizA[1][1]+"] "+" ["+(1/determinante)*((-1)*MatrizA[0][1])+"]\n"
                                + ("["+(1/determinante) * ((-1)* MatrizA[1][0]))+"]"+" ["+((1/determinante) * MatrizA[0][0])+"]");
                
            
            }else{
                
                System.out.println("La matriz es singular y/o degenerada ya que no cumple con el requisito del cuadrado");
            }
         }
    
}
