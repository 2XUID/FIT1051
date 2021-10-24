
public class Car {
    private int yearMade;
    public void setYearMade(int newYearMade){
        if (newYearMade > 1950 && newYearMade <= 2030) {
            yearMade = newYearMade;
        }
    }
    public int getYearMade(){
        return yearMade;
    }

    private String carMaker;
    public void setMaker (String newcarMaker) {
        if (newcarMaker.length()>=3 && newcarMaker.length()<=15) {
            carMaker = newcarMaker;
        }
    }
    public String getMaker(){
        return carMaker;
    }

    private int numberOfSeat;
    public void setNumberOfSeat(int newnumberOfSeat){
        if (newnumberOfSeat >= 5 && newnumberOfSeat <= 8){
            numberOfSeat=newnumberOfSeat;
        }
    }
    public int getNumberOfSeat(){
        return numberOfSeat;
    }
}


