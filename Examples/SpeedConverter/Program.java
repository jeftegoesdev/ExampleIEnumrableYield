public class Program {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            return -1;

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            System.out.println("Invalid Value");
        else
        {
            double XX = kilometersPerHour;
            long YY = toMilesPerHour(kilometersPerHour);
            
            System.out.println(XX + " km/h = " + YY + " mi/h");
        }

    }

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
}
