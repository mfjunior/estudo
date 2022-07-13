package com.estudo.microservice.adapter.out.database.aurora.entity;

import com.estudo.microservice.core.model.TipoGarantia;
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
public class TipoGarantiaEntity implements DominioEntity<TipoGarantia, TipoGarantiaEntity> {

    @Id
    @GeneratedValue
    @Column(name = "id_tipo_garantia")
    private short id;

    @Column(name = "descricao_tipo_garantia")
    private String descricao;

    @Override
    public TipoGarantia toDominio(TipoGarantiaEntity dominioEntity) {
        return TipoGarantia.builder().id(dominioEntity.getId()).descricao(dominioEntity.getDescricao()).build();
    }

    @Override
    public TipoGarantiaEntity toDominioEntity(TipoGarantia dominio) {
        return TipoGarantiaEntity.builder().id(dominio.getId()).descricao(dominio.getDescricao()).build();
    }
}