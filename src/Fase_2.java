/*Fase 2
Canvia la taula per una llista (ArrayList)
Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’.
Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’.
*/


import java.util.Arrays;
import java.lang.*;

public class Fase_2 {

    private static Character[] vowels= {'A','E','I','O','U'}; //Matriz con las vocales

    public static void main(String[] args) {

        Character[] myName= {'J','O','N','A','7','A','N'}; //Matriz con datos de tipo String

        for (int i=0; i<myName.length; i++)

            if (isVowel(myName[i])) {
                System.out.println(myName[i] + " es una" + " VOCAL");

            } else if (Character.isDigit(myName[i])) {
                System.out.println(myName[i] + " NO ES UNA LETRA, ES UN NUMERO!!!!");

            } else {
                System.out.println(myName[i] + " es una" + " CONSONANT ");
            }
    }

    private static boolean isVowel(char letter){
        return Arrays.asList(vowels).contains(letter);
    }

}