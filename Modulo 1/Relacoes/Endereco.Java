class Endereco {
    //Atributos 
    private String nome_rua;
    private int numero;
    
    //Métodos
    public Endereco (String nome_rua, int numero){
        this.nome_rua = nome_rua;
        this.numero = numero;
    }

    private void setNomeRua(String nome_rua){
        this.nome_rua = nome_rua;
    }
    public String getNomeRua (){
        return this.nome_rua;
    }
    private void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero() {
        return this.numero;
    }

    public static void main(String args[]){
        Endereco ender = new Endereco ("Rua Honorio de Paiva Abreu",1815);
        System.out.println(ender.getNomeRua()+","+ender.getNumero());
    }
}