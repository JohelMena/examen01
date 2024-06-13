/*=================================================================================
Study Center....: Universidad Tecnica Nacional
Campus..........: Pacifico (JRMP)
College career..: Ingenieria en Tecnologias de Informacion
Period..........: 2C-2024
Course..........: ITI-221 - Programacion I
Document........: class_01 - main.java
Goals...........: Make the exam and have a good note
Professor.......: Jorge Ruiz (york)
Student.........:  Johel Mena
=================================================================================*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        // declare the first two variable
        System.out.println("Digite la cantidad de rutas ");
        int rutas= scanner.nextInt();
        System.out.println("Digite la cantidad de chapulines ");
        int chapulines= scanner.nextInt();

        //create the vector for rutas
        String[] vecRuta = new String[rutas];
        for (int i = 0; i < rutas; i++) {
            System.out.print("Ingrese el nombre de la ruta " + (i + 1) + ": ");
            vecRuta[i] = scanner.next();
        }

            //create the vector for chapilines
            String[] vecChapu = new String[chapulines];
            for (int a = 0; a < chapulines; a++) {
                System.out.print("Ingrese el nombre del chapulin " + (a + 1) + ": ");
                vecChapu[a] = scanner.next();
            }
            //create the matrix for declare the time
        int[][] tiempo = new int[rutas][chapulines];
        for(int i = 0;  i < chapulines ; i++) {
            System.out.println(" El chapulin "+vecChapu+":");
            for(int j = 0;  j < rutas; j++) {
                System.out.println("Ingrese el tiempo para la ruta "+vecRuta[j]+":");
               tiempo[i][j]= scanner.nextInt();

               // create the formula for the winner
                int ganador=0;
                int tiempoMenor= Integer.MAX_VALUE;

                for ( i= 0; i < chapulines; i++) {
                    int tiempoTotal = 0;
                    for (j = 0; j < rutas; j++) {
                        tiempoTotal += tiempo[i][j];
                    }
                    if (tiempoTotal < tiempoMenor) {
                        tiempoMenor = tiempoTotal;
                        ganador = i;
                    }
                }

            }
        }


    }
}