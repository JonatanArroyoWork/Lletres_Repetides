

/*Fase 2

Canvia la taula per una llista (ArrayList)
Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’.

Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’.
*/

import java.util.ArrayList;
public class Nom_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       ArrayList<String> nombreLetras = new ArrayList<>();
	        nombreLetras.add("J");
	        nombreLetras.add("0");
	        nombreLetras.add("N");
	        nombreLetras.add("A");
	        nombreLetras.add("T");
	        nombreLetras.add("A");
	        nombreLetras.add("N");

	       
	        for (int i=0; i<7; ++i) {
	        	if(nombreLetras.get(i)==("A") || nombreLetras.get(i)==("E") || 
	        			nombreLetras.get(i)==("I") || nombreLetras.get(i)==("O")
	        			|| nombreLetras.get(i)==("U")) 
	        			{
	        		System.out.println(nombreLetras.get(i)+ " es una" + " VOCAL");
	        			}
	        	else if (nombreLetras.get(i)==("0") || nombreLetras.get(i)==("1") || nombreLetras.get(i)==("2") || 
	        			nombreLetras.get(i)==("3") || nombreLetras.get(i)==("4")
	        			|| nombreLetras.get(i)==("5") || nombreLetras.get(i)==("6") || 
	    	        			nombreLetras.get(i)==("7") || nombreLetras.get(i)==("8")
	    	        			|| nombreLetras.get(i)==("9")) 
	        			{
	        		System.out.println(nombreLetras.get(i)+ " es un" + " ELS NOMS DE PERSONES NO CONTENEN NUMEROS ");
	        	}
	        	else {
	        		System.out.println(nombreLetras.get(i)+ " es una" + " CONSONANT "); 
	        	}
	   
	        }
	}

}
