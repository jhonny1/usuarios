package com.poli.usuarios.controller;


import com.poli.usuarios.persistence.entity.Perfil;
import com.poli.usuarios.services.PerfilService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perfiles")
@RequiredArgsConstructor
public class PerfilController {


    private final PerfilService perfilService;

    @PostMapping
    public Perfil save(@RequestBody Perfil perfil) {
        return perfilService.save(perfil);
    }

    @GetMapping
    public List<Perfil> findAll() {
        return perfilService.findAll();
    }


}
