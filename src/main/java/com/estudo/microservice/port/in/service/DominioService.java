package com.estudo.microservice.port.in.service;

import com.estudo.microservice.core.model.Dominio;
import com.estudo.microservice.port.in.usecase.AlterarDominioUseCase;
import com.estudo.microservice.port.in.usecase.ConsultarDominioUseCase;
import com.estudo.microservice.port.in.usecase.SalvarDominioUseCase;

public interface DominioService<T extends Dominio> extends AlterarDominioUseCase, ConsultarDominioUseCase, SalvarDominioUseCase {

}
