package bol8_2;

import java.util.Scanner;

/**
 *
 * @author jalvarezbarciela
 */
public class Descuento {

    private int prezo;
    private int unidades;
    private int prezoFinal;
    private float desconto;
    Scanner sc = new Scanner(System.in);
    
    public Descuento(){
    
}
   
    
    public void Descuento() {
        System.out.println("Cal e o prezo do producto?");
        prezo = sc.nextInt();
        System.out.println("Cantas unidades do producto?");
        unidades = sc.nextInt();
        if (unidades < 100) {
            System.out.println("Non hay desconto");
            prezoFinal = (unidades * prezo);
            System.out.println(prezoFinal);
        } else if (unidades < 200) {
            prezoFinal = (unidades * prezo);
            if (prezoFinal > 4000) {
               desconto = (float) 0.05;
               prezoFinal=(int) (prezoFinal-prezoFinal*desconto);
            } else {
                desconto = (float) 0.02;
                prezoFinal=(int) (prezoFinal-prezoFinal*desconto);
            }
        } else if (unidades >= 200) {
            prezoFinal = (unidades * prezo);
            if (prezoFinal > 4000) {
                desconto = (float) 0.10;
                prezoFinal=(int) (prezoFinal-prezoFinal*desconto);
            } else {
                desconto = (float) 0.08;
                prezoFinal=(int) (prezoFinal-prezoFinal*desconto);
            }
        }
        System.out.println("Unidades "+unidades);
        System.out.println("Prezo unitario "+prezo);
        System.out.println("Desconto "+desconto*100+"%");
        System.out.println("Total a pagar "+prezoFinal);
    }
}
