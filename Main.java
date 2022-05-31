import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        car = sca.next().charAt(0); //Leer un character
        sca.close();
        char [] letras = frase.toCharArray();
        System.out.println("La cadena con el caracter insertado es: ");
        for(fi=0; fi<letras.length;fi++)
        {   System.out.print(letras[fi]); //Muestra cadena
            System.out.print(car);        //Muestra el char a insertar  
        }
    }

    public void ReplaceAll() // OPCION 3--Reemplace todos los digitos en la cadena por el caracter
    {   String cadena;
        int fi;
        char car;
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduzca una cadena: ");
        cadena = sca.nextLine();
        System.out.println("Ingrese el caracter a reemplazar en la cadena: ");
        car = sca.next().charAt(0); //Leer un character
        sca.close();
        char [] letras = cadena.toCharArray();
        //Reemplazo
        for(fi=0; fi<letras.length;fi++)
        {    letras[fi] = car; 
        }
        System.out.println("La cadena con el caracter reemplazado es: ");
        for(fi=0; fi<letras.length;fi++)
        {    System.out.print(letras[fi]); 
        } 
    }

    public void ReplcaceSpaces() // OPCION 4--Reemplazar todos los espacios por el caracter
    {   String cadena;
        char car;
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduzca una cadena: ");
        cadena = sca.nextLine();
        System.out.println("Ingrese el caracter a reemplazar en la cadena: ");
        car = sca.next().charAt(0); //Leer un character
        sca.close();
        //Reemplazo
        String reemplazo = cadena.replace(' ', car); 
        System.out.printf("La cadena con el caracter reemplazado es: %s ",reemplazo);
    }

    public void Concatenar() // OPCION 5--Concatenar dos cadenas
    {   String cad1, cad2, cadcon;
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduzca la cadena 1: ");
        cad1 = sca.nextLine();
        System.out.println("Introduzca la cadena 2: ");
        cad2 = sca.nextLine();
        cadcon = cad1.concat(cad2); //Concatenar
        System.out.printf("La cadena concatenada es: %s ", cadcon);
        sca.close();
    }

    public void CharEnCad() // OPCION 6--Indicar si un carácter forma parte de una cadena
    {   String cadena;
        char car;
        int fi; 
        int contador=0;
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduzca una cadena: ");
        cadena = sca.nextLine();
        System.out.println("Ingrese el caracter a verificar en la cadena: ");
        car = sca.next().charAt(0); //Leer un character
        sca.close();
        //Verificando 
        for(fi=0; fi<cadena.length();fi++)
        {   if (cadena.charAt(fi)==car) 
            { contador++;
            }
        }
        if(contador>=0)
        { System.out.printf("El caracter %s se encuentra %d veces en la cadena: %s ",car ,contador ,cadena);
        }
    }

    public void Inverso() // OPCION 7--Escribir una cadena en orden inverso
    {   String cadena;
        int fi,inv; 
        char [] inverso = new char [50];
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduzca una cadena: ");
        cadena = sca.nextLine();
        char [] letras = cadena.toCharArray();
        sca.close();
        //Invirtiendo el cadena
        System.out.println("La cadena invertida es: ");
        for(fi=letras.length-1, inv=0;fi>=0;fi--,inv++)
        {   inverso [inv] = letras[fi];
            System.out.printf("%s",inverso[inv]);
        }
    }

    public void PrimLet()// OPCION 8--Devolver la primera letra de cada palabra de la cadena
    {   String cadena;
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduzca la cadena: ");
        cadena = sca.nextLine();
        sca.close();
        //Devolucion 
        char c[] = cadena.toCharArray();
        System.out.println("Las primeras letras de cada palabra son: ");
        for (int i=0; i < c.length; i++) 
        {  // Logic to implement first character of each word in a string
            if(c[i] != ' ' && (i == 0 || c[i-1] == ' ')) 
            { System.out.println(c[i]);
            }
        }
    }

    public void PrimMayus()// OPCION 9--Convertir a mayúscula la primera letra de cada palabra de la cadena
    {   String cadena;
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduzca la cadena: ");
        cadena = sca.nextLine();
        StringBuffer strbf = new StringBuffer();
        Matcher match = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(cadena);
        sca.close();
        //Conversion
        while(match.find())
        {   match.appendReplacement(strbf, match.group(1).toUpperCase() + match.group(2).toLowerCase());
        }
        System.out.printf("La conversion de la cadena con mayusculas es: %s",match.appendTail(strbf).toString());
    }

    public void  CadEnCad()// OPCION 10--Indique si una cadena forma parte de otra
    {   String cad1,cad2;
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduzca una cadena: ");
        cad1 = sca.nextLine();
        System.out.println("Ingrese la otra cadena: ");
        cad2 = sca.nextLine();
        sca.close();
        //Verificando 
        if(cad1.contains(cad2))
        { System.out.printf("La cadena %s CONTIENE a la cadena %s. ",cad1 ,cad2);
        }
        else
        { System.out.printf("La cadena %s NO CONTIENE a la cadena %s. ",cad1 ,cad2);
        }
    }

    public static void main(String[] args) {
        int opc = 0;
        //int ow =1;
        Main mn = new Main();
        Scanner sn = new Scanner(System.in);

        // while(ow == 1);
        // {
        // ------------------------------MENU-----------------------------------------------
        System.out.println("Bienvenido al menu del Mini-Proyecto");
        System.out.println("Manejo de Strings, estas son las opciones");
        System.out.println("Desarrollado por Ernesto Crespo ");
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
        switch (opc) 
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

                case 11:   System.out.print("Saliendo");//Salir
                   break;
                default:    System.out.println("Opcion invalida");//Salir
                    break;
            }
            // System.out.println("\nDesea continuar? 1-Si 2-No: ");
            // ow = sn.nextInt();  
       sn.close();
    }
}
