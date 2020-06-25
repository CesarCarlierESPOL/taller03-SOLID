package Procesos;

/**
 *
 * @author eacarras
 */
public class ManejadorDePrecio {
    
    protected double precioParcial;
    protected int totalAderezos;
    
    public ManejadorDePrecio(double precioParcial) {
        this.precioParcial = precioParcial;
        this.totalAderezos = 0;
    }
    
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal = (precioParcial + (precioParcial * 0.12))+(totalAderezos * 0.50);
        
        return precioFinal;
    }
    
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }
}
