// public class calcularImc {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }

public class calcularImc {
    public static void main(String [] args) {
        final double peso = 76.0;
        final double altura = 1.75;
        double imc = peso / (altura * altura);

        System.out.print(imc);
    }
}