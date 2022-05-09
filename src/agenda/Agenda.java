package agenda;

/* import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors; */

public class Agenda {
    Commons com = new Commons();

    private int maxContatos = 3;

    public int getMaxContatos() {
        return maxContatos;
    }

    public void setMaxContatos(int maxContatos) {
        this.maxContatos = maxContatos;
    }

    //variaveis
    private String[] nome = new String [maxContatos];
    private int[] idade = new int [maxContatos];
    private float[] altura = new float [maxContatos];

    int posicao;
    int volumeContatos = 0;

    public int getVolumeContatos() {
        return volumeContatos;
    }

    public void setVolumeContatos(int volumeContatos) {
        this.volumeContatos = volumeContatos;
    }

    //CONSTRUTORES
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

    //METODOS
    public void armazenarPessoa(String nome, int idade, float altura){
        if (volumeContatos >= maxContatos) {
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
            System.out.println("Nome: "+this.nome[this.volumeContatos-1]);
            System.out.println("Idade: "+this.idade[this.volumeContatos-1]);
            System.out.println("Altura: "+this.altura[this.volumeContatos-1]);
            com.aguardaInput();
        }
    }

    public void removePessoa(int posPessoa, String nome){
        
        if (!(posPessoa >= 0 && posPessoa < this.volumeContatos)){
            throw new IllegalArgumentException("Posição inválida.");
        }
        for (int i = posPessoa; i < this.volumeContatos-1; i++){
            this.nome[i] = this.nome[i+1];
            this.idade[i] = this.idade[i+1];
            this.altura[i] = this.altura[i+1];
        }
        System.out.println("Contato removido com sucesso!"); 
        this.volumeContatos--;
    }


    public void mostraArray(){
        for (int i = 0; i < this.volumeContatos; i++){
            System.out.println(this.nome[i]);
        }
    }

    public int buscaPessoa(String nome){

        for (int i = 0; i < this.volumeContatos; i++){
            if (nome.equals(this.nome[i])){
                posicao = i;
            }
        }
        return posicao;
    }

    public void imprimeAgenda(){
        System.out.println("AGENDA\n");
        for (int i = 0; i < this.volumeContatos; i++){
            if (this.nome[i] != null){
                String pessoa = this.nome[i];
                int idade = this.idade[i];
                float altura = this.altura[i];

                System.out.println("Nome: " + pessoa);
                System.out.println("Idade: " + idade + " anos");
                System.out.println("Altura: "+ altura + "m\n");
            }
            
        }
        System.out.println("Sua agenda possui: " + volumeContatos + " contatos.");
    }

    public void imprimePessoa(int index){
        System.out.println("Nome: " + this.nome[index]);
        System.out.println("Idade: "+ this.idade[index]);
        System.out.println("Altura: "+ this.altura[index]);
    }
    
}
