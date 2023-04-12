import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Gerente> gerentes = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Departamento> departamentos = new ArrayList<>();

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        departamentos.add(new Departamento(01, "Departamento de RH"));
        departamentos.add(new Departamento(02, "Departamento de informática"));


        gerentes.add(new Gerente("Pedro da Silva", 30, "444-444-444-55", "Masculino", 01, departamentos.get(0) ));
        gerentes.add(new Gerente("Gabriel Felipe", 19, "554-443-444-55", "Masculino", 02, departamentos.get(1) ));


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
                    String cpf = input.next();
                    System.out.println("Digite seu sexo: ");
                    System.out.println("1 - Masculino ");
                    System.out.println("2 - Feminino ");
                    System.out.println("3 - Outro ");
                    int sexoSelection = input.nextInt();
                    String sexo;

                    if(sexoSelection == 1){
                        sexo = "Masculino";
                    }

                    else if(sexoSelection == 2) {
                        sexo = "Feminino";
                    }

                    else {
                        sexo = "Outro";
                    }

                    System.out.println("Selecione o gerente responsável deste funcionário: ");

                    int i = 0;

                    for (Gerente gerente : gerentes) {
                            System.out.println( gerentes.indexOf(gerente) + " - " + gerente.getNome());
                    }

                    int gerenteSelected = input.nextInt();
                    Gerente gerente = gerentes.get(gerenteSelected);

                    int codigoFuncionario = random.nextInt();

                    funcionarios.add(new Funcionario(nome, idade, cpf, sexo, codigoFuncionario, gerente));
                    System.out.println("Funcionário " + nome + " cadastrado com sucesso");

                }

                else {
                    System.out.println("Digite seu nome: ");
                    String nome = input.next();
                    System.out.println("Digite sua idade: ");
                    int idade = input.nextInt();
                    System.out.println("Digite seu CPF: ");
                    String cpf = input.next();
                    System.out.println("Digite seu sexo: ");
                    System.out.println("1 - Masculino ");
                    System.out.println("2 - Feminino ");
                    System.out.println("3 - Outro ");
                    int sexoSelection = input.nextInt();

                    String sexo;

                    if(sexoSelection == 1){
                        sexo = "Masculino";
                    }

                    else if(sexoSelection == 2) {
                        sexo = "Feminino";
                    }

                    else {
                        sexo = "Outro";
                    }
                    System.out.println("Selecione o departamento do gerente: ");
                    for (Departamento departamento : departamentos){
                        System.out.println(departamentos.indexOf(departamento) + " - " + departamento.getNomeDepartamento());
                    }

                    int departamentoGerenteSelected = input.nextInt();
                    Departamento departamentoGerente = departamentos.get(departamentoGerenteSelected);

                    int codigoGerente = random.nextInt();

                    gerentes.add(new Gerente(nome, idade, cpf, sexo, codigoGerente, departamentoGerente));
                    System.out.println("Gerente " + nome + " cadastrado com sucesso");

                }


            }

            else if (selecaoMenuPrincipal == 2){

                System.out.println("Gerentes no sistema: ");
                System.out.println(" ");
                for ( Gerente gerente : gerentes ){
                    System.out.println( gerente.getCodigo() + " - " + gerente.getNome() + "," + gerente.getIdade() + " ;" + " Departamento: " + gerente.getDepartamentoResponsavel().getNomeDepartamento());
                    System.out.println(" ");
                }

                System.out.println("Funcionários do sistema: ");
                System.out.println(" ");
                for(Funcionario funcionario : funcionarios){
                    System.out.println(funcionario.getCodigoFuncionario() + " - " + funcionario.getNome() + "," + funcionario.getIdade() + " ;" + " Gerente responsável: " + funcionario.getGerenteResponsavel().getNome());
                    System.out.println(" ");
                }
            }




        }

    }
}