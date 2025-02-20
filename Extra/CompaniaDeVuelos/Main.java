package Extra.CompaniaDeVuelos;

import java.net.SecureCacheResponse;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int [][] matrizVuelos = new int[6][3];

        //Carga de Matriz
        for (int f = 0; f < matrizVuelos.length; f++) {
            for (int c = 0; c < matrizVuelos[f].length; c++) {
                matrizVuelos[f][c] = random.nextInt(100) + 1;
            }
        }

        System.out.println("Welcome System Software:");
        System.out.println("Destinos: \n" +
                "1) Rio Janeiro \n" +
                "2) Cancun \n" +
                "3) Madrid \n" +
                "4) Roma \n" +
                "5) Milan \n" +
                "6) Iguazo \n" +
                "Turnos: \n" +
                "1) Mañana - 2) Mediodia - 3) Noche");

        System.out.println("Ingrese a que Destino quiere llegar: ");
        int destino = scanner.nextInt();

        System.out.println("Ingrese Turno de Vuelo: ");
        int turnoVuelo = scanner.nextInt();

        System.out.println("Ingrese la cantidad de Pasajes: ");
        int cantidadPasajeros = scanner.nextInt();

        System.out.println("Usted ingresos: \n" +
                "Destino: " + destino + " - Turno Vuelo: " + turnoVuelo + " - Cantidad Pasajeros: " + cantidadPasajeros);
        //Mostrar Matriz
        /*for (int f = 0; f < matrizVuelos.length; f++) {
            System.out.println("Matriz Fila " + (f+1) + ": ");
            for (int c = 0; c < matrizVuelos[f].length; c++) {
                System.out.print(" " + matrizVuelos[f][c] + " | ");
            }
            System.out.println();
        }*/
    }
}
