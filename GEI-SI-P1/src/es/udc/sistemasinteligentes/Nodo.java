package es.udc.sistemasinteligentes;

public class Nodo {
    public Estado estado;
    public Nodo padre;
    public Accion accion;

    public Nodo(Estado estado){
        this.estado = estado;
        this.padre = null;
        this.accion = null;
    }
    public Nodo(Estado estado, Nodo padre, Accion accion) {
        this.estado = estado;
        this.padre = padre;
        this.accion = accion;
    }

    public Accion getAccion() {
        return accion;
    }
    public Estado getEstado() {
        return estado;
    }
    public Nodo getPadre() {
        return padre;
    }
    @Override
    public String toString() {
        if (accion == null) {
            return "Estado inicial: " + estado;
        } else {
            return "Acción: " + accion + " -> Estado: " + estado;
        }
    }
}
