package lista.cidades.lista.cidade.service;

import lista.cidades.lista.cidade.fein.CidadeCliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {



    private final CidadeCliente cidadeCliente;


    public CidadeService(CidadeCliente cidadeCliente){
        this.cidadeCliente = cidadeCliente;
    }



    public List<Cidade> getCidadeFromLibriary(){
        CidadeListResponse response = this.cidadeCliente.getCidade();

        return response.getCidadeList();
    }
}
