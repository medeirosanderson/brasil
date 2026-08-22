package dados.demograficos.brasil.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dados.demograficos.brasil.Model.Estado;
import dados.demograficos.brasil.Service.*;

@RestController
@RequestMapping("/estados")
public class EstadoController {
    
    private final EstadoService estadoService;
    private final RegiaoService regiaoService;

    public EstadoController(EstadoService estadoService, RegiaoService regiaoService) {
        this.estadoService = estadoService;
        this.regiaoService = regiaoService;
    }

    @GetMapping()
    public List<Estado> mostraEstados(){
        return estadoService.todosEstados();
    }

    @GetMapping("/buscarestado")
    public List<Estado> buscarEstados(@RequestParam String nome){
        return estadoService.buscarEstado(nome);
    }

    @GetMapping("/buscarsigla")
    public List<Estado> buscarSigla(@RequestParam String sigla){
        return estadoService.buscarSigla(sigla);
    }

    @GetMapping("/regiaonorte")
    public List<Estado> regiaoNorte(){
        return regiaoService.norte();
    }
}
