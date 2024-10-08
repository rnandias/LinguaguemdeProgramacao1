public class Gato extends Animal {

    public Gato() {
        this.podeCaminhar = true;
    }

    public Gato(String nome) {
        super(nome);
        this.podeCaminhar = true;
    }

    public void mia(){
        System.out.println("O gato está miando.");
    }
}