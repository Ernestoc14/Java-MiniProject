import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public void Contar() // OPCION 1--Contar la cantidad de palabras en una frase
    {   String frase;
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        frase = sca.nextLine();
        StringTokenizer st = new StringTokenizer(frase);
        System.out.println("Numero de palabras en la frase: "+st.countTokens());
        sca.close();
    }

    public void Insertar() // OPCION 2--Inserte el caracter entre cada letra de la cadena
    {   String frase;
    }

    public static void main(String[] args) {
        int opc;
        opc = 0;
        Main mn = new Main();
        Scanner sn = new Scanner(System.in);

        // ------------------------------MENU-----------------------------------------------
        System.out.println("Bienvenido al menu del Mini-Proyecto");
        System.out.println("Manejo de Strings, estas son las opciones");
        System.out.println("1-Contar la cantidad de palabras en una frase ");
        System.out.println("2-Inserte el caracter entre cada letra de la cadena ");
        System.out.println("3-Reemplace todos los digitos en la cadena por el caracter ");
        System.out.println("Seleccione la opcion a realizar: ");
        opc = sn.nextInt();

        switch (opc) {
            case 1: mn.Contar();
                break;
            case 2: mn.Insertar();
                break;
        
            default:
                break;
        }
        sn.close();
    }
}
