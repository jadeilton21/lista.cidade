package lista.cidades.lista.cidade.response;

import lista.cidades.lista.cidade.doMain.Cidade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CidadeListResponse {


   private List<Cidade> cidadeList;



}
