/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *Clase que crea una parabola
 * @author alumno
 */
public class Parabola extends Linea{
    float centroCoordX, centroCoordY, p;
    /**
     * Constructor vacío
     */
    public Parabola() {
    }
    /**
     * Constructor con parametros
     * @param centroCoordX Posición del centro en el eje x 
     * @param centroCoordY Posición del centro en el eje y
     * @param p Valor de p
     * @param dimension Dimensión en la que apreciamos la parabola
     */
    public Parabola(float centroCoordX, float centroCoordY, float p, int dimension) {
        super(dimension);
        this.centroCoordX = centroCoordX;
        this.centroCoordY = centroCoordY;
        this.p = p;
    }
    public float getCentroCoordX() {
        return centroCoordX;
    }
    public void setCentroCoordX(float centroCoordX) {
        this.centroCoordX = centroCoordX;
    }
    public float getCentroCoordY() {
        return centroCoordY;
    }
    public void setCentroCoordY(float centroCoordY) {
        this.centroCoordY = centroCoordY;
    }
    public float getP() {
        return p;
    }
    public void setP(float p) {
        this.p = p;
    }
    /**
     * Método que calcula el foco de la parabola
     */
    public void calcularFoco(){
        System.out.println("("+centroCoordX+","+centroCoordY+(1/4)*p+")");
    }
    /**
     * Método que indica el tipo de concavidad de la parabola
     */
    public void tipoConcavidad(){
        if (p>centroCoordY) {
            System.out.println("La concavidad es negativa");
        }
        else
            System.out.println("La concavidad es positiva");
    }
    /**
     * Método que indica la orientación de la parabola
     */
    public void orientacion(){
        System.out.println("Es una parabola vertical");
    }
    /**
     * Método que dibuja una parabola
     */
    @Override
    public void dibujarse() {
        System.out.println("Se dibujó una parabola");
    }
    /**
     * Método que mueve una parabola
     */
    @Override
    public void moverse() {
        System.out.println("Se movió la parabola");
    }
    /**
     * Método que borra la parabola
     */
    @Override
    public void borrarse() {
        System.out.println("Se borró la parabola");
    }
    /**
     * Método que crea una parabola
     */
    @Override
    public void crearse() {
        System.out.println("Se creó una parabola");
    }
    /**
     * ToString que imprime los atributos de la parabola
     * @return Atributos de la parabola
     */
    @Override
    public String toString() {
        return super.toString()+"Parabola{" + "centroCoordX=" + centroCoordX + ", centroCoordY=" + centroCoordY + ", p=" + p + '}';
    }
}
