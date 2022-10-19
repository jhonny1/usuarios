package com.poli.usuarios.services;


import com.poli.usuarios.persistence.entity.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario save(Usuario usuario);
    List<Usuario> findAll();

}
