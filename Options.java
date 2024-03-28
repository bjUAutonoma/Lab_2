/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package src.Matrices.java;
import Matrices.java;
import java.util.Scanner;
/**
 *
 * @author bjuan
 */

public class Options {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        //Matrices.generar_matriz();

        int bandera = 1;

        while (bandera == 1) {

            System.out.println("Elija una de las opciones:\n\n(1) Generar matriz\n(2) Obtener diagonal principal\n(3) Obtener triángulo inferior de la matriz\n(4) Obtener triángulo superior de la matriz\n(5) Finalizar");
            
            Scanner entrada = new Scanner(System.in);
            
            //int opciones = 0;
            
            int opciones = entrada.nextInt();
            
            switch (opciones) {

                case 1:
                    Matrices.generar_matriz();

                case 2:

                    Matrices.diagonal();

                case 3:

                    Matrices.inferior();

                case 4:
                
                    Matrices.superior();

                case 5:

                    break;

                default:

                    System.out.println("OPCIÓN INVÁLIDA");
            }
        }
    }
    
}
