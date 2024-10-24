package Logica;

/**
 * Nodo es una clase que define a un elemento perteneciente a una pila.
 * @author Christopher Miranda
 */
public class Nodo {

    private int entrada;
    private Nodo proximo;

    /**
     * Para crear un Nodo se debe introducir su valor y reservar la memoria para el siguiente nodo
     * @param entrada valor del nodo
     * @param proximo reserva de memoria para el siguiente nodo, siempre se debe ser null
     */
    public Nodo(int entrada, Nodo proximo) {

        this.entrada = entrada;
        this.proximo = proximo;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
}
