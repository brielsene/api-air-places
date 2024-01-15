package br.com.airplaces.http;

import br.com.airplaces.domain.models.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "api-via-cep", url = "https://viacep.com.br/ws/")
public interface CepClient {

    @GetMapping("/{cep}/json")
    Endereco getEndereco(@PathVariable("cep")String cep);
}
