/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *Clase que crea una recta
 * @author alumno
 */
public class Recta extends Linea{
    private float coordenadaInicioX,coordenadaInicioY,coordenadaFinX, 
            coordenadaFinY;
    private String color;
    /**
     * Constructor vacío
     */
    public Recta() {
    }
    /**
     * Constructor con parametros
     * @param coordenadaInicioX Posición en x donde se encuentra el punto de inicio
     * @param coordenadaInicioY Posición en y donde se encuentra el punto de inicio
     * @param coordenadaFinX Posición en x donde se encuentra el punto Final
     * @param coordenadaFinY Posición en y donde se encuentra el punto Final
     * @param color Color de la recta
     * @param dimension Dimensión en la que apreciamos la recta
     */
    public Recta(float coordenadaInicioX, float coordenadaInicioY, float coordenadaFinX, float coordenadaFinY, String color, int dimension) {
        super(dimension);
        this.coordenadaInicioX = coordenadaInicioX;
        this.coordenadaInicioY = coordenadaInicioY;
        this.coordenadaFinX = coordenadaFinX;
        this.coordenadaFinY = coordenadaFinY;
        this.color = color;
    }
    public float getCoordenadaInicioX() {
        return coordenadaInicioX;
    }
    public void setCoordenadaInicioX(float coordenadaInicioX) {
        this.coordenadaInicioX = coordenadaInicioX;
    }
    public float getCoordenadaInicioY() {
        return coordenadaInicioY;
    }
    public void setCoordenadaInicioY(float coordenadaInicioY) {
        this.coordenadaInicioY = coordenadaInicioY;
    }
    public float getCoordenadaFinX() {
        return coordenadaFinX;
    }
    public void setCoordenadaFinX(float coordenadaFinX) {
        this.coordenadaFinX = coordenadaFinX;
    }
    public float getCoordenadaFinY() {
        return coordenadaFinY;
    }
    public void setCoordenadaFinY(float coordenadaFinY) {
        this.coordenadaFinY = coordenadaFinY;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Método que calcula la longitud de la recta
     * @return Valor de la longitud de la recta
     */
    public float longitud(){
        return (float)(Math.sqrt(Math.pow(coordenadaFinX-coordenadaInicioX,2)+Math.pow(coordenadaFinY-coordenadaInicioY, 2)));///Pendiente
    }
    /**
     * Método que calcula la pendiente de la recta
     * @return Valor de la pendiente de la recta
     */
    public float calcularPendiente(){
        return (float)(coordenadaFinY-coordenadaInicioY)/(coordenadaFinX-coordenadaInicioX);
    }
    /**
     * Método que calcula el ángulo de inclinación de la recta 
     * @return Valor del ángulo de inclinación de la recta 
     */
    public float calcularAnguloInclinacion(){
        float teta=(float) ((Math.atan(calcularPendiente()))*(180/Math.PI));
        return teta; 
    }
    /**
     * ToString que imprime los atributos de la recta
     * @return Atributos de la recta
     */
    @Override
    public String toString() {
        return super.toString()+"Recta{" + "coordenadaInicioX=" + coordenadaInicioX + ", coordenadaInicioY=" + coordenadaInicioY + ", coordenadaFinX=" + coordenadaFinX + ", coordenadaFinY=" + coordenadaFinY + ", color=" + color + '}';
    }
    /**
     * Método que dibuja una recta
     */
    @Override
    public void dibujarse() {
        System.out.println("Se dibujó una recta de color "+color);
    }
    /**
     * Método que mueve las coordenadas del punto inicial a (4,7)
     */
    @Override
    public void moverse() {
        this.coordenadaInicioX = 4;
        this.coordenadaInicioY = 7;
    }
    /**
     * Método que borra la recta
     */
    @Override
    public void borrarse() {
        System.out.println("Se borró la recta");
    }
    /**
     * Método que crea una recta
     */
    @Override
    public void crearse() {
        System.out.println("Se creó una recta");
    }
}
