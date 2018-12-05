package cn.gaoyuexiang.todo.core.todo.repository

import cn.gaoyuexiang.todo.core.todo.model.Todo
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoRepository : CrudRepository<Todo, String>