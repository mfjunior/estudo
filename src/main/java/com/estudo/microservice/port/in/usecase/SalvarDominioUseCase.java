package com.estudo.microservice.port.in.usecase;

import com.estudo.microservice.core.model.Dominio;

public interface SalvarDominioUseCase<T extends Dominio> {

    T salvar(T dominio);
}
