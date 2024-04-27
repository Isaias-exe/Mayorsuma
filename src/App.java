import java.util.Scanner;

public class App {

    public static int num1;
    public static int num2;
    public static int num3;

    public static void main(String[] args) throws Exception {
    
        // Nombre: Isaias Israel Madrigal Brizuela 2024-1383U Grupo:1M1
        
        
        Scanner leer = new Scanner(System.in);

       // proceso para digitar numero de numeros diferentes 
        do {

            try {
                System.out.println("Ingrese tres numeros enteros diferentes");
                System.out.println("Digite primer numero");
                num1 = leer.nextInt();
                System.out.println("Digite segundo numero");
                num2 = leer.nextInt();
                System.out.println("Digite tercer numero");
                num3 = leer.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ingrese valores correctos");
                leer.nextLine();
            }
            


        } while (num1 == num2 || num1 == num3 || num2 == num3);
        operacionesyresultados(num3, num2, num1);
        }
    
        public static void  operacionesyresultados(int n1, int n2, int n3){
        // Calculo de la suma de los dos numeros pequeños
        int sumaDosmenores = num1+num2+num3-Math.max(Math.max(num1, num2), num3);
        // Calculo de la diferencia de los dos numeros mayores
        int diferenciaDosmayores = Math.max(Math.max(num1, num2), num3)-Math.max(Math.min(num1, num2), Math.min(Math.max(num1, num2), num3));
        //  Identificar numero mayor
        int mayor= Math.max(Math.max(num1, num2), num3);
        
        
        System.out.println("La suma de los dos numeros pequeños es:"+sumaDosmenores);
        System.out.println("La diferencia de los dos numeros mayores es:"+diferenciaDosmayores);
        System.out.println("El numero mayor es:"+mayor);
        }
    }