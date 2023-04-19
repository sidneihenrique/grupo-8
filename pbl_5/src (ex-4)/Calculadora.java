import java.util.ArrayList;

public class Calculadora {

    public Calculadora(){

    }

    public int somar(int valor1, int valor2){
        return valor1 + valor2;
    }

    public int somar(ArrayList<Integer> lista){
        int resultado = 0;
        for (int valor : lista) {
            resultado += valor;
        }

        return resultado;
    }

    public int subtrair(int valor1, int valor2){
        return valor1 - valor2;
    }

    public int subtrair(ArrayList<Integer> lista){
        int resultado = 0;
        for (int valor : lista) {
            resultado -= valor;
        }

        return resultado;
    }

    public int multiplicar(int valor1, int valor2){
        return valor1 * valor2;
    }

    public int multiplicar(ArrayList<Integer> lista){
        int resultado = 0;
        for (int valor : lista) {
            resultado *= valor;
        }

        return resultado;
    }

    public int dividir(int valor1, int valor2){
        return valor1 / valor2;
    }

    public int dividir(ArrayList<Integer> lista){
        int dividendo = 0;
        int divisor = 0;

        for (int valor : lista) {
            if(lista.indexOf(valor) % 2 == 0) {
                divisor += valor;
            }

            else {
                dividendo += valor;
            }
        }

        return dividendo / divisor;
    }

}
