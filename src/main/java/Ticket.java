public class Ticket implements Comparable<Ticket>  {

    private int id;

    private int price;

    private String from;

    private String to;

    private int duration;

    public Ticket(int id, int price, String from, String to, int duration) {
        this.id = id;
        this.price = price;
        this.from = from;
        this.to = to;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public int compareTo(Ticket o) {
        if (price < o.getPrice()) {
            return -1;
        }
        if (price > o.getPrice()){
            return 1;
        }
        return 0;
    }
}
