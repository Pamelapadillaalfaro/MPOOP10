/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *Clase que crea una elipse
 * @author alumno
 */
public class Elipse extends Linea{
    private float a,b,centroCoordX,centroCoordY;
    /**
     * Constructor vacío
     */
    public Elipse() {
    }
    /**
     * Constructor con atributos
     * @param a Valor de a 
     * @param b Valor de b
     * @param centroCoordX Posición del centro en el eje x 
     * @param centroCoordY Posición del centro en el eje y 
     * @param dimension Dimensión en la que apreciamos la elipse
     */
    public Elipse(float a, float b, float centroCoordX, float centroCoordY, int dimension) {
        super(dimension);
        this.a = a;
        this.b = b;
        this.centroCoordX = centroCoordX;
        this.centroCoordY = centroCoordY;
    }
    public float getA() {
        return a;
    }
    public void setA(float a) {
        this.a = a;
    }
    public float getB() {
        return b;
    }
    public void setB(float b) {
        this.b = b;
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
    /**
     * Método que calcula el valor del eje mayor de la elipse
     * @return Valor del eje mayor de la elipse
     */
    public float calcularEjeMayor(){
        return (float)(a*2);
    }
    /**
     * Método que calcula el valor del eje menor de la elipse
     * @return Valor del eje menor de la elipse
     */
    public float calcularEjeMenor(){
        return (float)(b*2);
    }
    /**
     * Método que imprime la ecuación de la elipse
     */
    public void ecuacion(){
        System.out.println("(x-"+centroCoordX+")^2  +  (y-"+centroCoordY+"^2)\n"+"_________     _________\n"+"a^2           b^2");
    }
    /**
     * Método que dibuja una elipse
     */
    @Override
    public void dibujarse() {
        System.out.println("Se dibujó la elipse");
    }
    /**
     * Método que mueve la elipse
     */
    @Override
    public void moverse() {
        System.out.println("Se movió la elipse");
    }
    /**
     * Método que borra la elipse
     */
    @Override
    public void borrarse() {
        System.out.println("Se borró la elipse");
    }
    /**
     * Método que crea una elipse
     */
    @Override
    public void crearse() {
        System.out.println("Se creó una elipse");
    }
    /**
     * ToString que imprime los atributos de la elipse
     * @return Atributos de la elipse
     */
    @Override
    public String toString() {
        return super.toString()+"Elipse{" + "a=" + a + ", b=" + b + ", centroCoordX=" + centroCoordX + ", centroCoordY=" + centroCoordY + '}';
    }
    
}
