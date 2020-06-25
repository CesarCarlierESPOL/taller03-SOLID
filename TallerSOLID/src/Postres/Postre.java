/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Procesos.ManejadorDePrecio;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author LEGION
 */
public class Postre extends ManejadorDePrecio {
    protected String sabor;
    protected double precioParcial;
    protected ArrayList<Aderezo> aderezos;
        
    public Postre(String Sabor,double PrecioParcial){
        super(PrecioParcial);
        aderezos= new ArrayList<>();
        this.sabor=Sabor;
        this.precioParcial = PrecioParcial;
    }
    
    public void anadirAderezo(Aderezo aderezo){
        aderezos.add(aderezo);
        this.totalAderezos ++;
    }
    public void quitarAderezo(Aderezo aderezo){
        aderezos.remove(aderezo);
        this.totalAderezos --;
    }
    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
}
