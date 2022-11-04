import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner ryan=new Scanner(System.in);

    static ArrayList<Ticket> tickets;
    public static void main(String[] args) {

        System.out.println("type 1 manage tickets, 2 sell tickets, 3 print tickets,4 exit ");
        int options= ryan.nextInt();
        while(options>0) {
            System.out.println("what is the show name");
            String showName =ryan.nextLine();
            System.out.println("how many total tickets");
            int totalTickets= Integer.parseInt(ryan.nextLine());
            if (options == 1) {
                //manage tickets;
            } else if (options == 2) {
                //sell tickets;
            } else if (options == 3) {
                // print tickets;

            } else if (options == 4) {
                System.exit(0);

            } else {
                System.out.println("wrong option try again");
            }
            System.out.println("type 1 manage tickets, 2 sell tickets, 3 print tickets,4 exit ");
            options= ryan.nextInt();
        }
    }
}