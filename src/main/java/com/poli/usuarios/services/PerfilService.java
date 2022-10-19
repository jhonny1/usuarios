package com.poli.usuarios.services;

import com.poli.usuarios.persistence.entity.Perfil;

import java.util.List;

public interface PerfilService {

    Perfil save(Perfil perfil);
      List<Perfil> findAll();

}
