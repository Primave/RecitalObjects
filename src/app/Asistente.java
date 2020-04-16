package app;

public class Asistente {
    public int id;
    public String nombre;
    public int dni;
    
    public void comprar(Ticket ticket) {
        //aqui dentro va toda la logica de la compra del ticket
        ticket.espectador = this; //this palabra usada en metodo para se hablar de si mismo     

    }
    public void comprar(Bebida bebida) {
        //aca logica de comprar la bebida
    }

    public boolean devolver(Ticket ticket){
        //logica si puedo devolver o no el ticket
        //asumimos que podemos

        return true;
    }

    public void regalar(Ticket ticket, Asistente beneficiario) {
        //logica de regalo
        ticket.espectador = beneficiario;
    }

    public void asistir() {

    }

    /**
     * este metodo lo que hace es que el assistente presencie la banda
     * @param banda
     * */

     public void ver (Banda banda) {

    }

}