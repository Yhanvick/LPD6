package tarea6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Primero creo mi objeto scanner para podeer leer la entrada del usuario y a su vez importo mi scanner con java.util.Scanner;
        Scanner scanner = new Scanner(System.in);
        
        // se le pide al usuario que ingrese una palabara o frase por medio de mi método System.out.println()
        System.out.println("Por favor, ingresa una palabra o frase:");
        String entrada = scanner.nextLine(); // para poder leer la entrada mando llamar a mi scanner y uso mi método .nextLine() para poder leerlo como un string
        
     // ahora tengo que crear una cadenavacía para poder almacenar el texto invertido
        String textoInvertido = "";
        
        // uso un bucle for para recorrer la cadena desde el último carácter hasta el primero, de tal forma que declaro mi variable i como int ya que el índice de una cadena siempre es un número entero.
        //Mi método .length() me ayuda a poder recorrer todos los índices de mi string, se resta -1 debido a que se busca obtener el índice del último carácter en la cadena
        //Con i>=0 me aseguro de detenerme en el índice 0 y con i-- me recorro un índice hacua atras en cada iteración
        for (int i = entrada.length() - 1; i >= 0; i--) {
        
        	//mi método .charAt() toma el carácter que está en la posición "i" de mi cadena "entrada", mientras que con mi operador += (forma abreviada de concatenacatenación) estoy realizando la operación_ textoInvertido = textoInvertido + entrada.charAt(i)
        	//de tal manera que con cada iteración el caracter en la posición (i) se va a añadir al final de la cadena "textoInvertido" mientras que con mi ciclo for me he asegurado de que se recorre la cadena del último carácter al primero
            textoInvertido += entrada.charAt(i);
        }
        
        // por último muestro ahora el reultado de las iteraciones con la nueva cadena que se ha guardado en "textoInvertido"
        System.out.println("El texto al revés es: " + textoInvertido); 
        
        scanner.close(); // Cerramos el scanner para liberar recursos
    }
}

/* Otra forma de poder haber resuelto 
for (int i = 0; i < entrada.length(); i++) {
    char caracterActual = entrada.charAt(i)
    textoInvertido = caracterActual + textoInvertido;
}
System.out.println("El texto al revés es: " + textoInvertido);
 */