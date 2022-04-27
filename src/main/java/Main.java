import Entidades.Jugador;
import Entidades.Pregunta;
import Persistencia.JugadorDao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Pregunta pregunta1 = new Pregunta("¿ Cuál es la capital de Guaviare?", "Historia de Colombia", "A. Montería", "B. San Jose del Guaviare", "C. Pereira", "D. Medellin", "b");
        Pregunta  pregunta2 = new Pregunta( "¿ Cuál es el Rio mas largo de colombia?", "Historia de Colombia", "A. Rio Amazona", "B. Rio Magdalena", "C. Rio Cauca", "D. Rio Putumayo", "a");
        Pregunta  pregunta3 = new Pregunta( "¿ La moneda Colombiana es.?", "Historia de Colombia", "A. El Sol", "B. El sucre", "C. El peso", "D. El euro", "c");
        Pregunta  pregunta4 = new Pregunta( "¿Cuál es la Flor nacional de Colombia?", "Historia de Colombia", "A. La Orquidia", "B. La Rosa", "C. El Tulipan", "D. Margarita", "a");
        Pregunta  pregunta5 = new Pregunta( "¿Cuál es el ave nacional de Colombia?", "Historia de Colombia", "A. El Cóndor de los Andes", "B. Tucán del caribe", "C. El aguila", "D. La golondrina ", "a");

        Pregunta  pregunta6 = new Pregunta( "¿Cuál es el río más largo del mundo?", "Cultura general", "A. El río amazonas", "B. El río nilo", "C. El río danubio", "D. El río Mississippi", "a");
        Pregunta  pregunta7 = new Pregunta( "¿Cuándo termino la edad media?", "Cultura general", "A. Siglo XV", "B. Siglo X", "C. Siglo VII", "D. Siglo XII", "a");
        Pregunta  pregunta8 = new Pregunta( "¿Como se llama el escudero de don Quijote de la Mancha?", "Cultura general", "A. Sancho Ombligo", "B. Sancho Panza", "C. Sancho Gordo", "D. Sancho Estomago", "b");
        Pregunta  pregunta9 = new Pregunta( "¿Donde se celebro la primera copa mundial del mundo?", "Cultura general", "A. Argentina", "B. Alemania", "C. Brasil", "D. Uruguay", "d");
        Pregunta  pregunta10 = new Pregunta( "¿Cuál es la capital de España?", "Cultura general", "A. Barcelona", "B. Sevilla", "C. Madrid ", "D. Victoria", "c");

        Pregunta  pregunta11 = new Pregunta( "¿Al conjunto de plantas de un ecosistema se le llama?", "Ciencia Básica", "A. Flora", "B. Bioma", "C. Fauna", "D. Bosque", "a");
        Pregunta  pregunta12 = new Pregunta( "¿Cuales son los Animales mas numerosos del planeta?", "Ciencia Básica", "A. Aves", "B. Insectos", "C. Peces", "D. Mamiferos", "b");
        Pregunta  pregunta13 = new Pregunta( "¿Cuál es el nombre de las partículas subatómicas de carga negativa?", "CCiencia Básica", "A. Electrones", "B. Protones", "C. Neutrones", "D. Negatrones", "a");
        Pregunta  pregunta14 = new Pregunta( "¿Cuál es el elemento más abundante de la Tierra?", "Ciencia Básica", "A. El oxígeno", "B. El nitrógeno", "C. El hidrógeno", "D. El agua", "d");
        Pregunta  pregunta15 = new Pregunta( "¿Cuál es el primer elemento de la tabla periodica?", "Ciencia Básica", "A. Nitrogeno", "B. Oxigeno", "C. 8 Hidrogeno", "D. Plata", "c");

        Pregunta  pregunta16 = new Pregunta( "¿Cuál fue el primer pais de america que logro independizarse?", "Eventos históricos", "A. Mexico", "B. Colombia", "C.Estados Unidos", "D. Venezuela", "c");
        Pregunta  pregunta17 = new Pregunta( "¿Cuál fue el último emperador romano de Occidente?", "Eventos históricos", "A. Flavio Zenón", "B. Julio Nepote", "C. Marco Aurelio", "D. Rómulo Augusto", "d");
        Pregunta  pregunta18 = new Pregunta( "¿En qué año terminó la primera guerra mundial?", "Eventos históricos", "A. 1920", "B. 1918 ", "C. 1904", "D. 2000", "b");
        Pregunta  pregunta19 = new Pregunta( "¿La caída del muro de Berlín representa además?", "Eventos históricos", "A. El fin de la guerra fría", "B. El fin de la segunda guerra mundial", "C. La unificación de francia en un solo país nuevamente", "D. El fin del capitalismo", "a");
        Pregunta  pregunta20 = new Pregunta( "¿Dónde comenzó la revolución Industrial ?", "Eventos históricos", "A. Francia", "B. Gran Bretaña", "C. Estados unidos", "D. Alemania", "b");

        Pregunta  pregunta21 = new Pregunta( "¿Cuál es el Hueso mas largo del cuerpo?", "Categoría Anatomia Cuerpo Humano", "A. Radio ", "B.Femur", "C. Humero", "D. Tibia", "b");
        Pregunta  pregunta22 = new Pregunta( "¿Como se llama la membrana fibrosa gruesa que rodea el corazón?", "Categoría Anatomia Cuerpo Humano", "A. Diastole ", "B. Endocardio ", "C. El miocardio", "D. El pericardio", "d");
        Pregunta  pregunta23 = new Pregunta( "¿Cuál es el ácido que tenemos en el estómago?", "Categoría Anatomia Cuerpo Humano", "A. ácido Hialuronico", "B. ácido Nitrico", "C. ácido Clorhidrico", "D. ácido Folico", "c");
        Pregunta  pregunta24 = new Pregunta( "¿Cuantos músculos hay en la lengua?", "Categoría Anatomia Cuerpo Humano", "A. 5", "B. 17", "C. 8", "D. 20", "b");
        Pregunta  pregunta25 = new Pregunta( "¿Cuál es la proteina mas abundate del cuerpo Humano?", "Categoría Anatomia Cuerpo Humano", "A. Colageno", "B. Oxitocina ", "C. Queratina", "D. Mioxina", "a");


        ArrayList<Pregunta> nivel1 = new ArrayList<Pregunta>();
        nivel1.add(0, pregunta1);
        nivel1.add(1, pregunta2);
        nivel1.add(2, pregunta3);
        nivel1.add(3, pregunta4);
        nivel1.add(4, pregunta5);

        ArrayList<Pregunta> nivel2 = new ArrayList<Pregunta>();
        nivel2.add(0, pregunta6);
        nivel2.add(1, pregunta7);
        nivel2.add(2, pregunta8);
        nivel2.add(3, pregunta9);
        nivel2.add(4, pregunta10);

        ArrayList<Pregunta> nivel3 = new ArrayList<Pregunta>();
        nivel3.add(0, pregunta11);
        nivel3.add(1, pregunta12);
        nivel3.add(2, pregunta13);
        nivel3.add(3, pregunta14);
        nivel3.add(4, pregunta15);

        ArrayList<Pregunta> nivel4 = new ArrayList<Pregunta>();
        nivel4.add(0, pregunta16);
        nivel4.add(1, pregunta17);
        nivel4.add(2, pregunta18);
        nivel4.add(3, pregunta19);
        nivel4.add(4, pregunta20);

        ArrayList<Pregunta> nivel5 = new ArrayList<Pregunta>();
        nivel5.add(0, pregunta21);
        nivel5.add(1, pregunta22);
        nivel5.add(2, pregunta23);
        nivel5.add(3, pregunta24);
        nivel5.add(4, pregunta25);

        Scanner scanner = new Scanner(System.in);
        Jugador jugador = new Jugador();
        Pregunta pregunta = new Pregunta();

        // Iniciar el Juego
        System.out.println("***********************************************************************");
        System.out.println("**********BIENVENIDO AL CONCURSO DE PREGUNTAS Y RESPUESTAS **********");
        System.out.println("");
        System.out.println("Ingresa tu nombre:");
        jugador.setNombre(scanner.nextLine());
        System.out.println("");
        System.out.println("Bienvenido al juego: " + jugador.getNombre() );
        pregunta.primeraRonda(nivel1);
        pregunta.segundaRonda(nivel2);
        pregunta.terceraRonda(nivel3);
        pregunta.cuartaRonda(nivel4);
        pregunta.quintaRonda(nivel5);
        pregunta.mapPuntosToPremio(jugador);
        System.out.println(jugador.getNombre() +", El dinero ganado en total es: $"+ jugador.getAcumuladoPremio()+" Gracias por jugar");
        JugadorDao.crearJugadorBD(jugador);
    }
}
