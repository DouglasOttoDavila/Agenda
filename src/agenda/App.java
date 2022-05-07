package agenda;

/* import java.util.Arrays; */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //variaveis
        /* String[] nome = new String [maxContatos];
        int[] idade = new int [maxContatos];
        float[] altura = new float [maxContatos]; */

        String nome;
        int idade;
        float altura;

        Scanner scan = new Scanner(System.in);

        Commons com = new Commons();
        Agenda ag = new Agenda();
        int maxContatos = ag.getMaxContatos();
        int opcao = 0;
        int contAgenda = 0;

        while (opcao >= 0) {
            com.limparTela();
            System.out.println("| SISTEMA DE AGENDA |\n");
            System.out.println("Selecione a operação desejada:");
            System.out.println("\n1 - Armazenar contato\n2 - Remover contato\n3 - Buscar contato (por posição)\n4 - Exibir posição do contato\n5 - Listar todos contatos\n6 - Sair");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    com.limparTela();
                    System.out.println("Insira as informações do contato " + (contAgenda+1) + ".\nPressione ENTER para continuar.");
                    scan.nextLine();
                    /* com.aguardaInput(); */
                    System.out.println("Nome: ");
                    nome = scan.nextLine();

                    System.out.println("Idade: ");
                    idade = scan.nextInt();

                    System.out.println("Altura: ");
                    altura = scan.nextFloat();

                    ag.armazenarPessoa(contAgenda, nome, idade, altura);
                    contAgenda++;
                break;
    
                case 2:
                break;
    
                case 3:
                break;

                case 4:
                    com.limparTela();
                    int posPessoa;
                    System.out.println("Informe a posição do contato na agenda: ");
                    posPessoa = scan.nextInt();
                    ag.imprimePessoa(posPessoa);
                    com.aguardaInput();
                break;

                case 5:
                    com.limparTela();
                    ag.imprimeAgenda(maxContatos);
                    com.aguardaInput();
                break;

                case 6:
                    opcao = -1;
                break;
            }
   
        }
        
        


        for (int i = 0; i < maxContatos; i++) {
            

        }

        
        
        /* System.out.println("Nomes: \n");
        for (int i = 0; i < maxContatos; i++){
            System.out.println(Arrays.toString(ag.getNome(i)));
        } */
        

        scan.close();
    }

}
