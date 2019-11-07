package bol8_1;

import java.util.Scanner;

/**
 *
 * @author jalvarezbarciela
 */
public class Suma {

    private int ventas;
    Scanner teclado = new Scanner(System.in);

    public Suma() {
    }

    public Suma(int ventas) {
        this.ventas = ventas;
    }

    public void setCantidad(Scanner teclado) {
        System.out.println("Escribe la cantidad:");
        ventas = teclado.nextInt();
    }

    public int getVentas() {
        return ventas;
    }

    public void porcentajes() {
        if (ventas<0)
            System.out.println("Las ventas no pueden ser menores que 0");
        else if (ventas <= 500) {
            System.out.println("Cantidad: " + ventas + "\nIncremeto: " + ventas * 50 / 100 + "\nCantidad Final:" + (ventas + ((ventas * 50) / 100)));
        } else if (ventas <= 1000) {
            System.out.println("Cantidad: " + ventas + "\nIncremeto: " + ventas * 7 / 100 + "\nCantidad Final:" + (ventas + ((ventas * 7) / 100)));
        } else if (ventas <= 5000) {
            System.out.println("Cantidad: " + ventas + "\nIncremeto: " + ventas * 15 / 100 + "\nCantidad Final:" + (ventas + ((ventas * 15) / 100)));
        } else {
            System.out.println("Cantidad: " + ventas + "\nIncremeto: -" + ventas * 3 / 100 + "\nCantidad Final:" + (ventas - ((ventas * 3) / 100)));
        }
    }
}
