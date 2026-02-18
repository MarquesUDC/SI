package es.udc.sistemasinteligentes.ejemplo;

import es.udc.sistemasinteligentes.EstrategiaBusqueda;
import es.udc.sistemasinteligentes.Nodo;
import es.udc.sistemasinteligentes.ProblemaBusqueda;

public class Main {

    public static void main(String[] args) throws Exception {
        ProblemaAspiradora.EstadoAspiradora estadoInicial = new ProblemaAspiradora.EstadoAspiradora(ProblemaAspiradora.EstadoAspiradora.PosicionRobot.IZQ,
                                                                                                    ProblemaAspiradora.EstadoAspiradora.PosicionBasura.AMBAS);
        ProblemaBusqueda aspiradora = new ProblemaAspiradora(estadoInicial);

        EstrategiaBusqueda buscador = new Estrategia4();
        // 1. Guardamos el resultado en una variable del tipo correcto
        Nodo[] solucion = buscador.soluciona(aspiradora);

        // 2. Recorremos el array desde el principio (índice 0) hasta el final (.length)
        for (int i = 0; i < solucion.length; i++) {

            // 3. Imprimimos el número del paso (i+1) y el nodo correspondiente
            // Al concatenar solucion[i] con un String, Java llama a su .toString()
            System.out.println((i + 1) + ". " + solucion[i].toString());
        }
    }
}
