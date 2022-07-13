package com.estudo.microservice.adapter.in.http.controller;

import com.estudo.microservice.adapter.in.http.dto.TipoGarantiaDTO;
import com.estudo.microservice.adapter.out.database.aurora.entity.TipoGarantiaEntity;
import com.estudo.microservice.adapter.out.database.aurora.repository.TipoGarantiaRepository;
import com.estudo.microservice.core.model.TipoGarantia;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.estudo.microservice.adapter.in.http.controller.DominioGenericoController.BASE_PATH;

@RestController
@RequestMapping(BASE_PATH + "/tipos_garantias")
public class TipoGarantiaController extends DominioGenericoController<TipoGarantia, TipoGarantiaEntity,
        TipoGarantiaDTO> {


    public TipoGarantiaController(TipoGarantiaRepository dominioRepository, TipoGarantiaDTO dominioDTO,
                                  TipoGarantiaEntity dominioEntity) {
        super(dominioRepository, dominioDTO, dominioEntity);
    }
}