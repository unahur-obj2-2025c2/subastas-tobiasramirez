package ar.edu.unahur.obj2.observer.producto;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.observer.SubastadorNoEstaEnLaListaException;
import ar.edu.unahur.obj2.observer.oferta.Oferta;
import ar.edu.unahur.obj2.observer.subastador.*;

public class ProductoSubastado implements Subastable{
    private List<Oferta> ofertasRecibidas = new ArrayList<>();
    private List<ISubastador> subastadores = new ArrayList<>();

    @Override
    public void notificar() {
        this.subastadores.forEach(s->s.actualizar(this.getUltimaOfertaRecibida()));
    }

    @Override
    public void recibirOferta(ISubastador subastador,Oferta oferta) {
       if(!this.subastadores.contains(subastador)){
         throw new SubastadorNoEstaEnLaListaException();
       }
       this.ofertasRecibidas.add(oferta);
       this.notificar();

    }
    @Override
    public void reset(){
        this.ofertasRecibidas.clear();
        this.subastadores.clear();
    }
    @Override
    public Oferta getUltimaOfertaRecibida(){
        return this.ofertasRecibidas.getLast();
    }

    public ProductoSubastado(List<Oferta> ofertasRecibidas, List<ISubastador> subastadores) {
        this.ofertasRecibidas = ofertasRecibidas;
        this.subastadores = subastadores;
    }

    public ProductoSubastado() {
    }
    
}
