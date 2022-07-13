package com.estudo.microservice.port.in.service;

import com.estudo.microservice.core.model.TipoAgrupamento;
import com.estudo.microservice.port.in.usecase.AlterarDominioUseCase;
import com.estudo.microservice.port.in.usecase.ConsultarDominioUseCase;
import com.estudo.microservice.port.in.usecase.SalvarDominioUseCase;

public interface TipoAgrupamentoService extends AlterarDominioUseCase<TipoAgrupamento>, ConsultarDominioUseCase<TipoAgrupamento>, SalvarDominioUseCase<TipoAgrupamento> {

}
