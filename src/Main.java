public class Main {
    public static void main(String[] args) {
        int A = 11111111;
        int B = 668;
        int C = 412877777;

        if (A == B && B == C) {
            System.out.println("Alerta: Valores introducidos son iguales");
        } else {
            int max = Math.max(Math.max(A, B), C);
            int min = Math.min(Math.min(A, B), C);
            System.out.println("El valor mayor es: " + max);
            System.out.println("El valor minimo es: " + min);
        }
    }
}
