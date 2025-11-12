public class notasAlumnos {
    public static void main(String[] args) {
        int[][] notasAlumnos = new int[][] {
                { 3, 4, 5 },
                { 9, 2, 3 },
                { 5, 6, 1 },
                { 8, 6, 1 },
        };
        double[] mediaNotas = new double[notasAlumnos.length];
        for (int i = 0; i < notasAlumnos.length; i++) {
            double suma = 0;
            double media = 0;
            for (int j = 0; j < notasAlumnos[i].length; j++) {
                suma += notasAlumnos[i][j];

            }
            media = suma / notasAlumnos[i].length;

            System.out.println(media);
        }
        
    }
}
