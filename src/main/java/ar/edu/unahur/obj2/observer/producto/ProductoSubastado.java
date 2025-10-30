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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notificar'");
    }

    @Override
    public void recibirOferta(ISubastador subastador,Oferta oferta) {
       if(!this.ofertasRecibidas.contains(subastador)){
         throw new SubastadorNoEstaEnLaListaException();
       }
       this.ofertasRecibidas.add(oferta);
    }
    @Override
    public void reset(){
        this.ofertasRecibidas.clear();
        this.subastadores.clear();
    }
}
