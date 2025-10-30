package ar.edu.unahur.obj2.observer.producto;

import ar.edu.unahur.obj2.observer.oferta.Oferta;
import ar.edu.unahur.obj2.observer.subastador.*;

public interface Subastable {
    void notificar();
    void recibirOferta(ISubastador subastador, Oferta oferta);
    void reset();
    Oferta getUltimaOfertaRecibida();

}
