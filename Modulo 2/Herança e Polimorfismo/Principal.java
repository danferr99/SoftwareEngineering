public class Principal {
    //Atributos
    private static Empregado empregado, diretor;
    //Método main
    public static void main(String args[]) {
        Calendar data = Calendar.getInstance();
        data.set(1980, 10, 23);
        empregado = new Empregado("Clara Silva", data , 211456937 , null);
        empregado.gerarMatricula();
        diretor = new Diretor ("Marco Antônio", data , 901564098 , null);
        diretor.gerarMatricula();
        System.out.println ("A matrícula do Diretor é: " + diretor.recuperarMatricula());
        System.out.println ("A matrícula do Empregado é: " + empregado.recuperarMatricula());
    }
}


public class Principal {

    // Método para retornar o maior entre dois números
    public int maior(int a, int b) {
        return (a > b) ? a : b;
    }

    // Método sobrecarregado para retornar o maior entre três números
    public int maior(int a, int b, int c) {
        return maior(maior(a, b), c); // reutiliza o método de dois parâmetros
    }

    public static void main(String[] args) {
        Principal p = new Principal();

        int maiorDeDois = p.maior(10, 20);
        int maiorDeTres = p.maior(10, 20, 15);

        System.out.println("Maior entre 10 e 20: " + maiorDeDois);
        System.out.println("Maior entre 10, 20 e 15: " + maiorDeTres);
    }
}