import java.util.Scanner;

public class Main{ 
    public static void main(String[]args){
        
        Scanner teclado = new Scanner(System.in);

        /* VARIABLE DOUBLE PARA NUMEROS CON PARTE ENTERA Y PARTE DECIMAL Y 
           CHAR PARA MIS OPERADORES */

        double  numero_1, 
                numero_2 = 0.0;

        double  resultado;
        char    operacion;

        
        System.out.println("CALCULADORA / Multiplicación - División - Suma - Resta");

        System.out.println("Ingresa el primer numero");

        numero_1 = teclado.nextDouble();
        
        System.out.println("Ingresa el segundo numero");

        numero_2 = teclado.nextDouble();

        System.out.println("Ingresa tipo de operacion ( * , + , - , / ) ");

        operacion = teclado.next().charAt(0);

        switch(operacion){

            case '+' :
            
            resultado = numero_1 + numero_2;
            
            System.out.println("Resultado: " + resultado);
            
            break;

            case '-' : 

            resultado = numero_1 - numero_2;

            System.out.println("Resultado de resta es: " + resultado);

            break;

            case '*' :

            resultado = numero_1 * numero_2 ;
            
            System.out.println("Resultado de multiplicación es: " + resultado);

            break;

            
            case '/' : 

            resultado = numero_1 / numero_2 ;
            
            System.out.println("resultado de la división es: " + resultado);

            break;

            default:
            System.out.println("operacion no valida");
        }
    
        teclado.close();

    }

}