package dados.demograficos.brasil.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dados.demograficos.brasil.Service.*;
import dados.demograficos.brasil.Model.Estado;


@RestController
@RequestMapping("/regiao")
public class RegiaoController {

    private final RegiaoService regiaoService;

    public RegiaoController(RegiaoService regiaoService) {
        this.regiaoService = regiaoService;
    }

    @GetMapping("/norte")
    public List<Estado> regiaoNorte(){
        return regiaoService.regiaoNorte();
    }
    
    @GetMapping("/nordeste")
    public List<Estado> regiaoNordeste(){
        return regiaoService.regiaoNordeste();
    }
    
    @GetMapping("/centrooeste")
    public List<Estado> regiaoOeste(){
        return regiaoService.regiaoCentroOeste();
    }
    
    @GetMapping("/Sudeste")
    public List<Estado> regiaoSudeste(){
        return regiaoService.regiaoSudeste();
    }

    
    @GetMapping("/sul")
    public List<Estado> regiaoSul(){
        return regiaoService.regiaoSul();
    }
}
