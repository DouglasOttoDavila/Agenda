package agenda;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String nome;
        int idade;
        float altura;

        Scanner scan = new Scanner(System.in);

        Commons com = new Commons();
        Agenda ag = new Agenda();
        int opcao = 0;
        int posPessoa = -1;

        while (opcao >= 0) {
            com.limparTela();
            System.out.println("| SISTEMA DE AGENDA |\n");
            System.out.println("Selecione a operação desejada:");
            System.out.println("\n1 - Armazenar contato\n2 - Remover contato\n3 - Exibir posição do contato\n4 - Buscar contato (por posição) \n5 - Listar todos contatos\n6 - Sair");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    com.limparTela();    
                    System.out.println("Insira as informações do contato " + (ag.volumeContatos + 1) + ".");
                    scan.nextLine();
                    System.out.println("Nome: ");
                    nome = scan.nextLine();
                    System.out.println("Idade: ");
                    idade = scan.nextInt();
                    System.out.println("Altura: ");
                    altura = scan.nextFloat();
                    ag.armazenarPessoa(nome, idade, altura);
                break;

                case 2:
                    com.limparTela();
                    System.out.println("Informe o nome do contato a ser removido: ");
                    scan.nextLine();
                    String remContato = scan.nextLine();
                    com.limparTela();
                    posPessoa = ag.buscaPessoa(remContato);
                    ag.removePessoa(posPessoa, remContato);
                    com.aguardaInput();
                break;

                case 3:
                    com.limparTela();
                    System.out.println("Informe o nome do contato: ");
                    scan.nextLine();
                    nome = scan.nextLine();
                    posPessoa = ag.buscaPessoa(nome);
                    System.out.println("O contato " + nome + " está na posição " + posPessoa);
                    com.aguardaInput();
                break;

                case 4:
                    com.limparTela();
                    System.out.println("Informe a posição do contato na agenda: ");
                    posPessoa = scan.nextInt();
                    ag.imprimePessoa(posPessoa);
                    com.aguardaInput();
                break;

                case 5:
                    com.limparTela();
                    ag.imprimeAgenda();
                    com.aguardaInput();
                break;

                case 6:
                    opcao = -1;
                break;

                case 7:
                    com.limparTela();
                    ag.mostraArray();
                    com.aguardaInput();
                break;


            }

        }

        scan.close();
    }

}
