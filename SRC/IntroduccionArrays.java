/**
 * La clase {@code IntroduccionArrays} sirve como ejemplo básico para introducir
 * el uso de <b>arrays unidimensionales</b> en Java.
 * <p>
 * En este ejemplo se muestra cómo:
 * <ul>
 *   <li>Declarar y crear un array de tipo {@code int}.</li>
 *   <li>Asignar valores a cada elemento del array.</li>
 *   <li>Pasar un array como argumento a un método.</li>
 *   <li>Recorrer y mostrar su contenido por pantalla.</li>
 * </ul>
 * </p>
 *
 * <p>El programa imprime las temperaturas máximas registradas durante una semana.</p>
 *
 * @author Iván Corrales
 * @version 12/10/2025
 */
public class IntroduccionArrays {

    /**
     * Muestra por consola la temperatura máxima correspondiente a cada día de la semana.
     * <p>Ejemplo de salida esperada:</p>
     * <pre>
     * Lunes: 22º
     * Martes: 25º
     * Miércoles: 24º
     * ...
     * Domingo: 18º
     * </pre>
     *
     * @param temperaturas array de enteros que contiene las temperaturas máximas
     *                     correspondientes a los días de la semana, en orden.
     *                     Debe tener exactamente 7 elementos.
     */
    public void mostrarTemperaturas(int[] temperaturas) {
        temperaturas = new int[6];
        temperaturas[0] = 22;
        temperaturas[1] = 23;
        temperaturas[2] = 24;
        temperaturas[3] = 24;
        temperaturas[4] = 23;        
        temperaturas[5] = 21;
        temperaturas[6] = 20;
       
    }

    /**
     * Método principal del programa. Crea un array con las temperaturas máximas
     * de la semana y llama al método {@link #mostrarTemperaturas(int[])} para
     * mostrar los valores en consola.
     *
     * @param args argumentos de línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {
        int[] maxTemperaturas = new int [6];
        maxTemperaturas[0] = 22;
        maxTemperaturas[1] = 23;
        maxTemperaturas[2] = 24;
        maxTemperaturas[3] = 24;
        maxTemperaturas[4] = 23;
        maxTemperaturas[5] = 21;
        maxTemperaturas[6] = 20;
        // 1. Declara un array de tipo int llamado maxTemperaturas que tiene 7 elementos
        //    Cada elemento se corresponde con un día de la semana: Lunes, ... Domingo

        // 2. Los valores son: 22, 23, 24, 24 , 23, 21, 20

        // 3. Llama a la función mostrarTemperaturas
        System.out.printf("lunes [0] %s\n", maxTemperaturas[0]);
        System.out.printf("martes [0] %s\n", maxTemperaturas[1]);
        System.out.printf("miercoles [0] %s\n", maxTemperaturas[2]);
        System.out.printf("jueves [0] %s\n", maxTemperaturas[3]);
        System.out.printf("viernes [0] %s\n", maxTemperaturas[4]);
        System.out.printf("sabado [0] %s\n", maxTemperaturas[5]);
        System.out.printf("domingo [0] %s\n", maxTemperaturas[6]);
        
    }
}