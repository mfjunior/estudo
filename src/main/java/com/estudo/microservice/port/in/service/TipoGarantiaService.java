package com.estudo.microservice.port.in.service;

import com.estudo.microservice.core.model.TipoGarantia;
import com.estudo.microservice.port.in.usecase.AlterarDominioUseCase;
import com.estudo.microservice.port.in.usecase.ConsultarDominioUseCase;
import com.estudo.microservice.port.in.usecase.SalvarDominioUseCase;

public interface TipoGarantiaService extends AlterarDominioUseCase<TipoGarantia>, ConsultarDominioUseCase<TipoGarantia>, SalvarDominioUseCase<TipoGarantia> {

}
