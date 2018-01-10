package com.enlopes.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.enlopes.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {

}
