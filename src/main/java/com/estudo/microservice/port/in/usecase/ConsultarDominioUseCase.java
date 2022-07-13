package com.estudo.microservice.port.in.usecase;

import com.estudo.microservice.core.model.Dominio;

import java.util.Collection;

public interface ConsultarDominioUseCase<T extends Dominio> {

    T obterPorId(short id);

    Collection<? extends Dominio> obterTodos();
}
