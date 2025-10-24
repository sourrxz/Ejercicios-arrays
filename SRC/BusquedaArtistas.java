import java.util.Locale;
import java.util.Scanner;

public class BusquedaArtistas {

    /**
     * Representa a un artista con nombre y número de seguidores (en miles).
     */
    static class Artista {
        private final String nombre;
        private final int seguidoresMiles;

        public Artista(String nombre, int seguidoresMiles) {
            this.nombre = nombre;
            this.seguidoresMiles = seguidoresMiles;
        }

        public String getNombre() { return nombre; }
        public int getSeguidoresMiles() { return seguidoresMiles; }

        @Override
        public String toString() {
            return String.format("%s (%,dK seguidores)", nombre, seguidoresMiles);
        }
    }

    // ------------------------------------------------------------
    // MÉTODOS a IMPLEMENTAR
    // ------------------------------------------------------------

    /**
     * Devuelve el índice de la primera coincidencia por nombre (ignora mayúsculas).
     * @param cartel array de artistas
     * @param nombreBuscado nombre a buscar
     * @return índice (0..n-1) o -1 si no existe
     */
    public static int indiceDe(Artista[] cartel, String nombreBuscado) {
        for (int i = 0; i < cartel.length; i++) {
            if (nombreBuscado.equalsIgnoreCase(cartel[i].getNombre())) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Indica si existe un artista con ese nombre.
     * @param cartel array de artistas
     * @param nombreBuscado nombre a buscar
     * @return true si existe, false en caso contrario
     */
    public static boolean existe(Artista[] cartel, String nombreBuscado) {
        for (int i = 0; i < cartel.length; i++) {
            if (nombreBuscado.equalsIgnoreCase(cartel[i].getNombre())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Devuelve un array con todos los índices donde el nombre coincide (ignora mayúsculas).
     * Si no hay coincidencias, devuelve un array de longitud 0.
     * @param cartel array de artistas
     * @param nombreBuscado nombre a buscar
     * @return array con índices de coincidencias
     */
    public static int[] indicesDeTodos(Artista[] cartel, String nombreBuscado) {
        for (int i = 0; i < cartel.length; i++) {
            if (nombreBuscado.equalsIgnoreCase(cartel[i].getNombre())) {
                return new int [i];
            }
        }
        return new int[0];
    }

    /**
     * Devuelve un array con los índices de artistas cuyo nombre empieza por la 'inicial' dada.
     * No distingue mayúsculas/minúsculas. Si no hay, devuelve array de longitud 0.
     * @param cartel array de artistas
     * @param inicial letra inicial a filtrar (por ejemplo 'A' o 'q')
     * @return array con índices de artistas que empiezan por esa letra
     */
     public static int[] indicesPorInicial(Artista[] cartel, char inicial) {
    int contador = 0;
    for (int i = 0; i < cartel.length; i++) {
        if (cartel[i].getNombre().charAt(0)==inicial) {
            contador++;
        }
    }
    int[] indices = new int[contador];
    int j=0;
    for (int i = 0; i < cartel.length; i++) {
        if (cartel[i].getNombre().charAt(0)==inicial) {
            indices[j++] = i;
        }
    }
    return indices;
}
    /**
     * Devuelve los índices de artistas cuyo nombre empieza por 'inicial' (ignora mayúsculas)
     * y cuyo número de seguidores (en miles) está entre 'min' y 'max' (INCLUSIVO).
     * Si no hay, devuelve array de longitud 0.
     */
    public static int[] indicesPorInicialYSeguidores(Artista[] cartel, char inicial,
                                                     int minSeguidoresMiles, int maxSeguidoresMiles) {
                                                        for (int i = 0; i < cartel.length; i++) {
                                                            if (inicial == indiceDe(cartel, null) && cartel[i].getSeguidoresMiles()<=Math.max(inicial, maxSeguidoresMiles) && cartel[i].getSeguidoresMiles()>=Math.min(inicial, maxSeguidoresMiles) ) {
                                                                return new int[i];
                                                            }
                                                        }
       
        return new int[0];
    }


    /**
     * Imprime por pantalla los artistas indicados por sus índices.
     * Formato: "  - [idx] Artista (…,K seguidores)"
     * Si el array de índices está vacío, no imprime nada.
     */
    public static void mostrarArtistas(Artista[] cartel, int[] indices) {
      
    }

    // ------------------------------------------------------------
    // MAIN de pruebas (usará los métodos obligatorios)
    // ------------------------------------------------------------

    // ------------------------------------------------------------
// MAIN de pruebas (usará los métodos obligatorios)
// ------------------------------------------------------------

public static void main(String[] args) {
    // Cartel inicial (12 artistas)
    Artista[] cartel = {
            new Artista("Aitana", 1200),
            new Artista("Quevedo", 2500),
            new Artista("Bad Gyal", 900),
            new Artista("Rosalía", 3100),
            new Artista("Bizarrap", 5400),
            new Artista("Lola Índigo", 850),
            new Artista("Rels B", 2000),
            new Artista("Saiko", 1500),
            new Artista("Feid", 4200),
            new Artista("Karol G", 6800),
            new Artista("Rauw Alejandro", 3600),
            new Artista("Morad", 2700)
    };
    
    // Parámetros por defecto para la demo
    final String BUSCAR_UNO   = "Rosalía";
    final String BUSCAR_TODOS = "Rels B";
    final char   INICIAL      = 'R';
    final char   INICIAL2     = 'R';
    final int    MIN          = 2000;
    final int    MAX          = 4000;

    System.out.println("=== Demo rápida (sin Scanner) ===");

    // 1) Primera coincidencia
    int pos = indiceDe(cartel, BUSCAR_UNO);
    if (pos >= 0) {
        System.out.println("✔ " + BUSCAR_UNO + " actúa. Índice: " + pos);
        System.out.println("  Detalles: " + cartel[pos]);
    } else {
        System.out.println("✘ " + BUSCAR_UNO + " no actúa en el festival.");
    }

    // 2) Todas las coincidencias
    int[] todos = indicesDeTodos(cartel, BUSCAR_TODOS);
    System.out.println("\nCoincidencias de \"" + BUSCAR_TODOS + "\": " + todos.length);
    if (todos.length > 0) mostrarArtistas(cartel, todos);

    // 3) Por inicial
    int[] porInicial = indicesPorInicial(cartel, INICIAL);
    System.out.println("\nArtistas que empiezan por '" + Character.toUpperCase(INICIAL) + "': " + porInicial.length);
    if (porInicial.length > 0) mostrarArtistas(cartel, porInicial);

    // 4) Inicial + rango (INCLUSIVO)
    int[] filtrados = indicesPorInicialYSeguidores(cartel, INICIAL2, MIN, MAX);
    System.out.println("\nArtistas que empiezan por '" + Character.toUpperCase(INICIAL2)
            + "' y tienen entre " + MIN + "K y " + MAX + "K seguidores:");
    if (filtrados.length > 0) mostrarArtistas(cartel, filtrados);
    else System.out.println("  (ninguno)");
    
}

 
}
 
