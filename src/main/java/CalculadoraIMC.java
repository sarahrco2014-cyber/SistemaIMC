public interface CalculadoraIMC {

    //Contrato: calcula e retorna o valor numérico do IMC.
    double calcularIMC(double peso, double altura);

    //Contrato: retorna a classificação textual a partir do IMC.
    String classificarIMC(double imc);
}
