package Tour;

public class Main {
    public static void main(String[] args) {
        SingleTour singleTour = new SingleTour("Talardnam Watsaparn",1500,100,40);
        System.out.println(singleTour.getName());
        System.out.println(singleTour.getPrice());
        System.out.println(singleTour.getAvailableSeats());

        Tour tour = new PackageTour("Cheap sud sud",
                new SingleTour("Wadduumean",100,50,10),
                new SingleTour("Onigiri",450,400,399));
        System.out.println(tour.getName());
        System.out.println(tour.getPrice());
        System.out.println(tour.getAvailableSeats());
    }


}