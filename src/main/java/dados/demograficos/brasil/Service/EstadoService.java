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
        
        adicionarEstado("Acre", "AC", 884372, 26.29, "Norte");
        adicionarEstado("Amapa", "AP", 806517, 28.02, "Norte");
        adicionarEstado("Amazonas", "AM", 4321616, 161.80, "Norte");
        adicionarEstado("Para", "PA", 8711196, 254.55, "Norte");
        adicionarEstado("Rondonia", "RO", 1751950, 76.46, "Norte");
        adicionarEstado("Roraima", "RR", 738772, 25.13, "Norte");
        adicionarEstado("Tocantins", "TO", 1586859, 64.32, "Norte");

        adicionarEstado("Alagoas", "AL", 3220848, 89.69, "Nordeste");
        adicionarEstado("Bahia", "BA", 14870907, 430.99, "Nordeste");
        adicionarEstado("Ceara", "CE", 9268836, 232.24, "Nordeste");
        adicionarEstado("Maranhao", "MA", 7018211, 149.23, "Nordeste");
        adicionarEstado("Paraiba", "PB", 4164468, 96.96, "Nordeste");
        adicionarEstado("Pernambuco", "PE", 9562007, 270.48, "Nordeste");
        adicionarEstado("Piaui", "PI", 3384547, 80.92, "Nordeste");
        adicionarEstado("Rio Grande do Norte", "RN", 3455236, 101.74, "Nordeste");
        adicionarEstado("Sergipe", "SE", 2299425, 60.82, "Nordeste");

        adicionarEstado("Distrito Federal", "DF", 2996899, 365.67, "Centro-Oeste");
        adicionarEstado("Goias", "GO", 7423629, 336.75, "Centro-Oeste");
        adicionarEstado("Mato Grosso", "MT", 3893659, 273.01, "Centro-Oeste");
        adicionarEstado("Mato Grosso do Sul", "MS", 2924631, 184.40, "Centro-Oeste");

        adicionarEstado("Espirito Santo", "ES", 4126854, 209.83, "Sudeste");
        adicionarEstado("Minas Gerais", "MG", 21393441, 971.98, "Sudeste");
        adicionarEstado("Rio de Janeiro", "RJ", 17223547, 1172.87, "Sudeste");
        adicionarEstado("Sao Paulo", "SP", 46081801, 3444.81, "Sudeste");

        adicionarEstado("Parana", "PR", 11890517, 670.92, "Sul");
        adicionarEstado("Rio Grande do Sul", "RS", 11233263, 650.11, "Sul");
        adicionarEstado("Santa Catarina", "SC", 8187029, 513.39, "Sul");
    }

    private void adicionarEstado(String nome, String sigla, double populacao, double pibEmMilhoes, String regiao){
        estados.add(new Estado(nome, sigla, populacao, pibEmMilhoes, regiao));
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
