public class Contato extends Main{
    private String nome;
    private String telefone;
    private int identificador;
    private static int contador = 0;


    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.identificador = ++contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Contato.contador = contador;
    }

    public void armazenarContato(){

    }
}
