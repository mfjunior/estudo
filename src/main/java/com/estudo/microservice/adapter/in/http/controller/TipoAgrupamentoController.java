package com.estudo.microservice.adapter.in.http.controller;

import com.estudo.microservice.adapter.in.http.dto.TipoAgrupamentoDTO;
import com.estudo.microservice.adapter.out.database.aurora.entity.TipoAgrupamentoEntity;
import com.estudo.microservice.adapter.out.database.aurora.repository.TipoAgrupamentoRepository;
import com.estudo.microservice.core.model.TipoAgrupamento;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.estudo.microservice.adapter.in.http.controller.DominioGenericoController.BASE_PATH;

@RestController
@RequestMapping(BASE_PATH + "/tipos_agrupamentos")
public class TipoAgrupamentoController extends DominioGenericoController<TipoAgrupamento, TipoAgrupamentoEntity,
        TipoAgrupamentoDTO> {


    public TipoAgrupamentoController(TipoAgrupamentoRepository dominioRepository, TipoAgrupamentoDTO dominioDTO,
                                     TipoAgrupamentoEntity dominioEntity) {
        super(dominioRepository, dominioDTO, dominioEntity);
    }
}