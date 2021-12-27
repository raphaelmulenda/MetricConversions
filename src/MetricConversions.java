public class MetricConversions {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(0.2,13);
        calcFeetAndInchesToCentimeters(5);
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >0) && (0<= inches && inches <=12)){
            double feetToCm = (feet /0.032808 );
            double inchToCm = (inches * 2.54);
            double Centimeters = feetToCm + inchToCm ;
            System.out.println( feet + " ft," + inches + " in " + "= " + Centimeters + " cm");
            return Centimeters;
        }

        return -1;
    }

    public static  double calcFeetAndInchesToCentimeters(double inches)  {
        if(inches >=0) {
            double feet = (inches / 12);
            System.out.println(inches + " in" + " = " + feet + "ft" );
            double Centimeters  = calcFeetAndInchesToCentimeters(feet,inches);
            System.out.println( feet + " ft," + inches + " in " + "= " + Centimeters + " cm");
        }

        return -1;
    }
}
