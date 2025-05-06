
import java.util.Calendar;

public class Empregado extends Pessoa {
    //Atributos
    protected String matricula;
    //Métodos
    public Empregado(String nome, Calendar data_nascimento, long CPF) {
        super(nome, data_nascimento, CPF);
    }
}