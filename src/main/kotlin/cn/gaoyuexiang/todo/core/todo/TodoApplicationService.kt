package cn.gaoyuexiang.todo.core.todo

import cn.gaoyuexiang.todo.core.todo.model.Todo
import cn.gaoyuexiang.todo.core.todo.repository.TodoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TodoApplicationService @Autowired constructor(private val todoRepository: TodoRepository) {

    fun getTodos(): List<Todo> {
        return todoRepository.findAll().asSequence().toList()
    }
}