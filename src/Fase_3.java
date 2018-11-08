/*
Fase 3

Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen

 */

import java.util.*;
import java.lang.*;

public class Fase_3 {

    private static Map<Character, Integer> myNameMap = new HashMap<>();
    public static void main(String[] args) {


        Character[] Name= {'J','O','N','A','T','A','N'};

        ArrayList<Character> myName = new ArrayList<> (Arrays.asList(Name));


        for (int i=0; i<myName.size(); i++){  // mientras que i sea menor que el tamño de Mi Nombre

            Character c = myName.get(i);    // c es igual a coger la letra i de mi nombre

            itHasTheLetter(c);
        }
        System.out.println(myName);
        System.out.println(myNameMap);
        System.out.println("my Name's map size is " + myNameMap.size());

    }

    private static void itHasTheLetter(Character letter){
        if( myNameMap.containsKey(letter)){
            int contador = myNameMap.get(letter);
            myNameMap.put(letter, ++contador);

        }else{ myNameMap.put(letter, 1);}

    }

}
