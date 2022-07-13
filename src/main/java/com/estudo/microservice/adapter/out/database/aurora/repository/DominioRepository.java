package com.estudo.microservice.adapter.out.database.aurora.repository;

import com.estudo.microservice.adapter.out.database.aurora.entity.DominioEntity;
import com.estudo.microservice.port.out.database.repository.DominioRepositoryPort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface DominioRepository<E extends DominioEntity> extends JpaRepository<E, Short>, DominioRepositoryPort<E> {

}