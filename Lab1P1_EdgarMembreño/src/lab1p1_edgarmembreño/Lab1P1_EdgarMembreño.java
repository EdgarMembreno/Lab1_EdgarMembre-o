/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1p1_edgarmembreño;
import java.util.Scanner;
/**
 *
 * @author edgarmembreno
 */
public class Lab1P1_EdgarMembreño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       char respuesta='s';
       while(respuesta=='s'||respuesta=='S'){
           int opcion;
           System.out.println("Bienvenido al Menu");
           System.out.println("Opcion 1");
           System.out.println("Opcion 2");
           System.out.println("Opcion 3");
           System.out.println("Ingrese una opcion: ");//opciones del menu
           opcion = leer.nextInt();
           if(1==opcion){//Primera opcion
             int N;
             int M;
             int total=0;
             System.out.println("Ingrese el valor de N");
             N=leer.nextInt();
             
             System.out.println("Ingrese el valor de M");
             M=leer.nextInt();
             int multi=0;
             while(N>multi){
                 multi=multi + 1;//se suma en remplazo a la variable "*"
                 total=total + M;//
             
           }
             System.out.println(total);
           }//fin de la primera opcion
           if(2==opcion){//segunda opcion 
             int num;
             int x=0;
             int total=0;
             System.out.println("Ingrese un numero");
             num=leer.nextInt();
                while (num>x){
                    x= x+1;//contador de la variable x
                    if(num>x&num%x==0){
                            total=total+x;
                    }
                }
                if(num>total){//defectivo ya que el numero es mayor al total
                    System.out.println("Su numero es defectivo");
                }else//abundante porque es mas grande el total
                    System.out.println("El numero es abundantes ");
                    
            }//fin de la segunda opcion
           if(3==opcion){//inicio de la primera opcion 
             int num;
             int a=0;
             int b=1;
             int c=0;
             int resp;
             System.out.println("Ingrese un numero");
             num=leer.nextInt();
             while(num>=5){
                 resp=a+b;
                 a=b;
                 b=resp;
                 System.out.println(a+b+resp);//Valor a y b primero 0, 1
           }
         }//fin segunda opcion 
        System.out.println("Desea ingresar otro numero? (s/n): ");
        respuesta=leer.next().charAt(0);
       }//Fin del while con respuesta de usuario 
    }// fin del main
    
}// fin del class 
