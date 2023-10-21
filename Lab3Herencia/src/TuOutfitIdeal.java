import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuOutfitIdeal {
    public static void main(String[] args) throws IOException {
        ArrayList<Prenda> inventario = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Cargamos los productos desde el archivo CSV.
        Reader reader = new FileReader("productos.csv");
        // Importa la librería CSVReader adecuadamente
        CSVReader csvReader = new CSVReader(reader);
        List<String[]> filas = csvReader.readAll();

        for (String[] fila : filas) {
            Prenda prenda = crearPrenda(fila);
            inventario.add(prenda);
        }

        // Imprimimos el menú principal.
        while (true) {
            System.out.println("Opciones:");
            System.out.println("1. Buscar producto por ID");
            System.out.println("2. Listar productos por categoría");
            System.out.println("3. Ver informe de ventas");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Implementa la búsqueda por ID aquí.
                    break;
                case 2:
                    // Implementa la lista de productos por categoría aquí.
                    break;
                case 3:
                    // Implementa el informe de ventas aquí.
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

    // Funciones adicionales para el manejo de errores y creación de prendas.

    private static void validarId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("El ID debe ser un número entero positivo.");
        }
    }

    private static Prenda crearPrenda(String[] datos) {
        // Implementa la lógica para crear una prenda desde los datos del CSV aquí.
        // Debes decidir qué tipo de prenda crear en base a la categoría.
        // Puedes usar un switch o una lógica de if-else para eso.
        return null;  // Devuelve la prenda creada.
    }
}
