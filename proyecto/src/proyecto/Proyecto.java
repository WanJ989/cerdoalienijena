/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author costa
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        
        int dificultad, count, operacion,x,y;
        String Usuario;
        char exit =' ';
        System.out.println("Nombre de usuario: "); Usuario = sc.nextLine();
        
         do {
        System.out.print("Choose your option:\n"
                                    +"1. Sum \n"
                                    +"2. Substract \n"
                                    +"3. Multiplication \n"
                                    +"4. Division \n"
                                    +"5. Euclidean algorithm \n"); 
        operacion = sc.nextInt();
        
      
        
         
          
            switch (operacion){
            case 1: 
                System.out.print("Nivel de dificultad por curso(1-4): "); dificultad = sc.nextInt();
                Suma(dificultad);
                break;
            case 2:
                System.out.print("Nivel de dificultad por curso(1-4): "); dificultad = sc.nextInt();
                Resta(dificultad);
                break;
            case 3:
                System.out.print("Nivel de dificultad por curso(1-4): "); dificultad = sc.nextInt();
                Multiplicacion(dificultad);
                break;
            case 4:
                System.out.print("Nivel de dificultad por curso(1-4): "); dificultad = sc.nextInt();
                Division(dificultad);
                break;
            case 5:
                System.out.println("Introduce 2 numeros");
                x=sc.nextInt();
                y=sc.nextInt();
                euclid(x,y);
                
            default:
             }
                     
            System.out.println("\nDo you want to try again? "+Usuario);
            System.out.println("Enter S to exit or another key to continue"); 
            exit=sc1.next().charAt(0);
            exit = Character.toUpperCase(exit);
           
        } while (exit!='S');
        
        
        
       
    }
    static int Suma(int dificultad) {
        int preguntas = 0, count = 0, suma, azar1, azar2, respuesta;
        Scanner sc3 = new Scanner(System.in);
        Random rnd = new Random();//Generador de numeros aleatorios

        switch (dificultad) {// EN ESTE SWITCH DEPENDIENDO EN QUE CURSO ESTE EL USUARIO ASIGNAMOS LA DIFICULTAD
            case 1:
                do {
                    azar1 = rnd.nextInt(8) + 1;//generamos un numero del 0 al 8 y le sumamos 1 para que nunca salga 0
                    azar2 = rnd.nextInt(8) + 1;
                    suma = azar1 + azar2;
                    System.out.println(azar1 + " + " + azar2 + " = ");
                    System.out.println("Cual es la respuesta");
                    respuesta = sc3.nextInt();
                    if (respuesta == suma) {
                        System.out.println("Es correcto");
                        count++;
//Si es correcta la respuesta sumamso 1 en el contador de preguntas correctas
                    } else {
                        System.out.println("Es incorrecto");

                    }
                    preguntas++; //cada vez que hay un ciclo del programa contamos 1 para saber cuantas preguntas hemos preguntado
                } while (preguntas != 10);
                System.out.println("Tu puntuacion es " + count + " sobre " + preguntas);
                return count;
            case 2:
                do {
                    azar1 = rnd.nextInt(89) + 10;//la dificultad aumenta
                    azar2 = rnd.nextInt(8) + 1;
                    suma = azar1 + azar2;
                    System.out.println(azar1 + " + " + azar2 + " = ");
                    System.out.println("Cual es la respuesta");
                    respuesta = sc3.nextInt();
                    if (respuesta == suma) {
                        System.out.println("Es correcto");
                        count++;

                    } else {
                        System.out.println("Es incorrecto");

                    }
                    preguntas++;
                } while (preguntas != 10);
                System.out.println("Tu puntuacion es " + count + " sobre " + preguntas);

                return count;
            case 3:
                do {
                    azar1 = rnd.nextInt(89) + 10;
                    azar2 = rnd.nextInt(89) + 10;
                    suma = azar1 + azar2;
                    System.out.println(azar1 + " + " + azar2 + " = ");
                    System.out.println("Cual es la respuesta");
                    respuesta = sc3.nextInt();
                    if (respuesta == suma) {
                        System.out.println("Es correcto");
                        count++;

                    } else {
                        System.out.println("Es incorrecto");

                    }
                    preguntas++;
                } while (preguntas != 10);
                System.out.println("Tu puntuacion es " + count + " sobre " + preguntas);

                return count;
            case 4:
                do {
                    azar1 = rnd.nextInt(899) + 100;
                    azar2 = rnd.nextInt(8) + 1;
                    suma = azar1 + azar2;
                    System.out.println(azar1 + " + " + azar2 + " = ");
                    System.out.println("Cual es la respuesta");
                    respuesta = sc3.nextInt();
                    if (respuesta == suma) {
                        System.out.println("Es correcto");
                        count++;

                    } else {
                        System.out.println("Es incorrecto");

                    }
                    preguntas++;
                } while (preguntas != 10);
                System.out.println("Tu puntuacion es " + count + " sobre " + preguntas);
        }
        return count;
    }

    static int Resta(int dificultad) {
        int preguntas = 0, count = 0, resta, azar1, azar2, respuesta;
        Scanner sc3 = new Scanner(System.in);
        Random rnd = new Random();
        switch (dificultad) {// EN ESTE SWITCH DEPENDIENDO EN QUE CURSO ESTE EL USUARIO ASIGNAMOS LA DIFICULTAD
            case 1:
                do {
                    azar1 = rnd.nextInt(8) + 1;//generamos un numero del 0 al 8 y le sumamos 1 para que nunca salga 0
                    azar2 = rnd.nextInt(8) + 1;
                    if (azar1 < azar2) {
                        resta = azar2 - azar1;
                        System.out.println(azar2 + " - " + azar1 + " = ");
                    } else {
                        resta = azar1 - azar2;
                        System.out.println(azar1 + " - " + azar2 + " = ");
                    }

                    System.out.println("Cual es la respuesta");
                    respuesta = sc3.nextInt();
                    if (respuesta == resta) {
                        System.out.println("Es correcto");
                        count++;
//Si es correcta la respuesta sumamso 1 en el contador de preguntas correctas
                    } else {
                        System.out.println("Es incorrecto");
                    }
                    preguntas++; //cada vez que hay un ciclo del programa contamos 1 para saber cuantas preguntas hemos preguntado
                } while (preguntas != 10);
                System.out.println("Tu puntuacion es " + count + " sobre " + preguntas);
                return count;
            case 2:
                do {
                    azar1 = rnd.nextInt(97) + 2;
                    azar2 = rnd.nextInt(8) + 1;
                    if (azar1 < azar2) {
                        resta = azar2 - azar1;
                        System.out.println(azar2 + " - " + azar1 + " = ");
                    } else {
                        resta = azar1 - azar2;
                        System.out.println(azar1 + " - " + azar2 + " = ");
                    }

                    System.out.println("Cual es la respuesta");
                    respuesta = sc3.nextInt();
                    if (respuesta == resta) {
                        System.out.println("Es correcto");
                        count++;
//Si es correcta la respuesta sumamso 1 en el contador de preguntas correctas
                    } else {
                        System.out.println("Es incorrecto");
                    }
                    preguntas++; //cada vez que hay un ciclo del programa contamos 1 para saber cuantas preguntas hemos preguntado
                } while (preguntas != 10);
                System.out.println("Tu puntuacion es " + count + " sobre " + preguntas);
                return count;
            case 3:
                do {
                    azar1 = rnd.nextInt(97) + 2;
                    azar2 = rnd.nextInt(97) + 2;
                    if (azar1 < azar2) {
                        resta = azar2 - azar1;
                        System.out.println(azar2 + " - " + azar1 + " = ");
                    } else {
                        resta = azar1 - azar2;
                        System.out.println(azar1 + " - " + azar2 + " = ");
                    }

                    System.out.println("Cual es la respuesta");
                    respuesta = sc3.nextInt();
                    if (respuesta == resta) {
                        System.out.println("Es correcto");
                        count++;
//Si es correcta la respuesta sumamso 1 en el contador de preguntas correctas
                    } else {
                        System.out.println("Es incorrecto");
                    }
                    preguntas++; //cada vez que hay un ciclo del programa contamos 1 para saber cuantas preguntas hemos preguntado
                } while (preguntas != 10);
                System.out.println("Tu puntuacion es " + count + " sobre " + preguntas);
                return count;
            case 4:
                do {
                    azar1 = rnd.nextInt(899) + 100;
                    azar2 = rnd.nextInt(89) + 10;
                    if (azar1 < azar2) {
                        resta = azar2 - azar1;
                        System.out.println(azar2 + " - " + azar1 + " = ");
                    } else {
                        resta = azar1 - azar2;
                        System.out.println(azar1 + " - " + azar2 + " = ");
                    }

                    System.out.println("Cual es la respuesta");
                    respuesta = sc3.nextInt();
                    if (respuesta == resta) {
                        System.out.println("Es correcto");
                        count++;
//Si es correcta la respuesta sumamso 1 en el contador de preguntas correctas
                    } else {
                        System.out.println("Es incorrecto");
                    }
                    preguntas++; //cada vez que hay un ciclo del programa contamos 1 para saber cuantas preguntas hemos preguntado
                } while (preguntas != 10);
                System.out.println("Tu puntuacion es " + count + " sobre " + preguntas);

        }
        return count;
    }
    static int Multiplicacion(int dificultad){
            int preguntas = 0, count = 0, multiplicacion, azar1, azar2, respuesta;
        Scanner sc3 = new Scanner(System.in);
        Random rnd = new Random();//Generador de numeros aleatorios

        switch (dificultad) {// EN ESTE SWITCH DEPENDIENDO EN QUE CURSO ESTE EL USUARIO ASIGNAMOS LA DIFICULTAD
            case 1:
                do {
                    azar1 = rnd.nextInt(8) + 1;//generamos un numero del 0 al 8 y le sumamos 1 para que nunca salga 0
                    azar2 = rnd.nextInt(8) + 1;
                    multiplicacion = azar1 * azar2;
                    System.out.println(azar1 + " * " + azar2 + " = ");
                    System.out.println("Cual es la respuesta");
                    respuesta = sc3.nextInt();
                    if (respuesta == multiplicacion) {
                        System.out.println("Es correcto");
                        count++;
//Si es correcta la respuesta sumamos 1 en el contador de preguntas correctas
                    } else {
                        System.out.println("Es incorrecto");

                    }
                    preguntas++; //cada vez que hay un ciclo del programa contamos 1 para saber cuantas preguntas hemos preguntado
                } while (preguntas != 10);
                System.out.println("Tu puntuacion es " + count + " sobre " + preguntas);
                return count;
                case 2:
                do {
                    azar1 = rnd.nextInt(89) + 10;
                    azar2 = rnd.nextInt(8) + 1;
                    multiplicacion = azar1 * azar2;
                    System.out.println(azar1 + " * " + azar2 + " = ");
                    System.out.println("Cual es la respuesta");
                    respuesta = sc3.nextInt();
                    if (respuesta == multiplicacion) {
                        System.out.println("Es correcto");
                        count++;
//Si es correcta la respuesta sumamos 1 en el contador de preguntas correctas
                    } else {
                        System.out.println("Es incorrecto");

                    }
                    preguntas++; //cada vez que hay un ciclo del programa contamos 1 para saber cuantas preguntas hemos preguntado
                } while (preguntas != 10);
                System.out.println("Tu puntuacion es " + count + " sobre " + preguntas);
                return count;
                case 3:
                do {
                    azar1 = rnd.nextInt(899) + 100;
                    azar2 = rnd.nextInt(8) + 1;
                    multiplicacion = azar1 * azar2;
                    System.out.println(azar1 + " * " + azar2 + " = ");
                    System.out.println("Cual es la respuesta");
                    respuesta = sc3.nextInt();
                    if (respuesta == multiplicacion) {
                        System.out.println("Es correcto");
                        count++;
//Si es correcta la respuesta sumamos 1 en el contador de preguntas correctas
                    } else {
                        System.out.println("Es incorrecto");

                    }
                    preguntas++; //cada vez que hay un ciclo del programa contamos 1 para saber cuantas preguntas hemos preguntado
                } while (preguntas != 10);
                System.out.println("Tu puntuacion es " + count + " sobre " + preguntas);
                return count;
                
                case 4:
                do {
                    azar1 = rnd.nextInt(89) + 10;
                    azar2 = rnd.nextInt(89) + 10;
                    multiplicacion = azar1 * azar2;
                    System.out.println(azar1 + " * " + azar2 + " = ");
                    System.out.println("Cual es la respuesta");
                    respuesta = sc3.nextInt();
                    if (respuesta == multiplicacion) {
                        System.out.println("Es correcto");
                        count++;
//Si es correcta la respuesta sumamos 1 en el contador de preguntas correctas
                    } else {
                        System.out.println("Es incorrecto");

                    }
                    preguntas++; //cada vez que hay un ciclo del programa contamos 1 para saber cuantas preguntas hemos preguntado
                } while (preguntas != 10);
                System.out.println("Tu puntuacion es " + count + " sobre " + preguntas);
               
        }
         return count;
}
        static int Division(int dificultad){
             int preguntas = 0, count = 0, division, azar1, azar2, respuesta;
        Scanner sc3 = new Scanner(System.in);
        Random rnd = new Random();//Generador de numeros aleatorios

        switch (dificultad) {
        case 1:
                do {
                    do{
                    azar1 = rnd.nextInt(8) + 1;//generamos un numero del 0 al 8 y le sumamos 1 para que nunca salga 0
                    azar2 = rnd.nextInt(8) + 1;
                    }while(azar1%azar2!=0);
                   
                    division=azar1/azar2;
                    System.out.println(azar1 + " / " + azar2 + " = ");        
                    System.out.println("Cual es la respuesta");
                    respuesta = sc3.nextInt();
                    if (division%respuesta==0) {
                        System.out.println("Es correcto");
                        count++;
//Si es correcta la respuesta sumamos 1 en el contador de preguntas correctas
                    } else {
                        System.out.println("Es incorrecto");

                    }
                    preguntas++; //cada vez que hay un ciclo del programa contamos 1 para saber cuantas preguntas hemos preguntado
                } while (preguntas != 10);
                System.out.println("Tu puntuacion es " + count + " sobre " + preguntas);
                
        case 2:
                do {
                    do{
                    azar1 = rnd.nextInt(89) + 10;
                    azar2 = rnd.nextInt(8) + 1;
                    }while(azar1%azar2!=0);
                   
                    division=azar1/azar2;
                    System.out.println(azar1 + " / " + azar2 + " = ");        
                    System.out.println("Cual es la respuesta");
                    respuesta = sc3.nextInt();
                    if (division%respuesta==0) {
                        System.out.println("Es correcto");
                        count++;
//Si es correcta la respuesta sumamos 1 en el contador de preguntas correctas
                    } else {
                        System.out.println("Es incorrecto");

                    }
                    preguntas++; //cada vez que hay un ciclo del programa contamos 1 para saber cuantas preguntas hemos preguntado
                } while (preguntas != 10);
                System.out.println("Tu puntuacion es " + count + " sobre " + preguntas);
                
        
        return count;
        
                case 3:
                do {
                    do{
                    azar1 = rnd.nextInt(899) + 100;
                    azar2 = rnd.nextInt(8) + 1;
                    }while(azar1%azar2!=0);
                   
                    division=azar1/azar2;
                    System.out.println(azar1 + " / " + azar2 + " = ");        
                    System.out.println("Cual es la respuesta");
                    respuesta = sc3.nextInt();
                    if (division%respuesta==0) {
                        System.out.println("Es correcto");
                        count++;
//Si es correcta la respuesta sumamos 1 en el contador de preguntas correctas
                    } else {
                        System.out.println("Es incorrecto");

                    }
                    preguntas++; //cada vez que hay un ciclo del programa contamos 1 para saber cuantas preguntas hemos preguntado
                } while (preguntas != 10);
                System.out.println("Tu puntuacion es " + count + " sobre " + preguntas);
                
                
                case 4:
                do {
                    do{
                    azar1 = rnd.nextInt(899) + 100;
                    azar2 = rnd.nextInt(89) + 10;
                    }while(azar1%azar2!=0);
                   
                    division=azar1/azar2;
                    System.out.println(azar1 + " / " + azar2 + " = ");        
                    System.out.println("Cual es la respuesta");
                    respuesta = sc3.nextInt();
                    if (division%respuesta==0) {
                        System.out.println("Es correcto");
                        count++;
//Si es correcta la respuesta sumamos 1 en el contador de preguntas correctas
                    } else {
                        System.out.println("Es incorrecto");

                    }
                    preguntas++; //cada vez que hay un ciclo del programa contamos 1 para saber cuantas preguntas hemos preguntado
                } while (preguntas != 10);
                System.out.println("Tu puntuacion es " + count + " sobre " + preguntas);
                
        }
        return count;
        }
        
        static int euclid(int a, int b) {
                
        if(b==0)
           return a;
       else
            System.out.println(a+"%"+b+"="+a%b);
           return euclid(b, a % b);
    }
}
        
        

     

