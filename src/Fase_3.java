/*
Fase 3

Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen

 */

import java.util.*;
import java.lang.*;

public class Fase_3 {

    public static void main(String[] args) {


        /*String name = "JONATAN";

ArrayList<Character> myName = new ArrayList<>(name.Arrays.asList(name.split(",")));

System.out.println(myName);*/

        Character[] Name= {'J','O','N','A','T','A','N'};

        ArrayList<Character> myName = new ArrayList<> (Arrays.asList(Name));

        Map<Character, Integer> myNameMap = new HashMap<>(); //Mapa

        for (int i=0; i<myName.size(); i++){

            Character c = myName.get(i);

            if (myNameMap.get(c)!=null){

                int contador = myNameMap.get(c);

                myNameMap.put(c, ++contador);
            }
            else { myNameMap.put(c, 1);}

        }
        System.out.println(myName);
        System.out.println(myNameMap);
        System.out.println("my Name's map size is " + myNameMap.size());

    }
}
