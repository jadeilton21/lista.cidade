package lista.cidades.lista.cidade.fein;

import lista.cidades.lista.cidade.response.CidadeListResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "api-cidade", url = "https://cidade-exemplo-api.s3.us-east-2.amazonaws.com/lista.Json")
public interface CidadeCliente {

    @GetMapping
    CidadeListResponse getCidade();


}
