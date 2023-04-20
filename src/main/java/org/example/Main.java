package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    private static int[][] crearMatriz() {
        int[][] matriz = new int[3][10];
        return matriz;
    }
    private static String consultarEstado(int[][]  matriz){
        // 3.ocupado 2.reservado 1.disponible
        int sala= pedirDatos();
        int estado = matriz[0][sala];

        String estadoFinal= EstadoHabitacion(estado);
        return estadoFinal;

    }
    private static int pedirDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese habitación");
        int consulta= sc.nextInt();
        return consulta;

    }
    private static String EstadoHabitacion(int estado){
        String estadonuevo= "";
        if(estado==1){
            estadonuevo= "Disponible";
        }
        if(estado==2){
            estadonuevo="Reservado";
        }
        if(estado==3){
            estadonuevo="Ocupado";
        }else{
            System.out.println("no esta esta opción");
        }
        return  estadonuevo;
    }
}