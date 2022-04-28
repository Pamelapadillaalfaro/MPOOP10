/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *Clase abstracta que crea una linea
 * @author alumno
 */
public abstract class Linea implements FiguraGeometrica{
    private int dimension;
    /**
     * Constructor vacío
     */
    public Linea() {
    }
    /**
     * Constructor con atributos
     * @param dimension 
     */
    public Linea(int dimension) {
        this.dimension = dimension;
    }
    public int getDimension() {
        return dimension;
    }
    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
    /**
     *To string que imprime los atributos de una linea
     * @return Atributos de una linea
     */
    @Override
    public String toString() {
        return "Linea{" + "dimension=" + dimension + '}';
    }   
}
