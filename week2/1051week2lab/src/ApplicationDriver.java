
public class ApplicationDriver {
    public static void main(String[] args) {
        Car sedan;
        sedan = new Car();
        sedan.setYearMade(2021);
        System.out.println("The car is made in " + sedan.getYearMade());

        sedan.setMaker("Volkswagen");
        System.out.println("The car is made by "+sedan.getMaker());

        sedan.setNumberOfSeat(5);
        System.out.println("The car has "+sedan.getNumberOfSeat()+" seats");

        Car fleet[]=new Car[4];
        fleet[0]=new Car ();
        fleet[0].setMaker("BMW");
        System.out.println(fleet[0].getMaker());
    }
}


