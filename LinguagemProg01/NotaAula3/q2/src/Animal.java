public class Animal {
    protected String nome, raca;
    protected boolean podeCaminhar;

    public Animal(){}

    public Animal(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setPodeCaminhar(boolean podeCaminhar) {
        this.podeCaminhar = podeCaminhar;
    }

    public void caminha(){
        if (podeCaminhar){
            System.out.println("O animal está caminhando.");
        } else {
            System.out.println("Esse animal não pode caminhar.");
        }
    }

}