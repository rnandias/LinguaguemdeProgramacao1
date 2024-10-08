public class Cachorro extends Animal {

    public Cachorro() {
        this.podeCaminhar = true;
    }

    public Cachorro(String nome) {
        super(nome);
        this.podeCaminhar = true;
    }

    public void late(){
        System.out.println("O cachorro está latindo.");
    }


}