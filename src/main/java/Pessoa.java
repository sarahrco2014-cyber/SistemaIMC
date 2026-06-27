public class Pessoa extends PessoaBase implements CalculadoraIMC {

    @Override
    public double calcularIMC(double peso, double altura) {
        return peso /
         CalculadoraRecursiva.potencia(altura, 2);
    }

    @Override
    public String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidade grau 1";
        } else if (imc < 40) {
            return "Obesidade grau 2";
        } else {
            return "Obesidade grau 3";
        }
    }

    // Calcula o IMC utilizando os atributos do próprio objeto.
    public double calcularIMC() {
        return getPeso() / CalculadoraRecursiva.potencia(getAltura(), 2);
   }

    // Retorna a classificação do IMC calculado.
    public String classificarIMC() {
        return classificarIMC(calcularIMC());
    }

    @Override
    public String exibirPerfil() {
        return "Pessoa: " + getNome() 
        + ", Idade: " + getIdade()
        + ", Peso: " + getPeso()
        + ", Altura: " + getAltura();
    }
}