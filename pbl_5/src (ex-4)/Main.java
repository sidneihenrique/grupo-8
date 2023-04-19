import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Random random = new Random();

        ArrayList<Integer> lista = new ArrayList<>();

        for(int i= 0; i < 10; i++){
            lista.add(random.nextInt(1,10));
        }

        for (int valor:lista) {
            System.out.println(valor);
        }

        System.out.println("Soma: " + calculadora.somar(1,2));
        System.out.println("Subtrai: " + calculadora.subtrair(5,1));
        System.out.println("Multiplicar: " + calculadora.multiplicar(2,5));
        System.out.println("Dividir: " + calculadora.dividir(10,2));

        System.out.println("Total da soma dos números na lista: " + calculadora.somar(lista));
        System.out.println("Total da subtração dos números na lista: " + calculadora.subtrair(lista));
        System.out.println("Total da multiplicação dos números na lista: " + calculadora.multiplicar(lista));
        System.out.println("Total da divisão dos números na lista: " + calculadora.dividir(lista));
    }


}