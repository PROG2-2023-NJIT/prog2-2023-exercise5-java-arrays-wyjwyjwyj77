package prog2.exercise5.flight.booking.system;


import java.util.Random;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Period;
/*private BookingClass bookingClass;
private TripType typeOfTrip;
private TripSource tripSource;
private TripDestination destinationOfTrip;
private SourceAirport airportOfSource;
private DestinationAirport airportOfDestination;*/

enum BookingClass
 {FIRST, BUSINESS, ECONOMY;
    String BookingClass;}
enum  TripType
 {ONE_WAY, RETURN;}
enum TripSource 
 {NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS;}
enum TripDestination 
 {NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS;}
enum DestinationAirport 
{NANJING_Lukou_International_Airport, Beijing_Capital_International_Airport, Shanghai_Pudong_International_Airport, OULU_Airport, HELSINKI_Airport, Paris_Charles_de_Gaulle_Airport;}
enum SourceAirport 
 { NANJING_Lukou_International_Airport, Beijing_Capital_International_Airport, Shanghai_Pudong_International_Airport, OULU_Airport, HELSINKI_Airport, Paris_Charles_de_Gaulle_Airport;}
 
 
public class FlightBooking
 {
   
    public static SourceAirport sourceAirport;
    public static DestinationAirport destinationAirport;
    private static  BookingClass bookingClass;
    public static TripType tripType;
    public static TripSource tripSource;
    private static LocalDate departureDate;
    private static LocalDate returnDate;
    static TripDestination tripDestination;
    public static Object getBookingClass;
    public static double price;
    public static double p2;
    public static double price3;

    private static String[] passengerFullName = new String[3];
    private static String[] passengerGender = new String[3];
    private static int[] passengerAge = new int[3];
    public static String[] ticketNumber = new String[3];

    public static int ai;
    public static int mmi;
    public static String a;
    public static String b;
    public static String x;
    
    private static final String flightCompany = "Flights-of-Fancy";
    LocalDate localdate1 = LocalDate.now();
    LocalDate localDate2 = localdate1.plus(2, ChronoUnit.DAYS);
    public static int childPassengers ;
    public static int adultPassengers ;
    public static int totalPassengers;
    public static double departingTicketPrice;
    public static double returnTicketPrice;
    public static double totalTicketPrice;

    public String geta(){
        return FlightBooking.a; }
    public void seta(String dd){
    FlightBooking.a = dd;}
    public static String getb(){
        return FlightBooking.b;}
    public static void setb(String z){
        FlightBooking.b = z;}
    public double getprice(){
        return FlightBooking.price;}
    public void setprice(double e){
       FlightBooking.price = e; }
    public double getp2(){
        return FlightBooking.p2; }
    public void setp2(double f){
       FlightBooking.p2 = f; }
    public int getmmi(){
        return FlightBooking.mmi;}
    public void setmmi(int g){
        FlightBooking.mmi = g; }
    public void setPassengerFullName(int h, String name){
        passengerFullName[h] = name;}
    public String getPassengerFullName(int i){
           return passengerFullName[i];}
    public void setPassengerGender(int j, String Gender){
           passengerGender[j] = Gender;}
    public String getPassengerGender(int j){
           return passengerGender[j];}
    public void setPassengerAge(int k, int Age){
         passengerAge[k] = Age;}
    public int getPassengerAge(int k){
           return passengerAge[k];}
    public String getFlightCompany(){
           return flightCompany;} 
    public FlightBooking(int size) {
            FlightBooking.ai = size;}
    public int getAdultPassengers(){
            return adultPassengers;}
    public int getChildrenPassengers(){
                return childPassengers;}
    public int getTotalPassengers(){
                return totalPassengers;}
    public void setTotalPassengers(int childPassengers,int adultPassengers){
               FlightBooking.totalPassengers = childPassengers + adultPassengers;}
    public LocalDate getDepartingDate(){
         return FlightBooking.departureDate;}
    public double getReturnTicketPrice(){
            return returnTicketPrice;}
    public void setReturnTicketPrice(){
        FlightBooking.returnTicketPrice = departingTicketPrice;}
    public String getTicketNumber(int a){
        return FlightBooking.ticketNumber[a];}

   
         public static void setBookingClass(String str){
        {
           if(str.equals("1"))
           FlightBooking.bookingClass = BookingClass.FIRST;
           if(str.equals("2"))
           FlightBooking.bookingClass = BookingClass.BUSINESS;
           if(str.equals("3"))
           FlightBooking.bookingClass = BookingClass.ECONOMY;
        }
    }


    public static void setTripSource(String str3){
        if(str3.equals("1"))
        FlightBooking.tripSource = TripSource.NANJING;
        if(str3.equals("2"))
        FlightBooking.tripSource = TripSource.BEIJING;
        if(str3.equals("3"))
        FlightBooking.tripSource = TripSource.OULU;
        if(str3.equals("4"))
        FlightBooking.tripSource = TripSource.HELSINKI;
     }
   
     public static void setSourceAirport(String str3){
        if(str3.equals("1"))
        FlightBooking.sourceAirport = SourceAirport.NANJING_Lukou_International_Airport;
        if(str3.equals("2"))
        FlightBooking.sourceAirport = SourceAirport.Beijing_Capital_International_Airport;
        if(str3.equals("3"))
        FlightBooking.sourceAirport = SourceAirport.OULU_Airport;
        if(str3.equals("4"))
        FlightBooking.sourceAirport = SourceAirport.HELSINKI_Airport;
    }

    public static void setDestinationAirport(String str2, String str3){
        if(str3.equals("1"))
        FlightBooking.destinationAirport = DestinationAirport.NANJING_Lukou_International_Airport;
        if(str3.equals("2"))
        FlightBooking.destinationAirport = DestinationAirport.Beijing_Capital_International_Airport;
        if(str3.equals("3"))
        FlightBooking.destinationAirport = DestinationAirport.OULU_Airport;
        if(str3.equals("4"))
        FlightBooking.destinationAirport = DestinationAirport.HELSINKI_Airport;
    }

    public static void setTripType(String str2){
        if(str2.equals("1"))
        FlightBooking.tripType = TripType.ONE_WAY;
        if(str2.equals("2")){
         FlightBooking.tripType = TripType.RETURN;
        }
     }

     public static void setTripDestination(String str2, String str3){
        if(str3.equals("1"))
        FlightBooking.tripDestination = TripDestination.NANJING ;
        if(str3.equals("2"))
        FlightBooking.tripDestination = TripDestination.BEIJING;
        if(str3.equals("3"))
        FlightBooking.tripDestination = TripDestination.OULU;
        if(str3.equals("4"))
        FlightBooking.tripDestination = TripDestination.HELSINKI;
     }


     public void setDepartureDate(LocalDate aall1){
        FlightBooking.departureDate = aall1;
    }

    public LocalDate getReturnDate(){
        return FlightBooking.returnDate;
    }
    public void setReturnDate(LocalDate b){
        Period next = Period.between(departureDate,b);
        LocalDate aall2 = b.plusDays(1);
        LocalDate aall3= b.plusDays(2);
        if(next.getDays() == 0){
            FlightBooking.returnDate = aall3;
        }
        
        if(0< next.getDays() && next.getDays() <2){
            FlightBooking.returnDate = aall2;
        }
        if(next.getDays() >2){
            FlightBooking.returnDate = b;
        }
    }

    public void setTotalTicketPrice( ){
       if(tripType.equals(TripType.ONE_WAY)){
                FlightBooking.totalTicketPrice = departingTicketPrice;  }
       if(tripType.equals(TripType.RETURN)){
                FlightBooking.totalTicketPrice = departingTicketPrice+returnTicketPrice;}
}
    public double getTotalTicketPrice(){
        return totalTicketPrice;}
    
        public double getDepartingTicketPrice(){
            return departingTicketPrice;}
        
        public void setDepartingTicketPrice(int childPassengers, int adultPassengers){
            if(tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.NANJING)||tripSource.equals(TripSource.HELSINKI)&&tripDestination.equals(TripDestination.OULU)||tripSource.equals(TripSource.OULU)&&tripDestination.equals(TripDestination.HELSINKI)){
               double price = 345; if(bookingClass.equals(BookingClass.FIRST)){
                double p2 = 250; FlightBooking.departingTicketPrice = (childPassengers + adultPassengers) * (price+p2);
             }
             if(bookingClass.equals(BookingClass.BUSINESS)){
                double p2 = 150; FlightBooking.departingTicketPrice = (childPassengers + adultPassengers) * (price+p2);
             }
             if(bookingClass.equals(BookingClass.ECONOMY)){
                double p2 = 50;FlightBooking.departingTicketPrice = (childPassengers + adultPassengers) * (price+p2);  }
              }
              if(tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.HELSINKI)||tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.OULU)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.HELSINKI)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.OULU)||tripSource.equals(TripSource.HELSINKI)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.HELSINKI)&&tripDestination.equals(TripDestination.NANJING)||tripSource.equals(TripSource.OULU)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.OULU)&&tripDestination.equals(TripDestination.NANJING)){
               double price = 375;if(bookingClass.equals(BookingClass.FIRST)){
                double p2 = 250; FlightBooking.departingTicketPrice = (childPassengers + adultPassengers) * (price+p2);
             }
             if(bookingClass.equals(BookingClass.BUSINESS)){
                double p2 = 150; FlightBooking.departingTicketPrice = (childPassengers + adultPassengers) * (price+p2);
             }
             if(bookingClass.equals(BookingClass.ECONOMY)){
                double p2 = 50;FlightBooking.departingTicketPrice = (childPassengers + adultPassengers) * (price+p2);  }
              }
          
        }
    
        public String toString(){
            return "Dear " + passengerFullName + ". Thank you for booking your flight with " + 
            flightCompany + ". Following are the details of your booking and the trip:" + "\n" + 
            "Ticket Number: " +  ticketNumber + "\n" + 
            "From " + tripSource + " to " + tripDestination + "\n" +
            "Date of departure: " + departureDate + "\n" +
            "Date of return: " + returnDate + "\n" +
            "Total passengers: " + totalPassengers + "\n" +
            "Total ticket price in Euros: " + totalTicketPrice;}

            public void gety(String h1) {
            }
            public static String creatTnumber(int n){
                String codes="";
                Random r=new Random();
                for(int i=0;i<4;i++){
                    int num=r.nextInt(3);
                    switch(num) {
                    case 0:
                    codes+=r.nextInt(10);
                    break;
                    case 1:
                    char ch1=(char)(r.nextInt(26)+65);
                        codes+=ch1;
                        break;
                    case 2:
                    char ch2=(char)(r.nextInt(26)+97);
                        codes+=ch2;
                        break;
                    }
                }
                return codes;
            }




           public void reserveTickets(int size){
            String[] Name = new String[size];
            String[] Gender = new String[size];
            int[] Age = new int[3];
            Scanner input1 = new Scanner(System.in);
            for(int a = 0;a<size;a++){
            System.out.println("Please enter your full name:");
            Name[a] = input1.nextLine();
            setPassengerFullName(a, Name[a]);}
            for(int a = 0;a<size;a++){
            System.out.println("Please enter your Gender:");
            Gender[a] = input1.nextLine();
            setPassengerGender(a,Gender[a]);}
            for(int a = 0;a<size;a++){
            System.out.println("Please enter your age");
            Age[a] = input1.nextInt();
            setPassengerAge(a, Age[a]);
            }
        
        input1.close();
        }
       
        public static void main (String[] args){
        Scanner ssa =new Scanner(System.in);
        System.out.println("Please select the ticket type：");
        System.out.println("1.FIRST");
        System.out.println("2.BUSINESS");
        System.out.println("3.ECONOMY");
        int sc1 = ssa.nextInt();
        ssa.close();

        String str ;
        switch(sc1){
        case 1:
        str = "1";setBookingClass(str);getBookingClass();break;
        case 2:
        str = "2";setBookingClass(str);getBookingClass();break;
        case 3:
        str = "3";setBookingClass(str);getBookingClass();break;
        }

        Scanner ssb = new Scanner(System.in);
        System.out.println("Please choose whether to return：");
        System.out.println("1.ONE_WAY");
        System.out.println("2.RETURN");
        int sc2 = ssb.nextInt();
        ssb.close();

        String str2;
        switch(sc2){
        case 1:
        str2 = "1";setTripType(str2);getTripType();break;
        case 2:
        str2 = "2";setTripType(str2);getTripType();break;
        }

       Scanner ssc = new Scanner(System.in);
        System.out.println("Please select your destination：");
        System.out.println("1.NANJING");
        System.out.println("2.BEIJING");
        System.out.println("3.OULU");
        System.out.println("4.HELSINKI");
        int sc3 = ssc.nextInt();
        ssc.close();

        String str3;
        switch(sc3){
        case 1:
        str3 = "1";setTripSource(str3);setb(str3);getTripSource();setSourceAirport(str3);getsourceAirport();break;
        case 2:
        str3 = "2";setTripSource(str3);setb(str3);getTripSource();setSourceAirport(str3);getsourceAirport();break;
        case 3:
        str3 = "3";setTripSource(str3);setb(str3);getTripSource();setSourceAirport(str3);getsourceAirport();break;
        case 4:
        str3 = "4";setTripSource(str3);setb(str3);getTripSource();setSourceAirport(str3);getsourceAirport();break;
        }

        Scanner ssd = new Scanner(System.in);
        System.out.println("Please select your return destination：");
        System.out.println("1.NANJING");
        System.out.println("2.BEIJING");
        System.out.println("3.OULU");
        System.out.println("4.HELSINKI");
        int sc4 = ssd.nextInt();
        ssd.close();

        String rr = getb();
        String str4;
        switch(sc4){
            case 1:
            str4 = "1";setTripDestination(rr,str4);getTripDestination();setDestinationAirport(rr, str4);getDestinationAirport();break;
            case 2:
            str4 = "2";setTripDestination(rr,str4);getTripDestination();setDestinationAirport(rr, str4);getDestinationAirport();break;
            case 3:
            str4 = "3";setTripDestination(rr,str4);getTripDestination();setDestinationAirport(rr, str4);getDestinationAirport();break;
            case 4:
            str4 = "4";setTripDestination(rr,str4);getTripDestination();setDestinationAirport(rr, str4);getDestinationAirport();break;
        }









    }
        private static void getDestinationAirport() {
        }
        private static void getTripDestination() {
        }
        private static void getsourceAirport() {
        }
        private static void getTripSource() {
        }
        private static void getTripType() {
        }
        private static void getBookingClass() {
        }


        }
       /*  public class Place   {
            private String  TRIP_SOURCE  ;
            public String getPlace() {
                return "NANJING";
            }
            public void setPlace(String  TRIP_SOURCE )
                this. TRIP_SOURCE  =  TRIP_SOURCE ;
            }
}*/

   
   

       /*  final long TRIP_DESTINATION = ;
        final long destinationAirport = ;
        final  long  sourceAirport= ;*/



       
       
       /*  public void setDepartingTicketPrice(int childPassengers, int adultPassengers) {
            double departingTicketPrice = 0.0;
            if((tripSource == TripSource.OULU &&  destinationOfTrip == TripDestination.HELSINKI) || (tripSource == TripSource.HELSINKI &&  destinationOfTrip == TripDestination.OULU) || ((tripSource == TripSource.NANJING || tripSource == TripSource.BEIJING || tripSource == TripSource.SHANGHAI) && (destinationOfTrip == TripDestination.NANJING || destinationOfTrip == TripDestination.BEIJING || destinationOfTrip == TripDestination.SHANGHAI))) {
                departingTicketPrice = (300  + 0.1 * 300) + 0.05 * 300;
            } else  {
                departingTicketPrice = 300 * (1 + 0.15 + 0.1);
            }
            if(bookingClass == BookingClass.FIRST) {
                this.departingTicketPrice = departingTicketPrice * childPassengers + departingTicketPrice * adultPassengers  + 250;
            } else if(bookingClass == BookingClass.BUSINESS) {
                this.departingTicketPrice = departingTicketPrice * childPassengers + departingTicketPrice * adultPassengers + 150;
            } else if(bookingClass == BookingClass.ECONOMY) {
                this.departingTicketPrice = departingTicketPrice * childPassengers + departingTicketPrice * adultPassengers + 50;
            }
        }*/
       
        
        
      
        
        
        
       
       
       
       
       
       
        
    



