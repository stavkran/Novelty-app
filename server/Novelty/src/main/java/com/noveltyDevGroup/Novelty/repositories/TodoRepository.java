package com.noveltyDevGroup.Novelty.repositories;

import com.noveltyDevGroup.Novelty.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}