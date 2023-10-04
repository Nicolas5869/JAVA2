package JAVA_2;
import java.util.Scanner;
import javax.swing.JOptionPane;

/* 
---------Ejercicios nivel : Iniciado JAVA JEDI-----------

1. Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
triángulo de asteriscos en la consola. Usar bucles.

public class TP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca numero ramas que querés que tu arbol tenga: ");
        int filas = sc.nextInt();

        System.out.println();
        for(int altura = 1; altura<=filas; altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=filas-altura; blancos++){
                System.out.print(" ");
            }

            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


2. Mis amigos : Guarde en variables el nombre de N cantidad de amigos, itere sobre
esa cantidad mostrando el nombre de cada amigo.

public class TP2 {
    public static void main(String[] args) {
        String nombres[] = new String[10];
        int i=0;
        while(i<10) {
            String nom = JOptionPane.showInputDialog(
                "Ingrese el nombre de su " + (i+1) + "° amigo");
            nombres[i]=nom;
            i++;
        }
        JOptionPane.showMessageDialog(null, "Listado de amigos \n" 
        + "Amigo 1: "+ nombres[0]+"\n"
        + "Amigo 2: "+ nombres[1]+"\n"
        + "Amigo 3: "+ nombres[2]+"\n"
        + "Amigo 4: "+ nombres[3]+"\n"
        + "Amigo 5: "+ nombres[4]+"\n"
        + "Amigo 6: "+ nombres[5]+"\n"
        + "Amigo 7: "+ nombres[6]+"\n"
        + "Amigo 8: "+ nombres[7]+"\n"
        + "Amigo 9: "+ nombres[8]+"\n"
        + "Amigo 10: "+ nombres[9]+"\n"
        +"");
    }
} 

3. Suma de números : Realizar un programa que guarde un número en memoria y
determine si es par o impar.

public class TP2 {
public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {;
            int num1;
            int num2;
            int num3;
        System.out.print("Introduce un número: ");
            num1 = sc.nextInt();        
        
        if (num1 % 2 == 0)
        System.out.println("El número " + (num1) + " es par");
        else
        System.out.println("El número " + (num1) + " es impar");
        }                 
    }
}



4. De que se trata esto? : Realizar un programa que guarde un número en memoria y
determine si es positivo, negativo o cero. 

public class TP2 {
public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {;
            int num1;
        System.out.print("Introduce un número: ");
            num1 = sc.nextInt();        
        
        if (num1 > 0)
        System.out.println("El número " + (num1) + " es mayor a 0");
        else if (num1 < 0)
        System.out.println("El número " + (num1) + " es menor a 0");
        else
        System.out.println("El número introducido es 0");
        }                 
    }
}


5. La suma de los primeros: Realizar un programa que calcule la suma de los
primeros N números naturales, donde N es un número entero guardado en memoria.

public class TP2 {
//public static int n = 0;
//public static int sum;
public static void main(String[] args) {
    int numero = 0;
    try (Scanner in = new Scanner(System.in)) {
        System.out.println("Introduce un número");

        numero = in.nextInt();
    }
    int sum = 0;        
        
    for (int i = 0; i < numero; i++) {
    sum = sum +=i;
        }
    System.out.println("El resultado es " + sum);
    }
}


6. A mi me gustan los pares: Escribe un programa que imprima solo los N números
pares, donde los N números son guardados en variables o constantes según
corresponda.



public class TP2 {

public static void main ( String[] args )
{
    Scanner entrada = new Scanner(System.in);

    System.out.print("Ingrese el número inferior: ");
    int inferior=entrada.nextInt();

    System.out.print("Ingrese el número de tope: ");
    int tope=entrada.nextInt();

    
    if(inferior<tope)
    {
        for(int i=inferior;i<=tope;i++)
        {
            if(i%2==0) {
                System.out.print(i+"\n");
            }
            
        }
    }else{
        System.out.print("El primer numero tiene que ser inferior al segundo\n");
    }
}
}

7. Espero aprobar : Escribe un programa que imprima un título para el programa,
luego un listado (Seguido, NO con saltos de línea) de las N notas de mis exámenes,
donde los N números son guardados en variables o constantes según corresponda.
Luego obtenga el promedio de esas calificaciones y me diga si aprobé o no y con
cuanto

public class TP2 {

public static void main ( String[] args )
{
    Scanner leer =  new Scanner(System.in);
    int notas;
    int suma = 0;
    int prom = 0;

    System.out.print("ingrese cantidad de notas: ");
    notas = leer.nextInt();

    for(int i=1; i<=notas; i++){
        System.out.println("ingrese nota"+" "+i+" "+"de"+" "+notas+":");
        int nota = leer.nextInt();  
        suma = suma + nota;
    }

    prom= prom + suma /notas;
    if (prom >= 6) {
        System.out.println("El promedio de las notas es de "+ prom + ", usted ha aprobado.");
    }
    else{
        System.out.print("El promedio de las notas es de "+ prom + ", usted ha reprobado.");
    }
}   
}
*/