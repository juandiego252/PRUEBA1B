import java.io.StringReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // Instancias de la clase VideoJuego
        VideoJuego grand_thef_auto = new VideoJuego(2013,"GTA5","Mundo Abierto",18,"Violencia");
        VideoJuego resident_evil = new VideoJuego(2023,"Resident Evil 4 Remake","Terror", 18,"Violencia");
        VideoJuego minecraft = new VideoJuego(2013,"Minecraft","Construccion",12,"Supervivencia");
        VideoJuego valorant = new VideoJuego(2019,"Valorant","Shooter",12,"Esport");
        VideoJuego fifa = new VideoJuego(2022,"FIFA 23","Competencia",12,"Deportes");

        // Llamamos a los objetos y su metodo imprimir datos
        grand_thef_auto.imprimirDatos();
        resident_evil.imprimirDatos();
        minecraft.imprimirDatos();
        valorant.imprimirDatos();
        fifa.imprimirDatos();

    }
}
