/*
 * Archivo que contiene la Clase Triangulo 
 */
package bo.usfx.sis457.figuras;

/**
 * Clase Triangulo que calcula el área y perímetro en base a su lado
 */
public class Triangulo {
    private float Lado ; //Lado de un triangulo equilatero 
    
    
    /**
     * Método constructor, crea el Triangulo con valores por defecto
     */
    public Triangulo () {
        this.Lado = 0;
    }
    
    /**
     * Método constructor, crea el Triangulo con la propiedad lado
     * @param lado Valor tipo float
     */
    public Triangulo (float lado) {
        this.Lado = lado;
    }

    /**
     * Método que retorna el valor del Lado 
     * @return Devuelve el valor del Lado en tipo float
     */
    public float getLado() {
        return Lado;
    }

    /**
     * Método que modifica el valor del lado
     * @param lado Valor de tipo float
     */
    public void setLado(float lado) {
        this.Lado = lado;
    }
    
    /**
     * Método que retorna el area del Triangulo
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        return ((Math.sqrt(3) * Math.pow(this.Lado, 2))/4);
    }
    
    /**
     * Método que retorna el perimetro del Triangulo
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        return (3* this.Lado);
    }
}