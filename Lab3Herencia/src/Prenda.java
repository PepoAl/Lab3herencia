import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Importa la librería CSVReader adecuadamente
import com.opencsv.CSVReader;

class Prenda {
    private int id;
    private int cantidadDisponible;
    private int cantidadVendidos;
    private String estado;
    private double precio;

    public Prenda(int id, int cantidadDisponible, int cantidadVendidos, String estado, double precio) {
        this.id = id;
        this.cantidadDisponible = cantidadDisponible;
        this.cantidadVendidos = cantidadVendidos;
        this.estado = estado;
        this.precio = precio;
    }

    // Getters y setters según sea necesario.
}

class Pantalon extends Prenda {
    private String talla;
    private String tipo;

    public Pantalon(int id, int cantidadDisponible, int cantidadVendidos, String estado, double precio, String talla, String tipo) {
        super(id, cantidadDisponible, cantidadVendidos, estado, precio);
        this.talla = talla;
        this.tipo = tipo;
    }

    // Getters y setters según sea necesario.
}

class BlusaCamisa extends Prenda {
    private String talla;
    private String color;

    public BlusaCamisa(int id, int cantidadDisponible, int cantidadVendidos, String estado, double precio, String talla, String color) {
        super(id, cantidadDisponible, cantidadVendidos, estado, precio);
        this.talla = talla;
        this.color = color;
    }

    // Getters y setters según sea necesario.
}

class Collar extends Prenda {
    private String talla;
    private String material;

    public Collar(int id, int cantidadDisponible, int cantidadVendidos, String estado, double precio, String talla, String material) {
        super(id, cantidadDisponible, cantidadVendidos, estado, precio);
        this.talla = talla;
        this.material = material;
    }

    // Getters y setters según sea necesario.
}

