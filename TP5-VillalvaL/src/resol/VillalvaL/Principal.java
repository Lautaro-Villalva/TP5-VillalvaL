package resol.VillalvaL;

import java.util.Scanner;

import resol.VillalvaL.Ejercicio1.claseEjercicio1;
import resol.VillalvaL.Ejercicio2.claseEjercicio2;

public class Principal {
public static void main(String[] args){       Scanner sc = new Scanner(System.in);

        System.out.println("Selecciona un ejercicio (1-2):");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1: claseEjercicio1.ejecutar(); break;
            case 2: claseEjercicio2.ejecutar(); break;
        }

        sc.close();
    }
}