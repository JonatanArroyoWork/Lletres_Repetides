/*Fase 1

Crea una taula amb el teu nom on cada posició correspongui a una lletra.
Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres.*/

import java.util.*;
public class Nom_Taula {

	public static void main(String[] args) {
        LinkedList<String> nombreLetras=new LinkedList<>();
        nombreLetras.add("J");
        nombreLetras.add("O");
        nombreLetras.add("N");
        nombreLetras.add("A");
        nombreLetras.add("T");
        nombreLetras.add("A");
        nombreLetras.add("N");
        
         //System.out.println(nombreLetras);
         
        int i=0;
        for (i=0; i<7; i++) {
        	System.out.println(nombreLetras.get(i));
        }

	}

}
