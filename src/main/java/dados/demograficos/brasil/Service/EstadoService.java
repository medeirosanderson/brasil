package dados.demograficos.brasil.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import dados.demograficos.brasil.Model.*;

@Service
public class EstadoService {
    
    private List<Estado> estados = new ArrayList<>();

    public EstadoService(){
        estados.add(new Estado("Acre", "AC", 0, 0,"Norte"));
        estados.add(new Estado("Amapa", "AP", 0, 0,"Norte"));
        estados.add(new Estado("Amazonas", "AM", 0, 0,"Norte"));
        estados.add(new Estado("Para", "TO", 0, 0,"Norte"));
        estados.add(new Estado("Rondonia", "RO", 0, 0,"Norte"));
        estados.add(new Estado("Roraima", "RR", 0, 0,"Norte"));
        estados.add(new Estado("Tocantins", "TO", 0, 0,"Norte"));

        estados.add(new Estado("Alagoas", "AL", 0, 0,"Nordeste"));
        estados.add(new Estado("Bahia", "BA", 0, 0,"Nordeste"));
        estados.add(new Estado("Ceara", "CE", 0, 0,"Nordeste"));
        estados.add(new Estado("Maranhao", "MA", 0, 0,"Nordeste"));
        estados.add(new Estado("Paraiba", "PB", 0, 0,"Nordeste"));
        estados.add(new Estado("Pernambuco", "PE", 0, 0,"Nordeste"));
        estados.add(new Estado("Piaui", "PI", 0, 0,"Nordeste"));
        estados.add(new Estado("Rio Grande do Norte", "RN", 0, 0,"Nordeste"));
        estados.add(new Estado("Sergipe", "SE", 0, 0,"Nordeste"));

        estados.add(new Estado("Distrito Federal", "DF", 0, 0,"Centro-Oeste"));
        estados.add(new Estado("Goias", "GO", 0, 0,"Centro-Oeste"));
        estados.add(new Estado("Mato Grosso", "MT", 0, 0,"Centro-Oeste"));
        estados.add(new Estado("Mato Grosso do Sul", "MS", 0, 0,"Centro-Oeste"));

        estados.add(new Estado("Espirito Santo", "ES", 0, 0,"Sudeste"));
        estados.add(new Estado("Minas Gerais", "MG", 0, 0,"Sudeste"));
        estados.add(new Estado("Rio de Janeiro", "RJ", 0, 0,"Sudeste"));
        estados.add(new Estado("Sao Paulo", "SP", 0, 0,"Sudeste"));

        estados.add(new Estado("Parana", "PR", 0, 0,"Sul"));
        estados.add(new Estado("Rio Grande do Sul", "RS", 0, 0,"Sul"));
        estados.add(new Estado("Santa Catarina", "SC", 0, 0,"Sul"));
    }

    public List<Estado> todosEstados(){
        return estados;
    }

    public List<Estado> buscarEstado(String nome){
        List<Estado> buscarEstado = estados.stream()
        .filter(estado -> estado.getNome().toLowerCase().contains(nome.toLowerCase()))
        .collect(Collectors.toList());

        return buscarEstado;
    }

    public List<Estado> buscarSigla(String sigla){
        List<Estado> buscarSigla = estados.stream()
        .filter(estado -> estado.getSigla().toLowerCase().contains(sigla.toLowerCase()))
        .collect(Collectors.toList());

        return buscarSigla;
    }
}
