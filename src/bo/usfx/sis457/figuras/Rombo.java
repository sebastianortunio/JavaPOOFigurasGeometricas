/*
 * Archivo que contiene la Clase Rombo 
 */
package bo.usfx.sis457.figuras;

/**
 * Clase 
 * @author Marcelo
 */
public class Rombo {
    private double DiagonalMayor;
    private double DiagonalMenor;
    private double Lado;
    /**
     * Método constructor, crea el Rombo con las propiedades DiagonalMayor DiagonalMenor Lado
     * @param diagonalMayor Valor tipo double
     * @param diagonalMenor Valor tipo double
     * @param lado Valor tipo double
     */
    public Rombo(double diagonalMayor, double diagonalMenor, double lado ) {
        this.DiagonalMayor = diagonalMayor;
        this.DiagonalMenor = diagonalMenor;
        this.Lado = lado;
    }
    
    /**
     * Método constructor, crea el Rombo con valores por defecto
     */
    public Rombo() {
        // Llama al método constructor anterior
        this(0,0,0);
    }

    /**
     * Método que retorna el valor de la DiagonalMayor 
     * @return Retorna el valor de la DiagonalMayor en tipo double
     */
    public double getDiagonalMayor() {
        return DiagonalMayor;
    }

    /**
     * Método que modifica el valor de la DiagonalMayor
     * @param diagonalMayor Valor de tipo double
     */
    public void setDiagonalMayor(double diagonalMayor) {
        this.DiagonalMayor = diagonalMayor;
    }

    /**
     * Método que retorna el valor de DiagonalMenor
     * @return Retorna el valor de DiagonalMenor en tipo double
     */
    public double getDiagonalMenor() {
        return DiagonalMenor;
    }

    /**
     * Método que modifica el valor de la DiagonalMenor
     * @param diagonalMenor Valor de tipo double
     */
    public void setDiagonalMenor(double diagonalMenor) {
        this.DiagonalMenor=diagonalMenor;
    }
    /**
     * Método que retorna el valor de Lado
     * @return Retorna el valor de Lado en tipo double
     */
    public double getLado() {
        return Lado;
    }

    /**
     * Método que modifica el valor de Lado
     * @param lado Valor de tipo double
     */
    public void setLado(double lado) {
        this.Lado = lado;
    }
    /**
     * Método que retorna el area del Rombo
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        return ((this.DiagonalMayor * this.DiagonalMenor)/2);
    }
    
    /**
     * Método que retorna el perimetro del Rectangulo
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        return (4*this.Lado);
    }
}
