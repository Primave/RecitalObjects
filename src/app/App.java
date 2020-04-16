package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        Ticket ticket2; //aca se declara la variable ticket nulo
        Ticket ticket1 = new Ticket();

        //accediendo al atributo "id" al objeto ticket
        ticket1.id = 2202002;
        ticket1.precio = 100;
        ticket1.ubicacion = "A3";

        ticket2 = new Ticket(); //aca se rellena los valores de ticket 2 para todos los argumentos presentes en objeto Ticket
        
        ticket2.id = 2202003;
        ticket2.precio = 120;
        ticket2.ubicacion = "F6";

        Banda comanche = new Banda();
        comanche.nombre = "Comanche";
        comanche.cantidadIntegrantes = 6;

        Banda otraBanda;
        otraBanda = comanche;
        ticket1.banda = otraBanda;

        Banda otraBanda2 = new Banda();
        otraBanda2.nombre = "Los Palmeras";
        otraBanda2.cantidadIntegrantes = 10;

        otraBanda = otraBanda2;

        Asistente asistente = new Asistente();

        asistente.nombre = "Laura";
        asistente.dni = 40000000;
        asistente.id = 562;

        //ticket1.espectador = asistente; //con esa linea vinculamos el asistente a variable espectador e al ticket1 creado
        // se vincula atributo espectador a objeto de clase asistente

        asistente.comprar(ticket1);
        asistente.comprar(ticket2);

        if (asistente.devolver(ticket2)) {
            System.out.println("Pude devolver el ticket " + ticket2);
        } else {
            System.out.println("Vamos a abogado");
        }

        Asistente tati = new Asistente();
        tati.nombre = "Tati";
        tati.id = 600;
        tati.dni = 200000000;

        asistente.regalar(ticket1, tati);

        asistente.asistir();
        asistente.ver(comanche);

        CocaCola coke1 = new CocaCola();
        coke1.nombre = "Coca Comun";
        coke1.precio = 200;

        CocaCola coke2 = new CocaCola();
        coke2.nombre = "Coca Zero";
        coke2.precio = 200;



    }
}