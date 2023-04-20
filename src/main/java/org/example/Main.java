package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] n=crearMatriz();
        consultarEstado(n);

    }

    private static int[][] crearMatriz() {
        int[][] matriz = new int[3][10];
        return matriz;
    }
    public static void consultarEstado(int[][]  matriz){
        // 3.ocupado 1.reservado 0.disponible
        int sala= convertirString(pedirDatos());
        int estado = matriz[0][sala];

        String estadoFinal= EstadoHabitacion(estado);
        mostraEstadp(estadoFinal);

    }
    public static String pedirDatos(){
        Scanner sc = new Scanner(System.in);
        String consulta = "";
        do {
            System.out.println("ingrese habitación");
            consulta = sc.nextLine();
        } while (!EsInteger(consulta));

        return consulta;

    }
    private static int convertirString(String text){
        int v= 0;
        v=Integer.parseInt(text);
        return v;
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
    private static String EstadoHabitacion(int estado){
        String estadonuevo= "";
        if(estado==0){
            estadonuevo= "Disponible";
        } else if (estado == 1) {
            estadonuevo= "Reservado";

        } else if (estado == 2) {
            estadonuevo= "Ocupado";

        }else{
            System.out.println("no es una opción valida");
        }

        return  estadonuevo;
    }
    private static void mostraEstadp(String estado){
        System.out.println("El estado de la habitación es :"+estado);

    }
    private static int [][]eservarHabitación(int[][] matriz){
        int sala= convertirString(pedirDatos());
        int estado = matriz[0][sala];
        estado = 1;
        return matriz;

    }
}