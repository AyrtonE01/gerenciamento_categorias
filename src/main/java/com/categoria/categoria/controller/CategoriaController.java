package com.categoria.categoria.controller;

import com.categoria.categoria.entity.CategoriaEntity;
import com.categoria.categoria.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaService service;

    public CategoriaController(CategoriaService service) {
        this.service = service;
    }

    @PostMapping
    public CategoriaEntity criar(@RequestBody CategoriaEntity categoria) {
        return service.salvar(categoria);
    }

    @GetMapping
    public List<CategoriaEntity> listar() {
        return service.listarTodas();
    }

    @GetMapping("/{id}")
    public Optional<CategoriaEntity> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}