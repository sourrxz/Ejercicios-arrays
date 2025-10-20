import java.util.Arrays;

public class demostreams {

    static class Producto {
        private String nombre;

        private double precio;

        public Producto(String nombre, double precio){
            this.nombre = nombre;
            this.precio = precio;
        }

        public double getPrecio(){
            return precio;
        }
    }


    public static void main(String[] args) {
        Producto[] carrito = {
            new Producto("Teclado", 10),
            new Producto("Pantalla", 20),
        };

        for (Producto producto : carrito) {
            System.out.println(producto.nombre);
        }

        Arrays.stream(carrito).forEach(p->System.out.println(p.nombre));

        System.out.println(Arrays.stream(carrito).mapToDouble(Producto::getPrecio).sum());

        System.out.println(Arrays.stream(carrito).mapToDouble(Producto::getPrecio).average());


        
    }

}
