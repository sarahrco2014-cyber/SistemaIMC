public class CalculadoraRecursiva {

    // Calcula base elevada ao expoente utilizando recursão, sem usar Math.pow().

    public static double potencia(double base, int exp) {
        
        // Caso-base
        if (exp == 0) {
            return 1;
        }

        // Chamada recursiva
        return base * potencia(base, exp - 1);
}
}
