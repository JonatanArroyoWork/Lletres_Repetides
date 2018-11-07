import javax.swing.*;

public class Fase_1_Version_2 {
    public static void main(String[] args){

        String myName = JOptionPane.showInputDialog("Introduce tu nombre");
        //Una ventanan nos pedirá nuestro nombre

        char[] myMatrixName = myName.toCharArray();//Convertiomos los carácteres introducicos en una Matriz

        for (int i=0;i<myMatrixName.length;i++){
            System.out.println(myMatrixName[i]);
        }
    }
}