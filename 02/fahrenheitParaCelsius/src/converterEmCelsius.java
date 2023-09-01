public class converterEmCelsius {
    public static void main(String [] args) {
        final double grausFahrenheit = 28.0;

        double grausCelsius = ((grausFahrenheit - 32) / 1.8);

        System.out.print(grausCelsius);
    }
}
