package app;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SistemaParqueadero {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        menuSistema();

        int opcionMenu = sc.nextInt();

        switch (opcionMenu) {
            case 1:
                disponibilidadCeldas();
            case 2:

            case 3:

            case 4:

            case 5:

            case 6:
                System.out.println("Gracias por usar el sistema del parqueadero");
                System.out.println("Saliendo del sistema");

        }
        disponibilidadCeldas();
    }

    public static void menuSistema() {

        System.out.println("Bienvendido al sistema de ingreso del parqueadero");
        System.out.println(" ");
        System.out.println("Seleccione una opcion");
        System.out.println(" ");
        System.out.println("1. Consultar disponibilidad de celdas");
        System.out.println("2. Registrar entrada de vehiculos (por numero de celda)");
        System.out.println("3. Registrar salida de vehiculos (por numero de celda)");
        System.out.println("4. Calcular total a pagar");
        System.out.println("5. Reportes de opcupacion");
        System.out.println("6. Salir");
    }

    public static void disponibilidadCeldas() {

        int totalCeldas = 10;

        System.out.println("Seleccione el numero de celda que quiere averiguar");
        int numeroCelda = sc.nextInt();

        if (numeroCelda <= 0) {


        }
    }
}
