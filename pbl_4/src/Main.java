import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        while (true) {
            int selecaoMenuPrincipal = 0;
            System.out.println("Selecione a ação desejada: ");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Listar pessoas");
            System.out.println("3 - Buscar pessoas por tipo");
            selecaoMenuPrincipal = input.nextInt();

            if(selecaoMenuPrincipal == 1){
                int selecaoTipoPessoa = 0;
                System.out.println("Iniciando cadastro...");

                System.out.println("Que tipo de pessoa você deseja cadastrar? ");
                System.out.println("1 - Funcionário");
                System.out.println("2 - Gerente");
                selecaoTipoPessoa = input.nextInt();

                if(selecaoTipoPessoa == 1){
                    System.out.println("Digite seu nome: ");
                    String nome = input.next();
                    System.out.println("Digite sua idade: ");
                    int idade = input.nextInt();
                    System.out.println("Digite seu CPF: ");
                    String cpf = input.nextString();
                    System.out.println("Digite seu sexo: ");
                    System.out.println("1 - Masculino ");
                    System.out.println("2 - Feminino ");
                    System.out.println("3 - Outro ");
                    int sexo = input.nextInt();
                    System.out.println("Selecione o gerente responsável deste funcionário: ");
                    System.out.println("");


                }

                else {

                }


            }



        }

    }
}