package Logica;

import javax.swing.*;

/**
 * Pila es una clase que define una estructura de datos que sigue el principio LIFO. Para su implementacion se va
 * a hacer uso del concepto de listas enlazadas.
 * @author Christopher Miranda
 */
public class Pila {

    private int cantidad;
    private Nodo tope;

    /**
     * Se crea una Pila sin recibir parámetros.
     */
    public Pila() {

        this.cantidad = 0;
        this.tope = null;
    }

    /**
     * Devuelve si la pila está vacía o no
     * @return devuelve el estado de la pila
     */
    public boolean isEmpty() {

        return this.tope == null;
    }

    /**
     * Agrega un elemento a la pila
     * @param entrada el valor del elemento
     * @param textArea area de texto de Swing UI
     */
    public void push(int entrada, JTextArea textArea){

        Nodo nuevoNodo = new Nodo(entrada, null);

        if(isEmpty()){

            this.tope = nuevoNodo;
        }else{

            nuevoNodo.setProximo(this.tope);
            this.tope = nuevoNodo;
        }

        refresh(textArea);
        cantidad++;
    }

    /**
     * Elimina la última entrada agregada de la pila
     * @param textArea area de texto de Swing UI
     */
    public void pop(JTextArea textArea){

        int valorEntrada;

        if(isEmpty()){

            JOptionPane.showMessageDialog(null, "ta vacio");
        }else{

            this.tope = tope.getProximo();
            refresh(textArea);
            cantidad--;
        }
    }

    /**
     * Agrega los elementos de una pila a otra al revés
     * @param pila pila donde se agregaran los elementos
     * @param textArea area de texto de Swing UI
     */
    public void revertStack(Pila pila, JTextArea textArea){

        Nodo aux = this.tope;

        while(aux != null){

            pila.push(aux.getEntrada(), textArea);
            aux = aux.getProximo();
        }
        pila.refresh(textArea);
    }

    /**
     * Muestra los elementos de la pila
     * @return devuelve un string con la información de las entradas de la pila
     */
    public String showElements(){

        StringBuilder stringcito = new StringBuilder();

        if(!isEmpty()){

            Nodo aux = this.tope;
            while(aux != null){

                stringcito.append(aux.getEntrada()).append(" ");
                aux = aux.getProximo();
            }

            return stringcito.toString();
        }else{

            return stringcito.toString();
        }
    }

    /**
     * Refresca el area de texto de Swing UI
     * @param textArea area de texto de Swing UI
     */
    public void refresh(JTextArea textArea){

        textArea.setText(showElements());
    }
}
