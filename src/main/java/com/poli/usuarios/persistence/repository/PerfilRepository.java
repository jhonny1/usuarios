package com.poli.usuarios.persistence.repository;

import com.poli.usuarios.persistence.entity.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository  extends JpaRepository<Perfil,Integer> {


}
