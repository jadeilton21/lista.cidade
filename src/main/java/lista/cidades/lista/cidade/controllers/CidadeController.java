package lista.cidades.lista.cidade.controllers;


import lista.cidades.lista.cidade.doMain.Cidade;
import lista.cidades.lista.cidade.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/cidade")
public class CidadeController {


    @Autowired
    private final CidadeService cidadeService;




    public CidadeController(CidadeService cidadeService){
        this.cidadeService = cidadeService;
    }

    @GetMapping
    public ResponseEntity<List<Cidade>> getCidade(){

        List<Cidade> cidade = this.cidadeService.getCidadeFromLibriary();
        return ResponseEntity.ok().body(cidade);
    }


}
