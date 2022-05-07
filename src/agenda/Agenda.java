package agenda;

/* import java.util.Arrays; */

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
    public void armazenarPessoa(int index, String nome, int idade, float altura){
        /* for (int i = 0; i < maxContatos; i++){
            if 
        } */
        this.nome[index] = nome;
        this.idade[index] = idade;
        this.altura[index] = altura;
    }

    public void removePessoa(String nome){
        
    }

    public int buscaPessoa(String nome){

        for (int i = 0; i < maxContatos; i++){
            if (this.nome[i] == nome){
                posicao = i;
            }
        }
        return posicao;
    }

    public void imprimeAgenda(int maxContatos){
        System.out.println("AGENDA\n");
        for (int i = 0; i < maxContatos; i++){
            if (this.nome[i] != null){
                String pessoa = this.nome[i];
                int idade = this.idade[i];
                float altura = this.altura[i];

                System.out.println("Nome: " + pessoa);
                System.out.println("Idade: " + idade + " anos");
                System.out.println("Altura: "+ altura + "m\n");
            }
            
        }
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
