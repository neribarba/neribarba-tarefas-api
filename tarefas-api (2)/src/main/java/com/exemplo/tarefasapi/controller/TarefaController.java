package com.exemplo.tarefasapi.controller;

import com.exemplo.tarefasapi.exception.ResourceNotFoundException;
import com.exemplo.tarefasapi.model.Tarefa;
import com.exemplo.tarefasapi.repository.TarefaRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/tarefas")
@CrossOrigin
public class TarefaController {

    private final TarefaRepository repository;

    public TarefaController(TarefaRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<Tarefa> criar(@Valid @RequestBody Tarefa tarefa) {
        Tarefa criada = repository.save(tarefa);
        return ResponseEntity.created(URI.create("/api/tarefas/" + criada.getId())).body(criada);
    }

    @GetMapping
    public List<Tarefa> listarTodas() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Tarefa buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Tarefa não encontrada com id " + id));
    }

    @PutMapping("/{id}")
    public Tarefa atualizar(@PathVariable Long id, @Valid @RequestBody Tarefa nova) {
        return repository.findById(id).map(tarefa -> {
            tarefa.setNome(nova.getNome());
            tarefa.setDataEntrega(nova.getDataEntrega());
            tarefa.setResponsavel(nova.getResponsavel());
            return repository.save(tarefa);
        }).orElseThrow(() -> new ResourceNotFoundException("Tarefa não encontrada com id " + id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        return repository.findById(id).map(tarefa -> {
            repository.delete(tarefa);
            return ResponseEntity.noContent().build();
        }).orElseThrow(() -> new ResourceNotFoundException("Tarefa não encontrada com id " + id));
    }
}
