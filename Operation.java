public class Operation{
    public double soma;
    public double subtracao;
    public double multiplicacao;
    public double divisao;
    public double porcentagem;

    public String  somaEscolhida ( int operacaoEscolhida){
        if (operacaoEscolhida == 1){ 
        return "Soma"; 
        }
        else if ( operacaoEscolhida == 2){
        return "Subtração";
        }
        else if ( operacaoEscolhida == 3){
            return "Multiplicação";
        }
        else if (operacaoEscolhida == 4){
            return "Divisão";
        }
        else if (operacaoEscolhida == 5){
            return "Porcentagem";
        }
        else return "Operação invalida";
        
    }

    public double calculoSoma(double a, double b ){
        return a + b ;
    }
    public double calculoSubtracao(double a, double b){
        return a - b;
    }
    public double calculoMultiplicacao(double a, double b){
        return a * b ;
    }
    public double calculoDivisao(double a , double b){
        return a / b ;
    }
    public double calculoPorcentagem(double a , double b){
        double calculo = a / 100;
        double somaFinal =calculo * b;
        return somaFinal;
    }



}
