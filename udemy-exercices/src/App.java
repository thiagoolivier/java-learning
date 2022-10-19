public class App {
    public static void main(String[] args) throws Exception {

        int teste = fatorial(5);
        System.out.println("O fatorial de 5 é: " + teste);
        System.out.println("A potencia de 5 elevado a 2 é: " + potencia(5, 2));

    }

    public static int fatorial(int value) {
        if(value == 0) return 1;
        return value * fatorial(value-1);
    }

    public static int potencia(int base, int expoente) {
        if(expoente == 0) return 1;
        return potencia(base, expoente - 1) * base;
    }

}