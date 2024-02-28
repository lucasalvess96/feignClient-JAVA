package com.requisicoes.api.java.viacep.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br")
public interface CepFeignClient {

    @GetMapping("/ws/{cep}/json/")
    CepDto findCep(@PathVariable String cep);
}
