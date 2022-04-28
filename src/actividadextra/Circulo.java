/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *Clase que crea un círculo
 * @author alumno
 */
public class Circulo extends Superficie{
    private float radio,centroX,centroY;
    private String color;
    /**
     * Constructor Vacío
     */
    public Circulo() {
    }
    /**
     * Constructor con atributos
     * @param radio Medida del centro a la circunferencia del círculo
     * @param centroX En que parte se encuentra el centro del circulo en el eje de las x 
     * @param centroY En que parte se encuentra el centro del circulo en el eje de las y 
     * @param color Color del circulo
     * @param dimension Dimensión en la que apreciamos la figura
     */
    public Circulo(float radio, float centroX, float centroY, String color, int dimension) {
        super(dimension);
        this.radio = radio;
        this.centroX = centroX;
        this.centroY = centroY;
        this.color = color;
    }
    public float getRadio() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }
    public float getCentroX() {
        return centroX;
    }
    public void setCentroX(float centroX) {
        this.centroX = centroX;
    }
    public float getCentroY() {
        return centroY;
    }
    public void setCentroY(float centroY) {
        this.centroY = centroY;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    /**
    * Método que obtiene el perimetro del circulo
    * @return Perimetro del circulo
    */
    public float perimetro(){
        return (float) (Math.PI*2*radio);
    }
    /**
     * Método que obtiene el área delcírculo
     * @return Área del círculo
     */
    public float area(){
        return (float) (Math.PI*radio*radio);
    }
    /**
     * Método que obtiene la ecuación del círculo
     */
    public void obtenerEcuacion(){
        System.out.println("(x"+-centroX+")^2+(y"+-centroY+")^2="+(radio*radio));
    }
    /**
     * ToString que imprime losatributos del círculo
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"Circulo:[" + "radio=" + radio + ", h(centroX)=" + centroX + ", k(centroY)=" + centroY + ", color=" + color + "]}";
    }
    /**
     * Método que dibuja un circulo
     */
    @Override
    public void dibujarse() {
        System.out.println("Se dibujo el Circulo");
    }
    /**
     * Método que mueve el circulo para que su centro este en (4,5)
     */
    @Override
    public void moverse() {
        this.centroX = 4;
        this.centroY = 5;
    }
    /**
     * Método que borra el circulo
     */
    @Override
    public void borrarse() {
        System.out.println("Se borró el circulo");
    }
    /**
     * Método que crea el circulo
     */
    @Override
    public void crearse() {
        System.out.println("Se creo el circulo");
    }
}
