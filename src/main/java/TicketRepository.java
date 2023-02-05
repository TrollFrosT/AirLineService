public class TicketRepository {

    private Ticket[] tickets = new Ticket[0];

    public Ticket[] findAll() {return tickets;} // найти все билеты

    public void add(Ticket ticket) { // добавить билеты

        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }

        tmp[tmp.length - 1] = ticket;
        tickets = tmp;


    }



}
