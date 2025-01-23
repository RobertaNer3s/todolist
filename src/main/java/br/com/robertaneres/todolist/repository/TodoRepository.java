package br.com.robertaneres.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.robertaneres.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}