import java.util.Scanner;

class MovieTicket {
   String movieName;
   int seat;
   String rating;
   double basePrice;
    // ===== Part A: Properties & Constructor =====
    // TODO A1: Add properties:
    //   - movieName (String)
    //   - seat (int)
    //   - rating (String)
    //   - basePrice (double)

    // TODO A2: Add a constructor that sets all properties
MovieTicket(String mN, int s, String r, double bP){
    movieName = mN;
    seat = s;
    rating = r;
    basePrice= bP;
}

    // ===== Part B: MovieTicket Methods =====
    // TODO B1: printTicket()
    // Print exactly: "<movieName> | Seat <seat> | Rating <rating>"
void printTicket(){
    System.out.println(movieName+ "|"+"Seat: "+seat+"| Rating: "+rating);
}
    // TODO B2: checkSeat()
    //   if (seat <= 0) -> print "Invalid seat number!"
    //   if (seat > 200) -> print "Seat out of range!"
    //   else -> print "Seat confirmed: <seat>"
void checkSeat(){
    if (seat <= 0 ) {
        System.out.println("Invalid seat number!");
    }
    if (seat > 200)
        System.out.println("Seat out of range!");
    else
        System.out.println("Seat confirmed: "+seat);
}
    // TODO B3: computePrice()
    // Start with: price = basePrice
    //   if (seat <= 100) -> add $1
    //   else -> add $3
    // Then print: "Ticket price: $<price>"

void computePrice(){
    double price = basePrice;
    if (seat<= 100)
        price++;
    else
        price= basePrice+3;
    System.out.println("Ticket price: $"+price);
}
    // TODO B4: checkShowtime(int hour)
    //   if (hour < 18) -> print "Daytime show."
    //   else -> print "Evening show."
void checkShowtime(int hour){
    if (hour<18)
        System.out.println("Daytime show");
    else
        System.out.println("Evening show");
}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("What movie are you planning on watching?");
            String movieName= sc.nextLine();

            System.out.println("Where do you want to sit?");
            int seat= sc.nextInt();

            System.out.println("Rating?");
            String rating= sc.next();

            System.out.println("How much does this ticket cost?");
            double basePrice= sc.nextDouble();


            MovieTicket mt1=new MovieTicket(movieName, seat, rating, basePrice);
            mt1.printTicket();
            mt1.checkSeat();
            mt1.computePrice();

            System.out.println("When are you seeing the movie? 0-23");
            int hour=sc.nextInt();
            mt1.checkShowtime(hour);
        // ===== TODOs for Students (no logic code here) =====
        // 1) Ask the user for: movieName (String), seat (int), rating (String), basePrice (double)
        // 2) Create a MovieTicket object with those inputs
        // 3) Call: printTicket()
        // 4) Call: checkSeat()
        // 5) Call: computePrice()
        // 6) Ask for showtime hour (0–23), then call: checkShowtime(hour)
    }
}