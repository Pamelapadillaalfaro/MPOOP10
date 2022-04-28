/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *Clase abstracta para una superficie
 * @author alumno
 */
public abstract class Superficie implements FiguraGeometrica {
    private int dimension;
/**
 * Constructor Vacío
 */
    public Superficie() {
    }
/**
 * COnstructor con atributos
 * @param dimension Dimensión en la que se aprecia a la superficie
 */
    public Superficie(int dimension) {
        this.dimension = dimension;
    }
    public int getDimension() {
        return dimension;
    }
    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
/**
 * To string que imprime los atributos de una superficie
 * @return Atributos de una superficie
 */
    @Override
    public String toString() {
        return "{Superficie: " + "Dimension R=" + dimension+", " ;
    }
    
    
    
}
