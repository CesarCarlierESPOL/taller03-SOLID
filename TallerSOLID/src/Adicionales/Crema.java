package Adicionales;

/**
 *
 * @author eacarras
 */
public final class Crema extends Aderezo {
    
    public Crema() {
        setNombre("crema");
    }
    
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
