public class Ticket {
    private int ticketNumber;
    private String purchaserName;
    private boolean sold;
    private int code;

    public Ticket(int ticketNumber) {
        this.ticketNumber = ticketNumber;
        this.purchaserName= "";
        this.sold=false;
        this.code=0;

    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getPurchaserName() {
        return purchaserName;
    }

    public void setPurchaserName(String purchaserName) {
        this.purchaserName = purchaserName;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return  ticketNumber +
                " " + purchaserName +
                " " + sold +
                " " + code ;


    }
}
