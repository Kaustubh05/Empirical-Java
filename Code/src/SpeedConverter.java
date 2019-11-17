public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHo)
    {
    if(kilometersPerHo <0){
    return -1;
    }
    else{
        long mph,milesPerHo;
        mph= (long)(kilometersPerHo/1.609);
        milesPerHo=Math.round(mph);
        return milesPerHo;
    }
    }
    public static void printConversion(double kilometersPerHo){
        long mph,milesPerHo;
        mph= (long)(kilometersPerHo/1.609);
        milesPerHo=Math.round(mph);
        if(kilometersPerHo<0)
        System.out.println("Invalid");
        System.out.printf("%f km/h = %d mi/h",kilometersPerHo, milesPerHo);
        
    }
}