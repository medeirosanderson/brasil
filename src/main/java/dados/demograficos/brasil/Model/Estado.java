package dados.demograficos.brasil.Model;

public class Estado {
    private String nome;
    private String sigla;
    private double populacao;
    private double pib;

    public Estado(String nome, String sigla, double populacao, double pib) {
        this.nome = nome;
        this.sigla = sigla;
        this.populacao = populacao;
        this.pib = pib;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public double getPopulacao() {
        return populacao;
    }
    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }
    public double getPib() {
        return pib;
    }
    public void setPib(double pib) {
        this.pib = pib;
    }
}
