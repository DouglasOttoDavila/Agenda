package agenda;

public class Agenda {

    Commons com = new Commons(); // Importa classe "Commons"

    private int maxContatos = 10; // Cria constante maxContatos (define o máximo de contatos na agenda)

    // VARIÁVEIS
    private String[] nome = new String[maxContatos]; // Array para nome dos contatos
    private int[] idade = new int[maxContatos]; // Array para idade dos contatos
    private float[] altura = new float[maxContatos]; // Array para altura dos contatos
    int posicao; // Variável para armazenar a posição do array
    int volumeContatos = 0; // Quantidade de contatos iniciais

    // CONSTRUTORES (Getters and Setters)
    public String getNome(int index) {
        return nome[index];
    }

    public void setNome(int index, String nome) {
        this.nome[index] = nome;
    }

    public int getIdade(int index) {
        return idade[index];
    }

    public void setIdade(int index, int idade) {
        this.idade[index] = idade;
    }

    public float getAltura(int index) {
        return altura[index];
    }

    public void setAltura(int index, float altura) {
        this.altura[index] = altura;
    }

    // METODOS
    // Armazena um contato na agenda
    public void armazenarPessoa(String nome, int idade, float altura) {
        if (volumeContatos >= maxContatos) {
            com.limparTela();
            System.out.println("Não é possível adicionar mais de " + maxContatos + " na agenda.");
            System.out.println("Remova algum  contato antes de adicionar um novo.");
            com.aguardaInput();
        } else {
            this.nome[this.volumeContatos] = nome;
            this.idade[this.volumeContatos] = idade;
            this.altura[this.volumeContatos] = altura;
            this.volumeContatos++;
            com.limparTela();
            System.out.println("Contato criado com sucesso!");
            System.out.println("Nome: " + this.nome[this.volumeContatos - 1]);
            System.out.println("Idade: " + this.idade[this.volumeContatos - 1]);
            System.out.println("Altura: " + this.altura[this.volumeContatos - 1]);
            com.aguardaInput();
        }
    }

    // Remove um contato da agenda
    public void removePessoa(int posPessoa, String nome) {

        if (!(posPessoa >= 0 && posPessoa < this.volumeContatos)) {
            throw new IllegalArgumentException("Posição inválida.");
        }
        for (int i = posPessoa; i < this.volumeContatos - 1; i++) {
            this.nome[i] = this.nome[i + 1];
            this.idade[i] = this.idade[i + 1];
            this.altura[i] = this.altura[i + 1];
        }
        System.out.println("Contato removido com sucesso!");
        this.volumeContatos--;
        com.aguardaInput();
    }

    // Busca um contato na agenda através do nome
    public int buscaPessoa(String nome) {
        for (int i = 0; i < this.volumeContatos; i++) {
            if (nome.equals(this.nome[i])) {
                posicao = i;
            }
        }
        return posicao;
    }

    // Mostra a agenda com todos seus contatos
    public void imprimeAgenda() {
        System.out.println("AGENDA\n");
        if (this.volumeContatos == 0) {
            System.out.println("Não há contatos a serem exibidos.\n");
        } else {
            for (int i = 0; i < this.volumeContatos; i++) {

                if (this.nome[i] != null) {
                    String pessoa = this.nome[i];
                    int idade = this.idade[i];
                    float altura = this.altura[i];
                    System.out.println("Nome: " + pessoa);
                    System.out.println("Idade: " + idade + " anos");
                    System.out.println("Altura: " + altura + "m\n");
                }
            }
            System.out.println("Sua agenda possui: " + this.volumeContatos + " contatos.");
        }
        com.aguardaInput();
    }

    // Mostra um contato com base em sua posição na agenda
    public void imprimePessoa(int index) {
        if (!(index >= 0 && index < this.volumeContatos)) {
            com.limparTela();
            System.out.println("Posição inválida.");
            com.aguardaInput(); 
        } else {
            com.limparTela();
            System.out.println("Nome: " + this.nome[index]);
            System.out.println("Idade: " + this.idade[index]);
            System.out.println("Altura: " + this.altura[index]);
            com.aguardaInput(); 
        }
    }
}
