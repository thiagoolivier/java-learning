//converts from kilometers per hour to miles per hour

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) return -1;
        double result = Math.round(kilometersPerHour/1.609d);
        
        return (long)result;
    }
    
    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour >= 0){
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
