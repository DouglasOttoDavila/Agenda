package agenda;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Cria variáveis de assignment
        String nome;
        int idade;
        float altura;

        Scanner scan = new Scanner(System.in); // Importa classe scanner (input)

        // Instancia as classes "Commons" (para métodos "limparTela()" e "aguardaInput()") e "Agenda" (demais métodos)
        Commons com = new Commons();
        Agenda ag = new Agenda();

        // Instancia variáveis de controle (opção do menu e posPessoa para execução do método "buscaPessoa()")
        int opcao = 0;
        int posPessoa = -1;

        // Início do menu de interação
        while (opcao >= 0) {
            com.limparTela();
            System.out.println("| SISTEMA DE AGENDA |\n");
            System.out.println("Selecione a operação desejada:");
            System.out.println(
                    "\n1 - Armazenar contato\n2 - Remover contato\n3 - Exibir posição do contato\n4 - Buscar contato (por posição) \n5 - Listar todos contatos\n6 - Sair");
            opcao = scan.nextInt();

            // Opções do menu de interação
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
                    break;

                case 3:
                    com.limparTela();
                    System.out.println("Informe o nome do contato: ");
                    scan.nextLine();
                    nome = scan.nextLine();
                    posPessoa = ag.buscaPessoa(nome);
                    System.out.println("O contato " + nome + " está na posição " + posPessoa+1 +" da agenda.");
                    com.aguardaInput();
                    break;

                case 4:
                    com.limparTela();
                    System.out.println("Informe a posição do contato na agenda: ");
                    posPessoa = scan.nextInt();
                    ag.imprimePessoa(posPessoa);
                    break;

                case 5:
                    com.limparTela();
                    ag.imprimeAgenda();    
                    break;

                case 6:
                    opcao = -1;
                    break;
            }
        }
        scan.close();
    }
}
