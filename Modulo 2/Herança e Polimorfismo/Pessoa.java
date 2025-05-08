import java.util.Calendar;

public class Pessoa {
    //Atributos
    private String nome;
    private Calendar data_nascimento;
    private long CPF;
    //Métodos
    public Pessoa(String nome, Calendar data_nascimento, long CPF){
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.CPF = CPF;
    }
    protected void atualizarNome(String nome){
        this.nome = nome;
    }
    protected String recuperarNome(){
        return this.nome;
    }
    protected void atualizarCPF(long CPF){
        this.CPF = CPF;
    }
    protected long recuperarCPF(){
        return this.CPF;
    }
}