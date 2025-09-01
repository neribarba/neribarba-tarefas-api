package com.exemplo.tarefasapi.repository;

import com.exemplo.tarefasapi.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {}
