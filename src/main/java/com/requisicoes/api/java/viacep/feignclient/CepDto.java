package com.requisicoes.api.java.viacep.feignclient;

public record CepDto(
        String cep,
        String logradouro,
        String complemento,
        String bairro,
        String localidade,
        String uf,
        String ddd
) {}
