package lista.cidades.lista.cidade.fein;

import lista.cidades.lista.cidade.response.CidadeListResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient
public interface CidadeCliente {

    @GetMapping
    CidadeListResponse getCidade();


}
