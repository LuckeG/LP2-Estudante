public class Estudante {
    private String nome;

    private int idade;

    private String matricula;

    private int cpf;

    Estudante(String nome, int idade, String matricula, int cpf){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getMatricula(){
        return matricula;
    }

    public int getCpf(){
        return cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }
}
