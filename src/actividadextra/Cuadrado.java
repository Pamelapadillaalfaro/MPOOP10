/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

import static java.lang.Math.sqrt;

/**
 *Clase que crea un cuadrado
 * @author alumno
 */
public class Cuadrado extends Superficie{
    private float lado,anguloDeInclinacion;
    private String color;
    /**
     * Constructor vacío
     */
    public Cuadrado() {
    }
    /**
     * Constructor conatributos
     * @param lado Medida de un lado del cuadrado
     * @param anguloDeInclinacion Ángulo al que esta inclinadoel cuadrado
     * @param color Color del cuadrado
     * @param dimension Dimensión en que apreciamos al cuadrado
     */
    public Cuadrado(float lado, float anguloDeInclinacion, String color, int dimension) {
        super(dimension);
        this.lado = lado;
        this.anguloDeInclinacion = anguloDeInclinacion;
        this.color = color;
    }

    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
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
     * Método que obtiene el perímetro de un cuadrado
     * @return Perímetro del cuadrado
     */
    public float perimetro(){
        return 4*lado;
    }
    /**
     * Método que obtiene el area de un cuadrado
     * @return Área del cuadrado
     */
    public float area(){
        return lado*lado;
    }
    /**
     * Método que obtiene la medida de la diagonal de un cuadrado
     * @return Medida de la diagonal del cuadrado
     */
    public float diagonal(){
        return (float) sqrt(2*lado*lado);
    }
    /**
     * To string que imprime los atributos del cuadrad
     * @return Atributos del cuadrado
     */
    @Override
    public String toString() {
        return super.toString()+"Cuadrado:[" + "lado= " + lado + ", anguloDeInclinacion= " + anguloDeInclinacion +"° "+", color= " + color + "]}";
    }
    /**
     * Método que dibuja un cuadrado
     */
    @Override
    public void dibujarse() {
        System.out.println("Se dibujo un cuadrado de color "+color);
    }
    /**
     * Método que mueve al cuadrado
     */
    @Override
    public void moverse() {
        System.out.println("Se movió al cuadrado");
    }
    /**
     * Método que borra al cuadrado
     */
    @Override
    public void borrarse() {
        System.out.println("Se borró al cuadrado");
    }
    /**
     * Método que crea un cuadrado
     */
    @Override
    public void crearse() {
        System.out.println("Se creó un cuadrado");
    }
}
