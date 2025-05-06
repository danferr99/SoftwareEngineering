import java.util.Calendar;


public class Main {
    //Atributos
    private static Aluno Aluno;
    //Método main
    public static void main (String args[]) {
        Calendar data = Calendar.getInstance();
        data.set(1980, 10, 23);
        Aluno = new Aluno("Daniel",data,222222);
        System.out.println(" O Nome do aluno é " + Aluno.recuperarNome());
    }
}