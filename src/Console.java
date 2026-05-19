public class Console {

    private String nome;
    private String fabricante;
    private int ano;
    private int geracao;

    public int getGeracao() {
        return geracao;
    }

    public int getAno() {
        return ano;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setGeracao(int geracao) {
        this.geracao = geracao;
    }

    public Console(String nome, String fabricante, int ano, int geracao) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.ano = ano;
        this.geracao = geracao;
    }

    @Override
    public String toString() {
        return "Console{" +
                "nome='" + nome + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", ano=" + ano +
                ", geracao=" + geracao +
                '}';
    }
}
