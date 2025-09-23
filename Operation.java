public class Operation{
       
    
    public double calculoSoma(double a, double b ){
        return a + b ;
    }
    public double calculoSubtracao(double a, double b){
        return a - b;
    }
    public double calculoMultiplicacao(double a, double b){
        return a * b ;
    }
    // Lança uma exceção caso o divisor seja zero, 
    // avisando que a operação de divisão não é permitida.
    public double calculoDivisao(double a , double b){
    if (b == 0) {
            throw new IllegalArgumentException("Erro: divisão por zero não permitida.");
        }
        return a / b;
    }
    public double calculoPorcentagem(double a , double b){
        double calculo = a / 100;
        double somaFinal =calculo * b;
        return somaFinal;
    }



}
