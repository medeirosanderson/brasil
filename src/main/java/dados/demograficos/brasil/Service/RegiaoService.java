package dados.demograficos.brasil.Service;


import java.util.List;

import org.springframework.stereotype.Service;
import dados.demograficos.brasil.Model.Estado;

@Service
public class RegiaoService {
    private final EstadoService estadoService;


    
    public RegiaoService(EstadoService estadoService){
        this.estadoService = estadoService;
    }

    public List<Estado> regiaoNorte(){
        return estadoService.todosEstados().stream()
        .filter(estado -> estado.getRegiao().equalsIgnoreCase("Norte"))
        .toList();
    }

    public List<Estado> norte(){
        return regiaoNorte();
    }

}
