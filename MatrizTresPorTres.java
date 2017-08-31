package proyectomatrices;
import java.util.Scanner;
/**
 *
 * @author Carlos Ulises Ocampo Silva
 */
public class MatrizTresPorTres {
    int valor=0;
    double determinante =0;
    double A00,A01,A02,A10,A11,A12,A20,A21,A22;
    
    Scanner entrada = new Scanner(System.in);
    
        public void Matriz(int filas, int columnas){
        
        double [][] MatrizA= new double [filas][columnas];
        //int [][] MatrizB= new int [filas][columnas];
                    
            for(int i=0;i<MatrizA.length;i++){
            
                for(int j=0;j<MatrizA.length;j++){
                     
                    System.out.println("Porfavor ingrese los valores dentro de la matriz");
                    valor = entrada.nextInt();
                    MatrizA[i][j] = valor;
                     
                    System.out.println("Posicion:"+"["+i+"]"+"["+j+"]"+" Valor actual de Matriz " + MatrizA[i][j] );
                 
                }
            }
                    
                matrizInversa(MatrizA);
              
    }
    
    
public void matrizDeterminante(double [][] MatrizA){
        double c=0;
        
         System.out.println("La matriz queda a si:\n"+"["+MatrizA[0][0]+"]"+ " [" + MatrizA[0][1]+"]"+" [" + MatrizA[0][2]+"]\n"
                                                     + "["+MatrizA[1][0]+"]"+" [" + MatrizA[1][1]+"]"+" [" + MatrizA[1][2]+"]\n"
                                                     + "["+MatrizA[2][0]+"]"+" [" + MatrizA[2][1]+"]"+" [" + MatrizA[2][2]+"]");
 
            
         System.out.println("Para poder tener la inversa de esta matriz primeramente tenemos que"
                          + " verificar que su DETERMINANTE sea !=0 esto se logra de la siguiente manera:\n");
            
            c = ((MatrizA[0][0] * MatrizA[1][1] *MatrizA[2][2] )+(MatrizA[0][1] *MatrizA[1][2] *MatrizA[2][0] )+(MatrizA[0][2] *MatrizA[1][0] *MatrizA[2][1] ));
            determinante = c - ((MatrizA[0][1] *MatrizA[1][0] *MatrizA[2][2] )+(MatrizA[0][0] *MatrizA[1][2] *MatrizA[2][1] )+(MatrizA[0][2] *MatrizA[1][1] *MatrizA[2][0] ));
            
        System.out.println("La matriz queda a si con regla de sarrus:\n"
                         + "["+MatrizA[0][0]+"]"+ " ["+ MatrizA[0][1]+"]"+" [" + MatrizA[0][2]+"]"+ "-->["+MatrizA[0][0]+"]"+ " [" + MatrizA[0][1]+"]\n"
                         + "["+MatrizA[1][0]+"]"+" [" + MatrizA[1][1]+"]"+" [" + MatrizA[1][2]+"]"+ "-->["+MatrizA[1][0]+"]"+" [" + MatrizA[1][1]+"]\n"
                         + "["+MatrizA[2][0]+"]"+" [" + MatrizA[2][1]+"]"+" [" + MatrizA[2][2]+"]"+ "-->["+MatrizA[2][0]+"]"+" [" + MatrizA[2][1]+"]");
            
            System.out.println("El valor de la determinante es: " + determinante);
          
            
    }
        
public void matrizTranspuesta(double [][] MatrizA){
            
            System.out.println("La matriz Transpuesta resulta de transformar las filas en columnas de la matriz");
            System.out.println("La matriz Transpuesta queda asi :\n"
                              + "["+MatrizA[0][0]+"]"+" [" + MatrizA[1][0]+"]"+" [" + MatrizA[2][0]+"]\n"
                              + "["+MatrizA[0][1]+"]"+" [" + MatrizA[1][1]+"]"+" [" + MatrizA[2][1]+"]\n"
                              + "["+MatrizA[0][2]+"]"+" [" + MatrizA[1][2]+"]"+" [" + MatrizA[2][2]+"]");
 
        
        
        }
        
public void matrizAdjunta(double [][] MatrizA){
         
    System.out.println("La matriz adjunta queda asi : nota: Recuerda que tienes que poner los signos negativos de manera que forma un rombo entre las matrices\n"
            + "|"+MatrizA[1][1]+" "+ MatrizA[2][1]+"|   "+"|"+MatrizA[0][1]+" "+MatrizA[2][1]+"|   " + "|"+MatrizA[0][1]+" "+ MatrizA[1][1]+"| \n"
            + "|"+MatrizA[1][2]+" "+ MatrizA[2][2]+"|   "+"|"+MatrizA[0][2]+" "+MatrizA[2][2]+"|   " + "|"+MatrizA[0][2]+" "+ MatrizA[1][2]+"| \n\n"  
                                      
            + "|"+MatrizA[1][0]+" "+ MatrizA[2][0]+"|   "+"|"+MatrizA[0][0]+" "+ MatrizA[2][0]+"|  " + "|"+MatrizA[0][0]+" "+ MatrizA[1][0]+"| \n"
            + "|"+MatrizA[1][2]+" "+ MatrizA[2][2]+"|   "+"|"+MatrizA[0][2]+" "+ MatrizA[2][2]+"|  " + "|"+MatrizA[0][2]+" "+ MatrizA[1][2]+"| \n\n"     
                    
            + "|"+MatrizA[1][0]+" "+ MatrizA[2][0]+"|   "+"|"+MatrizA[0][0]+" "+ MatrizA[2][0]+"|  " + "|"+MatrizA[0][0]+" " + MatrizA[1][0]+"| \n"
            + "|"+MatrizA[1][1]+" "+ MatrizA[2][1]+"|   "+"|"+MatrizA[0][1]+" "+ MatrizA[2][1]+"|  " + "|"+MatrizA[0][1]+" " + MatrizA[1][1]+"| \n"  );
                   
    A00 =(MatrizA[1][1] * MatrizA[2][2])-(MatrizA[1][2] * MatrizA[2][1]);
    A01 = -1 * ((MatrizA[0][1] * MatrizA[2][2])-(MatrizA[0][2] * MatrizA[2][1]));
    A02 =(MatrizA[0][1] * MatrizA[1][2])-(MatrizA[0][2] * MatrizA[1][1]);
    A10 = -1 * ((MatrizA[1][0] * MatrizA[2][2])-(MatrizA[1][2] * MatrizA[2][0]));
    A11 =(MatrizA[0][0] * MatrizA[2][2])-(MatrizA[0][2] * MatrizA[2][0]);
    A12 = -1 * ((MatrizA[0][0] * MatrizA[1][2])-(MatrizA[0][2] * MatrizA[1][0]));
    A20 =(MatrizA[1][0] * MatrizA[2][1])-(MatrizA[1][1] * MatrizA[2][0]);
    A21 = -1 * ((MatrizA[0][0] * MatrizA[2][1])-(MatrizA[0][1] * MatrizA[2][0]));
    A22 =(MatrizA[0][0] * MatrizA[1][1])-(MatrizA[0][1] * MatrizA[1][0]);
         
    System.out.println("Adjunta: finalmente queda a si, solo queda multiplicar (1/determinante) * cada elemento de la matriz\n"
            +"|"+A00+"|"+"|"+A01+"|"+"|"+A02+"|\n"
            +"|"+A10+"|"+"|"+A11+"|"+"|"+A12+"|\n"
            +"|"+A20+"|"+"|"+A21+"|"+"|"+A22+"|\n");
            
        }
    
public void matrizInversa(double [][] MatrizA){
        
            matrizDeterminante(MatrizA);
              if(determinante !=0){
            
                System.out.println("La matriz tiene determinate diferente de cero por lo tanto es invertible");
                
                  matrizTranspuesta(MatrizA);
                  matrizAdjunta(MatrizA);
                 
                  System.out.println("["+(1/determinante) * A00+"] "+" ["+(1/determinante)* A01+"]"+" ["+(1/determinante)* A02+"]\n"
                                   + "["+(1/determinante) * A10+"] "+" ["+(1/determinante)* A11+"]"+" ["+(1/determinante)* A12+"]\n"
                                   + "["+(1/determinante) * A20+"] "+" ["+(1/determinante)* A21+"]"+" ["+(1/determinante)* A22+"]\n");
                
            
            }else{
                
                System.out.println("La matriz es singular y/o degenerada ya que no cumple con el requisito del cuadrado");
            }
         }
        
        
}
