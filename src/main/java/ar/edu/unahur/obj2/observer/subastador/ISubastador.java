package ar.edu.unahur.obj2.observer.subastador;

import ar.edu.unahur.obj2.observer.oferta.Oferta;
import ar.edu.unahur.obj2.observer.producto.Subastable;

public interface ISubastador {
    Oferta getUltimaOferta();
    void ofertar(Subastable producto);
    void setUltimaOferta(Oferta oferta);
    void actualizar(Oferta oferta);
}
