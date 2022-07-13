package com.estudo.microservice.adapter.in.http.controller;

import com.estudo.microservice.adapter.in.http.dto.DominioDTO;
import com.estudo.microservice.adapter.out.database.aurora.entity.DominioEntity;
import com.estudo.microservice.core.model.Dominio;
import com.estudo.microservice.core.service.impl.DominioServiceAbstract;
import com.estudo.microservice.port.out.database.repository.DominioRepositoryPort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public abstract class DominioGenericoController<T extends Dominio, E extends DominioEntity, D extends DominioDTO> {

    final static String BASE_PATH = "/dominios/v1";

    private final DominioServiceAbstract<T, E> dominioService;

    private final DominioDTO<T, D> dominioDTO;

    private final DominioEntity<T, E> dominioEntity;

    public DominioGenericoController(DominioRepositoryPort<E> dominioRepositoryPort, DominioDTO<T, D> dominioDTO,
                                     DominioEntity<T, E> dominioEntity) {
        this.dominioService = new DominioServiceAbstract(dominioRepositoryPort, dominioEntity);
        this.dominioDTO = dominioDTO;
        this.dominioEntity = dominioEntity;
    }

    @GetMapping("/{id}")
    public ResponseEntity<D> getPorId(@PathVariable short id) {
        return ResponseEntity.ok(dominioDTO.toDominioDTO(dominioService.obterPorId(id)));
    }

    @GetMapping
    public ResponseEntity<List<D>> getTodos() {
        return ResponseEntity.ok((List<D>) dominioService.obterTodos().stream().map(d -> dominioDTO.toDominioDTO((T) d)));
    }
}