package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inicializador();
    }

    private static void Inicializador() {
        Scanner teclado = new Scanner(System.in);
        boolean reiniciar = true;
        do {
            String menuseleccionado;
            do {
                Menu();
                menuseleccionado = teclado.nextLine();
            }while (!EsInteger(menuseleccionado));
            reiniciar = deseaseguir();
        }while (reiniciar==true);
    }

    private static boolean EsInteger(String text) {
            int v;
            try {
                v=Integer.parseInt(text);
                return true;
            } catch (NumberFormatException ex) {
                System.err.println("ese no es un numero, ingrese otra vez");
                return false;
            }

    }

    private static void Menu() {
            System.out.println("Elija la opcion que necesita el adminitrador (solo número)");
            System.out.println("opcion 1: Ingreso cliente ");
            System.out.println("opcion 2: Consultar estado de habitaciones");
            System.out.println("opcion 3: Reservar habitacion");
            System.out.println("opcion 4: Imprimir boleta");
            System.out.println("opcion 5: Reiniciar hotel");
    }

    private static void ingresoCliente() {
        System.out.println("ingreso de cliente  ");
    }

    private static boolean deseaseguir() {
        boolean repetir = true;
        do {
            System.out.println("Desea elegir otra opcion o salir (si, salir)");
            String otraOperacion = entradaS();
            if (otraOperacion.equals("salir")){
                repetir = false;
                return false;
            }else if (otraOperacion.equals("si")){
                repetir = false;
            }else {
                System.out.println("esa opcion no existe, ingrese otra vez");
            }
        }while (repetir==true);
        return true;
    }

    private static String entradaS() {
        Scanner teclado = new Scanner(System.in);
        String salida = teclado.nextLine();
        return salida;
    }

}