package com.poli.usuarios.services;

import com.poli.usuarios.persistence.repository.PerfilRepository;
import com.poli.usuarios.persistence.entity.Perfil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PerfilServiceImpl implements  PerfilService{

    private final PerfilRepository repository;

    @Override
    public Perfil save(Perfil perfil) {
        return repository.save(perfil);
    }

    @Override
    public List<Perfil> findAll() {
        return repository.findAll();
    }
}
