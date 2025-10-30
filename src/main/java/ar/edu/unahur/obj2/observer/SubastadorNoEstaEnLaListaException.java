package ar.edu.unahur.obj2.observer;

public class SubastadorNoEstaEnLaListaException extends RuntimeException {
    public SubastadorNoEstaEnLaListaException(){
        super("el subastador no participa en la subasta");
    }
}
