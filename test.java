import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        String cadena;
       // int fi;
       // char car;
        //char []reemplazo;
        String car;
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduzca una cadena: ");
        cadena = sca.nextLine();
        System.out.println("Ingrese el caracter a reemplazar en la cadena: ");
        car=sca.nextLine();
        //car = sca.next().charAt(0); //Leer un character
        sca.close();
        String reemplazo = cadena.replaceAll(cadena,car);
        System.out.println(reemplazo);
        //char [] letras = cadena.toCharArray(); //Convertir string en array
        //REEMPLAZO
  
    }
}
