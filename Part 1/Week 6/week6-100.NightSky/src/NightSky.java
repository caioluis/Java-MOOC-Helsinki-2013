/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caio
 */
import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint = 0;

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public NightSky(double density, int width, int height) {
        this.width = width;
        this.height = height;
        this.density = density;
    }

    public void printLine() {
        Random r = new Random();
        for (int i = 0; i < this.width; i++) {
            double probablyStar = r.nextDouble();
            if (probablyStar < this.density) {
                System.out.print("*");
                starsInLastPrint++;

            } else {
                System.out.print(" ");
            }
        }
        
        System.out.println(" ");

    }

    public void print() {
        starsInLastPrint = 0;
        for (int i = 0; i < this.height; i++) {
            printLine();
        }
        System.out.println("");
    }

    public int starsInLastPrint() {
        return starsInLastPrint;
    }

}
