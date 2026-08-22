package dados.demograficos.brasil.Model;

import java.util.List;

public class Regiao {
    private List<Estado> estados;


    public Regiao(List<Estado> estados) {
        this.estados = estados;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }
}
