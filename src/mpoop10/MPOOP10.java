/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop10;

import actividadextra.Elipse;
import actividadextra.Recta;

/**
 *Clase Principal
 * @author alumno
 */
public class MPOOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Haremos interfaz de instrumento musical
        Flauta flauta=new Flauta();
        System.out.println(flauta.tipoInstrumento());
        
        //Heredar a los hijos en los padres
        InstrumentoMusical instrumento = flauta;
        instrumento.tocar();
        instrumento.afinar();
        //Interfacez se utilizan porque ya estan ahi para siempre
        double pi= Math.PI; //Todas las letras con mayusculas son constantes.
        System.out.println(pi);
        double e= Math.E;
        System.out.println(e);
        System.out.println(Math.abs(-100));
        
        System.out.println("El mes "+Meses.NUEVE+" corresponde a:");
        System.out.println(Meses.NOMBRE_MESES[Meses.NUEVE]);
        
        System.out.println("#####Acticidad Extra#####");
        Recta recta=new Recta(0,4,8,10,"Verde",2);
        float longRecta=recta.longitud();
        System.out.println("Longitud = "+longRecta);
        float pendiente= recta.calcularPendiente();
        System.out.println("Pendiente = "+pendiente);
        float angulo= recta.calcularAnguloInclinacion();
        System.out.println("Angulo= "+angulo);
        recta.borrarse();
        Elipse elipse=new Elipse(2,3,0,0,2);
        elipse.ecuacion();
    }
}
