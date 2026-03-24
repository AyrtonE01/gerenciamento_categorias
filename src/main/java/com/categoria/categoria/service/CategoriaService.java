package com.categoria.categoria.service;

import com.categoria.categoria.entity.CategoriaEntity;
import com.categoria.categoria.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }

    public CategoriaEntity salvar(CategoriaEntity categoria) {
        return repository.save(categoria);
    }

    public List<CategoriaEntity> listarTodas() {
        return repository.findAll();
    }

    public Optional<CategoriaEntity> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}