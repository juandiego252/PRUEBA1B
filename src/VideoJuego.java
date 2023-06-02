import javax.sound.midi.Soundbank;

public class VideoJuego {

    // Creacion de los Atributos de la clase Video Juegos
    int anio;
    String nombre;
    String tipo;
    int edad;
    String categoria;

    // Constructor
    public VideoJuego(int anio, String nombre, String tipo, int edad, String categoria) {
        this.anio = anio;
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.categoria = categoria;
    }

    // Creacion de los setters y getters de los atributos
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    // Metodo para imprimir datos de los de videoJuegos
    public void imprimirDatos(){

        System.out.println("------------------------------------------");
        System.out.println("Nombre:" + getNombre());
        System.out.println("Año de Lanzamiento:" + getAnio());
        System.out.println("Tipo de Video Juego:" + getTipo());
        System.out.println("Categoria:" + getCategoria());
        System.out.println("Edad permitida: +" + getEdad());
        System.out.println("-------------------------------------------");
    }
}
