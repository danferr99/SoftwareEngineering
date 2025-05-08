// Classe Abstrata
abstract class Animal {
    // metodo abstrato
    public abstract void emitirSom();

    // metodo abstrato leao
    public abstract void tipoDeAnimal();

    // metodo concreto
    public void dormir() {
        System.out.println("Zzzz...");
    }
}

// subclasse concreta
class Cachorro extends Animal {
    public void emitirSom() {
        System.out.println("Latir!");
    }

    public void tipoDeAnimal(){
        System.out.println("Animal Doméstico!");
    }
}

// subclasse concreta
class Gato extends Animal {
    public void emitirSom() {
        System.out.println("Miar!");
    }

    public void tipoDeAnimal(){
        System.out.println("Animal Doméstico!");
    }
}

class Leao extends Animal{
    public void emitirSom(){
        System.out.println("Rugir!");
    }
    public void tipoDeAnimal(){
        System.out.println("Animal Selvagem!");
    }

    
}

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal leao = new Leao();

        cachorro.emitirSom();
        cachorro.dormir();
        cachorro.tipoDeAnimal();    

        gato.emitirSom();  
        gato.dormir();
        gato.tipoDeAnimal();

        leao.emitirSom();
        leao.dormir();
        leao.tipoDeAnimal();
        
    }
}

