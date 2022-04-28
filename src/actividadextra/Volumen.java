/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *Clase abstracta que crea un volumen
 * @author alumno
 */
public abstract class Volumen implements FiguraGeometrica{
    private int dimension;
    /**
     * Constructor vacío
     */
    public Volumen() {
    }
    /**
     * Constructor con atributos
     * @param dimension Dimension donde se aprecia el volumen
     */
    public Volumen(int dimension) {
        this.dimension = dimension;
    }
    public int getDimension() {
        return dimension;
    }
    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
    /**
     * To string que imprime los atributos de un volumen
     * @return Atributos de un volumen
     */
    @Override
    public String toString() {
        return "Volumen{" + "dimension=" + dimension + '}';
    }
}
