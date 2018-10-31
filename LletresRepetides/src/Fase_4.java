/*
Fase 4

Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra.

Fusiona les dues llistes en una sola. A més, afegeix una posició amb un espai buit entre la primera i la segona. És a dir, partim de la llista name i surname i al acabar l’execució només tindrem una que es dirà fullName.

	FullName: [‘N’, ‘A’, ‘M’, ‘E’, ‘ ‘, ‘S’, ‘U’, ‘R‘, ‘N’, ‘A’, ‘M’, ‘E’]

 */

import java.util.*;
import java.lang.*;

public class Fase_4 {

    public static void main(String[] args) {

        LinkedList<String> myName = new LinkedList<>();
        myName.add("J");
        myName.add("O");
        myName.add("N");
        myName.add("A");
        myName.add("T");
        myName.add("A");
        myName.add("N");

        LinkedList<String> mySurname = new LinkedList<>();
        mySurname.add("A");
        mySurname.add("R");
        mySurname.add("R");
        mySurname.add("O");
        mySurname.add("Y");
        mySurname.add("O");

        LinkedList<String> fullName = new LinkedList<>();
        fullName.addAll(myName);
        fullName.add(" ");
        fullName.addAll(mySurname);

    System.out.println("My nombre completo es " + fullName );

    }
}

