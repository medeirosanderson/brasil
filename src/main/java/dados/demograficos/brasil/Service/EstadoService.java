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
        estados.add(new Estado("Acre", "AC", 884372, 26.29, "Norte"));
        estados.add(new Estado("Amapa", "AP", 806517, 28.02, "Norte"));
        estados.add(new Estado("Amazonas", "AM", 4321616, 161.80, "Norte"));
        estados.add(new Estado("Para", "PA", 8711196, 254.55, "Norte"));
        estados.add(new Estado("Rondonia", "RO", 1751950, 76.46, "Norte"));
        estados.add(new Estado("Roraima", "RR", 738772, 25.13, "Norte"));
        estados.add(new Estado("Tocantins", "TO", 1586859, 64.32, "Norte"));

        estados.add(new Estado("Alagoas", "AL", 3220848, 89.69, "Nordeste"));
        estados.add(new Estado("Bahia", "BA", 14870907, 430.99, "Nordeste"));
        estados.add(new Estado("Ceara", "CE", 9268836, 232.24, "Nordeste"));
        estados.add(new Estado("Maranhao", "MA", 7018211, 149.23, "Nordeste"));
        estados.add(new Estado("Paraiba", "PB", 4164468, 96.96, "Nordeste"));
        estados.add(new Estado("Pernambuco", "PE", 9562007, 270.48, "Nordeste"));
        estados.add(new Estado("Piaui", "PI", 3384547, 80.92, "Nordeste"));
        estados.add(new Estado("Rio Grande do Norte", "RN", 3455236, 101.74, "Nordeste"));
        estados.add(new Estado("Sergipe", "SE", 2299425, 60.82, "Nordeste"));

        estados.add(new Estado("Distrito Federal", "DF", 2996899, 365.67, "Centro-Oeste"));
        estados.add(new Estado("Goias", "GO", 7423629, 336.75, "Centro-Oeste"));
        estados.add(new Estado("Mato Grosso", "MT", 3893659, 273.01, "Centro-Oeste"));
        estados.add(new Estado("Mato Grosso do Sul", "MS", 2924631, 184.40, "Centro-Oeste"));

        estados.add(new Estado("Espirito Santo", "ES", 4126854, 209.83, "Sudeste"));
        estados.add(new Estado("Minas Gerais", "MG", 21393441, 971.98, "Sudeste"));
        estados.add(new Estado("Rio de Janeiro", "RJ", 17223547, 1172.87, "Sudeste"));
        estados.add(new Estado("Sao Paulo", "SP", 46081801, 3444.81, "Sudeste"));

        estados.add(new Estado("Parana", "PR", 11890517, 670.92, "Sul"));
        estados.add(new Estado("Rio Grande do Sul", "RS", 11233263, 650.11, "Sul"));
        estados.add(new Estado("Santa Catarina", "SC", 8187029, 513.39, "Sul"));
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
