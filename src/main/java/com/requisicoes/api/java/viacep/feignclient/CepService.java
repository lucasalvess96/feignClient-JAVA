package com.requisicoes.api.java.viacep.feignclient;

import com.requisicoes.api.java.comum.ErroRequest;
import org.springframework.stereotype.Service;

@Service
public class CepService {

    private final CepFeignClient cepFeignClient;

    public CepService(CepFeignClient cepFeignClient) {
        this.cepFeignClient = cepFeignClient;
    }

    public CepDto findCep(String cep) {
        CepDto cepDto = cepFeignClient.findCep(cep);
        if (cepDto != null) {
            return cepDto;
        } else {
            throw new ErroRequest("ERRO AO CONSULTAR CEP: " + cep);
        }
    }
}
