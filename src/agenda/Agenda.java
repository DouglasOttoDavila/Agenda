package agenda;

/* import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors; */

public class Agenda {

    private int maxContatos = 10;

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
        /* for (int i = 0; i < maxContatos; i++){
            if 
        } */

        /* nomeLista.set(index, nome);
        idadeLista.set(index, idade);
        alturaLista.set(index, altura); */

        /* this.nome = ArrayUtils.remove(this.nome, index); */

        this.nome[this.volumeContatos] = nome;
        this.idade[this.volumeContatos] = idade;
        this.altura[this.volumeContatos] = altura;

        this.volumeContatos++;
    }

    public void removePessoa(String nome){

        int posVetor = 0;

        for (int i = 0; i < this.volumeContatos; i++){
            if (this.nome[i] == nome){
                posVetor = i;
            }
        }

        if (!(posVetor >= 0 && posVetor < this.volumeContatos)){
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int j = posVetor; j < this.volumeContatos-1; j++) {
            this.nome[j] = this.nome[j+1];
            this.idade[j] = this.idade[j+1];
            this.altura[j] = this.altura[j+1];

        }
        this.volumeContatos--;
        

        /* List<String> nomeList = new ArrayList<>(Arrays.asList(this.nome)); */
        /* List<String> nomeLista = Arrays.asList(this.nome); */
        
        //SAVE
        /* for (int i = 0; i < maxContatos; i++){
            
            if (this.nome[i] == nome){
                this.nome[i] = this.nome[i+1];
                this.idade[i] = this.idade[i+1];
                this.altura[i] = this.altura[i+1];
                
                System.out.println("Contato removido com sucesso!");
            } else if (this.nome[i] != nome) {
                System.out.println("...");
            }
        } */
    }

    public int buscaPessoa(String nome){

        for (int i = 0; i < maxContatos; i++){
            if (this.nome[i] == nome){
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
        String pessoa = this.nome[index];
        int idade = this.idade[index];
        float altura = this.altura[index];

        System.out.println("Nome: " + pessoa.toString());
        /* System.out.println("Nome: "+ Arrays.toString(this.nome)); */
        System.out.println("Idade: "+ idade);
        System.out.println("Altura: "+ altura +"\n");
    }
    
}
