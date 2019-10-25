
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int absolutePrice;
    private int absolutePriceCompare;

    
    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment) {
        if ( this.rooms > otherApartment.rooms ) {
            return true;
        }
        
        if (this.rooms == otherApartment.rooms && this.squareMeters > otherApartment.squareMeters) {
            return true;
        }
         return false;
    }
    
    public int priceDifference(Apartment otherApartment) {
        absolutePrice = this.squareMeters * this.pricePerSquareMeter;
        absolutePriceCompare = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        return Math.abs(absolutePrice - absolutePriceCompare);
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        absolutePrice = this.squareMeters * this.pricePerSquareMeter;
        absolutePriceCompare = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        if (absolutePrice > absolutePriceCompare) {
            return true;
        }
        return false;
    }
}
