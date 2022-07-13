package com.estudo.microservice.adapter.out.database.aurora.entity;

import com.estudo.microservice.core.model.TipoAgrupamento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tipos_agrupamentos")
public class TipoAgrupamentoEntity implements DominioEntity<TipoAgrupamento, TipoAgrupamentoEntity> {

    @Id
    @GeneratedValue
    @Column(name = "codigo_tipo_agrupamento")
    private short id;

    @Column(name = "descricao_tipo_agrupamento")
    private String descricao;


    @Override
    public TipoAgrupamento toDominio(TipoAgrupamentoEntity dominioEntity) {
        return TipoAgrupamento.builder().id(dominioEntity.getId()).descricao(dominioEntity.getDescricao()).build();
    }

    @Override
    public TipoAgrupamentoEntity toDominioEntity(TipoAgrupamento dominio) {
        return TipoAgrupamentoEntity.builder().id(dominio.getId()).descricao(dominio.getDescricao()).build();
    }
}