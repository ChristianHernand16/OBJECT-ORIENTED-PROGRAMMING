import Clases_EjHerencia.Entrenador;
import Clases_EjHerencia.Jugador;
import Clases_EjHerencia.Masajista;

public class EjemploHerencia {
    public static void main(String[] args) {

        Jugador player1 = new Jugador(1, "Cristiano", "Ronaldo",
                20, 5, "Delantero");

        System.out.println("Jugador "  + player1.getNombres());

        Entrenador entrenador = new Entrenador(1, "Lionel", "Scanloni",
                20, 5);

        System.out.println("Entrenador "  + entrenador.getNombres());

        Masajista masajista = new Masajista(1, "Christian ", "Hernandez",
                20, "Terapia Muscular", 10);

        System.out.println("Masajista "  + masajista.getNombres());


    }
}
