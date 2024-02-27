package lista.cidades.lista.cidade.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cidade")
public class CidadeController {



    private final CidadeService cidadeService;




    public CidadeController(CidadeService cidadeService){
        this.cidadeService = cidadeService;
    }





}
