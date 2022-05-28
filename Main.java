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
        int fi;
        char car;
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        frase = sca.nextLine();
        System.out.println("Ingrese el caracter a insertar en la cadena: ");
        car = sca.next().charAt(0);
        sca.close();
        char [] letras = frase.toCharArray();
        System.out.println("La cadena con el caracter insertado es: ");
        for(fi=0; fi<letras.length;fi++)
        {   System.out.print(letras[fi]); //Muestra cadena
            System.out.print(car);        //Muestra el char a insertar  
        }
    }

    public void ReplaceAll() // OPCION 3--Reemplace todos los digitos en la cadena por el caracter
    {
    }

    public void ReplcaceSpaces() // OPCION 4--Reemplazar todos los espacios por el caracter
    {
    }

    public void Concatenar() // OPCION 5--Concatenar dos cadenas
    {   String cad1, cad2, cadcon;
        //Introduzca una cad leer cad1
        //Introduzca una cad leer cad2
        // cadcon = cad1.concatenar(cad2)
    }

    public void CharEnCad() // OPCION 6--Indicar si un carácter forma parte de una cadena
    {
    }

    public void Inverso() // OPCION 7--Escribir una cadena en orden inverso
    {
    }

    public void PrimLet()// OPCION 8--Devolver la primera letra de cada palabra de la cadena
    {
    }

    public void PrimMayus()// OPCION 9--Convertir a mayúscula la primera letra de cada palabra de la cadena
    {
    }

    public void  CadEnCad()// OPCION 10--Indique si una cadena forma parte de otra
    {
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
        System.out.println("4-Reemplazar todos los espacios por el carácter ");
        System.out.println("5-Concatenar dos cadenas ");
        System.out.println("6-Indicar si un carácter forma parte de una cadena ");
        System.out.println("7-Escribir una cadena en orden inverso ");
        System.out.println("8-Devolver la primera letra de cada palabra de la cadena");
        System.out.println("9-Convertir a mayúscula la primera letra de cada palabra de la cadena");
        System.out.println("10-Indique si una cadena forma parte de otra");
        System.out.println("11-Salir ");

        System.out.println("Seleccione la opcion a realizar: ");
        opc = sn.nextInt();
        if(opc<=10)
        {   switch (opc) 
            {   case 1: mn.Contar();         //Contar la cantidad de palabras en una frase
                    break;

                case 2: mn.Insertar();       //Inserte el caracter entre cada letra de la cadena
                    break;

                case 3: mn.ReplaceAll();     //Reemplace todos los digitos en la cadena por el caracter
                    break;

                case 4: mn.ReplcaceSpaces();  //Reemplazar todos los espacios por el carácter
                    break;

                case 5: mn.Concatenar();       //Concatenar dos cadenas
                    break;

                case 6:   mn.CharEnCad();      //Indicar si un carácter forma parte de una cadena 
                    break;   

                case 7:  mn.Inverso();       //Escribir una cadena en orden inverso
                    break;

                case 8:   mn.PrimLet();      //Devolver la primera letra de cada palabra de la cadena
                    break;

                case 9:   mn.PrimMayus();      //Convertir a mayúscula la primera letra de cada palabra de la cadena
                    break;  

                case 10:  mn.CadEnCad();      //Indique si una cadena forma parte de otra
                    break;

                // case 11:   System.out.print("Opcion invalida");//Salir
                //     break;

                default:    System.out.println("Opcion invalida");//Salir
                    break;
            }
            System.out.println("Final");
            sn.close();
        }
        else{
            System.out.println("Valor invalido, debe ser menor a 11");
        }
    }
}
