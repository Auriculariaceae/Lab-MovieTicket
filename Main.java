import java.util.Scanner;

class MovieTicket {
   //Initializing values
   String movieName;
   int seat;
   String rating;
   double basePrice;
  

    // Setting up contructor
MovieTicket(String mN, int s, String r, double bP){
    movieName = mN;
    seat = s;
    rating = r;
    basePrice= bP;
}
   //Setting up a method to output information 
void printTicket(){
    System.out.println(movieName+ "|"+"Seat: "+seat+"| Rating: "+rating);
}
    //Checking whether user input a valid seat number, if not gives error message
void checkSeat(){
    if (seat <= 0 ) {
        System.out.println("Invalid seat number!");
    }
    if (seat > 200)
        System.out.println("Seat out of range!");
    else
        System.out.println("Seat confirmed: "+seat);
}

   //Method to calculate price of the based on the seating
void computePrice(){
    double price = basePrice;
    if (seat<= 100)
        price++;
    else
        price= basePrice+3;
    System.out.println("Ticket price: $"+price);
}
    //Checking whether the showtime of the movie is during daytime or the evening 
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
       //Getting value inputs from user
            System.out.println("What movie are you planning on watching?");
            String movieName= sc.nextLine();

            System.out.println("Where do you want to sit?");
            int seat= sc.nextInt();

            System.out.println("Rating?");
            String rating= sc.next();

            System.out.println("How much does this ticket cost?");
            double basePrice= sc.nextDouble();

         //Calling previous methods to calculate values given
            MovieTicket mt1=new MovieTicket(movieName, seat, rating, basePrice);
            mt1.printTicket();
            mt1.checkSeat();
            mt1.computePrice();
            
            System.out.println("When are you seeing the movie? 0-23");
            int hour=sc.nextInt();
            mt1.checkShowtime(hour);
      
    }
}
