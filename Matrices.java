/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;
/**
 *
 * @author bjuan
 */
public class Matrices {

    private int[][] matriz;

    public Matrices(int[][] matriz) {

        this.matriz = matriz;
        
    }

    public int[][] get_matriz() {

        return this.matriz;
        
    }
    public void set_matriz(int[][] n_matriz) {

        this.matriz = n_matriz;
    }

    public static void generar_matriz() {

        Random aleatorio = new Random();

        int[][] sub_matriz = new int[4][4];

        for (int i=0;i<4;i++) {

            for (int j=0;j<4;j++) {

                sub_matriz[i][j] = aleatorio.nextInt(21)-10;
                
                //Matrices.set_matriz(sub_matriz);

                this.matriz[i][j] = aleatorio.nextInt(21)-10;

                //this.matriz[i][j] = matriz[i][j];
                
            }
        }
        //return sub_matriz;
        
        //this.matriz = sub_matriz;

        //return matriz;
    }
    public static void diagonal() {

        for (int i=0;i<4;i++) {


            System.out.println(this.matriz[i][i]);

        }
    }
    public static void inferior() {

        for (int i=0;i<4;i++) {
            for (int j=0;j<4;j++) {
                if (i>j) {
                    System.out.println(this.matriz[i][j]);
                }
            }
        }
    }
    public static void superior() {
     
        for (int i=0;i<4;i++) {
            for (int j=0;j<4;j++) {
                if (i<j) {
                    System.out.println(this.matriz[i][j]);
                }
            }
        }
    }
}
