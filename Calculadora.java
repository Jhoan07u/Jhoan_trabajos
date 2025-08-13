//analisis
/* descripcion: la calculadora debera pedir descripcion al usuario 2 numeros
*  y con esos 2 numeros realizar suma,division,multiplicacion,division y modulo
*  entradas: 2, nunmero 1 y numero 2, ambos ingresados por el usuario
*salida : 5, una [pr cada resultado de la operacion aritmetica. 
*/

import java.util.Scanner;

public class Calculadora {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int opcion;


            double numero1, numero2;
            System.out.println("por favor deme el primer numerito: ");

            numero1 = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("el numero que ingresaste es " + numero1);


            System.out.println("por favor deme el segundo numerito: ");
            numero2 = entrada.nextDouble();
            System.out.println("el numero que ingresaste es " + numero2);

            double suma, resta, multiplicacion, division, modulo;
            suma = sumar(numero1, numero2);
            resta = restar(numero1, numero2);
            multiplicacion = multiplicar(numero1, numero2);
            division = dividir(numero1, numero2);
            modulo = modular(numero1, numero2);
        
            
            
            System.out.println("el resultado de la suma es: "+ suma);
            System.out.println("el resultado de la resta: "+ resta);
            System.out.println("el resultado de la multiplicacion es: "+ multiplicacion);
            System.out.println("el resultado de la division es: "+ division);
            System.out.println("el resultado del modulo es: "+ modulo);


    
    }
    public static double sumar(double a, double b) {
        double suma = a + b;
        return suma;
        

    }
    public static double restar(double a, double b) {
        return a - b;
        

    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static double dividir(double a, double b){
        return a / b;
    }
    public static double modular(double a, double b){
        return a % b;
    }
    
    



}