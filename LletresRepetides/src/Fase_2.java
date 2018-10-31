/*Fase 2
Canvia la taula per una llista (ArrayList)
Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’.
Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’.
*/


public class Fase_2 {

    public static void main(String[] args) {

        String [] myName= {"J","O","N","A","7","A","N"}; //Matriz con datos de tipo String

        for (int i=0; i<7; i++) {
            if(myName[i].equals("A") || myName[i].equals("E") || myName[i].equals("I") || myName[i].equals("O") ||
                    myName[i].equals("U")) {
                System.out.println(myName[i]+ " es una" + " VOCAL");
            }
            else if
            (myName[i].equals("0") || myName[i].equals("1") || myName[i].equals("2") || myName[i].equals("3") ||
                            myName[i].equals("4") || myName[i].equals("5") || myName[i].equals("6") || myName[i].equals("7") ||
                            myName[i].equals("8") || myName[i].equals("9"))   {

                System.out.println(myName[i]+ " es un" + " NO ES UNA LETRA, ES UN NUMERO!!!!");
            }
            else {
                System.out.println(myName[i]+ " es una" + " CONSONANT ");
            }
        }
    }
}