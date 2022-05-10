package staff;

public class TicketSeller extends Staff implements Seller{
    public TicketSeller(String name, String role) {
        super(name, role);
    }

    public String sellTicket(){
        return "Sold something";
    }

    @Override
    public void goHomeAtEndOfDay() {

    }
}
