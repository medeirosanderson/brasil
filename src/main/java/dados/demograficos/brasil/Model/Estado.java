package dados.demograficos.brasil.Model;

public class Estado {
    private String nome;
    private String sigla;
    private double populacao;
    private double pibEmBilhoes;
    private String regiao;

    public Estado(String nome, String sigla, double populacao, double pibEmBilhoes, String regiao) {
        this.nome = nome;
        this.sigla = sigla;
        this.populacao = populacao;
        this.pibEmBilhoes = pibEmBilhoes;
        this.regiao = regiao;
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
        return pibEmBilhoes;
    }
    public void setPib(double pibEmBilhoes) {
        this.pibEmBilhoes = pibEmBilhoes;
    }  

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
}
