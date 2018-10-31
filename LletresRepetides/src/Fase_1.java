
public class Fase_1 {

    public static void main(String[] args) {
        String myName = "JONATAN"; //En este caso declaramos MyName como una cadena de carácteres

        System.out.println(" My name is " + myName);

        System.out.println(" Do you want me to spell it for you? ");

        for (int i=0; i < 7; i++) {
            System.out.println(myName.charAt(i));
        }

    }
}