package ar.edu.unahur.obj2.observer.subastador;

import ar.edu.unahur.obj2.observer.oferta.Oferta;
import ar.edu.unahur.obj2.observer.producto.Subastable;

public class Subastador implements ISubastador {
    private Oferta ultimaOferta;
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    @Override
    public Oferta getUltimaOferta(){
        return this.ultimaOferta;
    }
    @Override
    public void ofertar(Subastable producto) {
        Oferta oferta1 = new Oferta(ultimaOferta.getImporte() + 10);
        producto.recibirOferta(this, oferta1);
    }
    @Override
    public void setUltimaOferta(Oferta oferta) {
        this.ultimaOferta = oferta;
    }
    public Subastador(Oferta ultimaOferta, String nombre) {
        this.ultimaOferta = ultimaOferta;
        this.nombre = nombre;
    }
    public Subastador(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void actualizar(Oferta oferta){
        this.setUltimaOferta(oferta);
    }
}
