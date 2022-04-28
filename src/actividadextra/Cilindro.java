/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *Clase que crea un cilindro
 * @author alumno
 */
public class Cilindro extends Volumen{
    private float altura, radio, centroCoordenadaX, centroCoordenadaY;
    private String color;
    /**
     * Constructor vacío
     */
    public Cilindro() {
    }
    /**
     * Constructor con parametros
     * @param altura Altura del cilindro
     * @param radio Radio del cilindro
     * @param centroCoordenadaX Centro del cilindro en la posición x
     * @param centroCoordenadaY Centro del cilindro en la posición y
     * @param color Color del cilindro
     * @param dimension Dimención donde se aprecia el cilindro
     */
    public Cilindro(float altura, float radio, float centroCoordenadaX, float centroCoordenadaY, String color, int dimension) {
        super(dimension);
        this.altura = altura;
        this.radio = radio;
        this.centroCoordenadaX = centroCoordenadaX;
        this.centroCoordenadaY = centroCoordenadaY;
        this.color = color;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getRadio() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }
    public float getCentroCoordenadaX() {
        return centroCoordenadaX;
    }
    public void setCentroCoordenadaX(float centroCoordenadaX) {
        this.centroCoordenadaX = centroCoordenadaX;
    }
    public float getCentroCoordenadaY() {
        return centroCoordenadaY;
    }
    public void setCentroCoordenadaY(float centroCoordenadaY) {
        this.centroCoordenadaY = centroCoordenadaY;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Método que imprime las coordenadas del cilindro
     */
    public void impresionCoordenada(){
        System.out.println("Coordenada del cilindro");
    }
    /**
     * Método que dibuja al cilindro
     */
    @Override
    public void dibujarse() {
        System.out.println("Se dibujó un cilindro");
    }
    /**
     * Método que mueve al cilindro
     */
    @Override
    public void moverse() {
        System.out.println("Se movió el cilindro");
    }
    /**
     * Método que borra al cilindro
     */
    @Override
    public void borrarse() {
        System.out.println("Se borró al cilindro");
    }
    /**
     * Método que crea un cilindro
     */
    @Override
    public void crearse() {
        System.out.println("Se creo un cilindro");
    }
    
}
