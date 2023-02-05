import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketTest {

    @Test
    public void testFindOne() { // Один
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Ticket ticket1 = new Ticket(1, 500, "MSK", "SPB", 90);
        Ticket ticket2 = new Ticket(2, 300, "SPB", "MUR", 60);
        Ticket ticket3 = new Ticket(3, 400, "SPB", "HEL", 60);
        Ticket ticket4 = new Ticket(4, 500, "MSK", "KDR", 120);
        Ticket ticket5 = new Ticket(5, 700, "SPB", "KDR", 180);
        Ticket ticket6 = new Ticket(6, 700, "SPB", "ROM", 240);
        Ticket ticket7 = new Ticket(7, 300, "HEL", "SHM", 60);
        Ticket ticket8 = new Ticket(8, 1200, "MSK", "TKO", 600);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket6};
        Ticket[] actual = manager.findAll("SPB", "ROM");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindAll() { // Несколько
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Ticket ticket1 = new Ticket(1, 500, "MSK", "SPB", 90);
        Ticket ticket2 = new Ticket(2, 300, "SPB", "MUR", 60);
        Ticket ticket3 = new Ticket(3, 500, "MSK", "SPB", 90);
        Ticket ticket4 = new Ticket(4, 500, "MSK", "KDR", 120);
        Ticket ticket5 = new Ticket(5, 700, "SPB", "KDR", 180);
        Ticket ticket6 = new Ticket(6, 700, "SPB", "ROM", 240);
        Ticket ticket7 = new Ticket(7, 500, "MSK", "SPB", 90);
        Ticket ticket8 = new Ticket(8, 1200, "MSK", "TKO", 600);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket1, ticket3, ticket7};
        Ticket[] actual = manager.findAll("MSK", "SPB");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testNoFind() { // Ни одного
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Ticket ticket1 = new Ticket(1, 500, "MSK", "SPB", 90);
        Ticket ticket2 = new Ticket(2, 300, "SPB", "MUR", 60);
        Ticket ticket3 = new Ticket(3, 400, "SPB", "HEL", 60);
        Ticket ticket4 = new Ticket(4, 500, "MSK", "KDR", 120);
        Ticket ticket5 = new Ticket(5, 700, "SPB", "KDR", 180);
        Ticket ticket6 = new Ticket(6, 700, "SPB", "ROM", 240);
        Ticket ticket7 = new Ticket(7, 300, "HEL", "SHM", 60);
        Ticket ticket8 = new Ticket(8, 1200, "MSK", "TKO", 600);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("PLD", "KTR");

        Assertions.assertArrayEquals(expected, actual);


    }

    
}
