package com.estudo.microservice.port.in.usecase;

import com.estudo.microservice.core.model.Dominio;

public interface AlterarDominioUseCase<T extends Dominio> {

    T alterar(T dominio);
}
