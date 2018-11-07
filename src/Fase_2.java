/*Fase 2
Canvia la taula per una llista (ArrayList)
Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’.
Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’.
*/


import java.util.Arrays;
import java.lang.*;

public class Fase_2 {

    public static void main(String[] args) {

        Character[] myName= {'J','O','N','A','7','A','N'}; //Matriz con datos de tipo String
        Character[] vowels= {'A','E','I','O','U'}; //Matriz con las vocales

        for (int i=0; i<7; i++)

            if (Arrays.asList(vowels).contains(myName[i])) {
                System.out.println(myName[i] + " es una" + " VOCAL");

            } else if ((Boolean) Character.isDigit(myName[i])) {
                System.out.println(myName[i] + " NO ES UNA LETRA, ES UN NUMERO!!!!");

            } else {
                System.out.println(myName[i] + " es una" + " CONSONANT ");
            }

    }
}