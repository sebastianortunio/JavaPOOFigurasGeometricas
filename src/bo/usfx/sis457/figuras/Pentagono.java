/*
 * Archivo que contiene la Clase Pentagono 
 */
package bo.usfx.sis457.figuras;

/**
 * Clase Pentagono
 */
public class Pentagono {
    private double Lado;
    private double Apotema;

    /**
     * Método constructor, crea el Pentagono con las propiedades Lado y Altura
     * @param lado Valor tipo double
     * @param apotema Valor tipo double
     */
    public Pentagono (double lado, double apotema) {
        this.Lado = lado;
        this.Apotema = apotema;
    }
    
    /**
     * Método constructor, crea el Pentagono con valores por defecto
     */
    public Pentagono() {
        // Llama al método constructor anterior
        this(0, 0);
    }

    /**
     * Método que retorna el valor del Lado 
     * @return Retorna el valor de la Lado en tipo double
     */
    public double getLado() {
        return Lado;
    }

    /**
     * Método que modifica el valor del Lado
     * @param lado Valor de tipo double
     */
    public void setLado(double lado) {
        this.Lado = lado;
    }

    /**
     * Método que retorna el valor de la Apotema 
     * @return Retorna el valor de la Apotema en tipo double
     */
    public double getApotema() {
        return Apotema;
    }

    /**
     * Método que modifica el valor de la Apotema
     * @param apotema
     */
    public void setApotema(double apotema) {
        this.Apotema = apotema;
    }
    
    /**
     * Método que retorna el area del Pentagono
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        return ((5*this.Lado * this.Apotema)/2);
    }
    
    /**
     * Método que retorna el perimetro del Pentagono
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        return (5*this.Lado) ;
    }
}

