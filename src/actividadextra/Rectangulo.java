/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

import static java.lang.Math.sqrt;

/**
 *Clase que crea un rectángulo
 * @author alumno
 */
public class Rectangulo extends Superficie{
    private float base,altura,anguloDeInclinacion;
    private String color;
    /**
     * Constructor vacío
     */
    public Rectangulo() {
    }
    /**
     * Constructor con atributos
     * @param base Medida de la base del rectángulo
     * @param altura Medida de la altura del rectángulo
     * @param anguloDeInclinacion Ángulo de inclinación del rectángulo
     * @param color Color del rectángulo
     * @param dimension Dimensión en la que apreciamos el rectángulo
     */
    public Rectangulo(float base, float altura, float anguloDeInclinacion, String color, int dimension) {
        super(dimension);
        this.base = base;
        this.altura = altura;
        this.anguloDeInclinacion = anguloDeInclinacion;
        this.color = color;
    }
    
    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getAnguloDeInclinacion() {
        return anguloDeInclinacion;
    }
    public void setAnguloDeInclinacion(float anguloDeInclinacion) {
        this.anguloDeInclinacion = anguloDeInclinacion;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Método que saca el perímetro del rectángulo
     * @return Perímetro del rectángulo
     */
    public float perimetro(){
        return (2*base)+(2*altura);
    }
    /**
     * Método que saca el área del rectángulo
     * @return Área del rectángulo
     */
    public float area(){
        return base*altura;
    }
    /**
     * Método que obtiene la medida de la diagonal del rectángulo
     * @return Diagonal del Rectángulo
     */
    public float diagonal(){
        return (float) sqrt((base*base)+(altura*altura));
    }
    /**
     * ToString que imprime los atributos del rectángulo
     * @return Atributos del rectpangulo
     */
    @Override
    public String toString() {
        return super.toString()+"Rectangulo:[" + "base=" + base + ", altura=" + altura + ", anguloDeInclinacion=" + anguloDeInclinacion + "°" +", color=" + color + "]}";
    }
    /**
     * Método que dibuja un rectangulo
     */
    @Override
    public void dibujarse() {
        System.out.println("Se dibujó un rectangulo del color "+color);
    }
    /**
     * Método que mueve el rectangulo
     */
    @Override
    public void moverse() {
        System.out.println("Se movió el rectangulo");
    }
    /**
     * Método que borra el rectangulo
     */
    @Override
    public void borrarse() {
        System.out.println("Se borró el rectangulo");
    }
    /**
     * Método que crea un rectangulo
     */
    @Override
    public void crearse() {
        System.out.println("Se creó el rectangulo");
    }
}
