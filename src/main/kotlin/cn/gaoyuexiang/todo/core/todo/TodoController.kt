package cn.gaoyuexiang.todo.core.todo

import cn.gaoyuexiang.todo.core.todo.model.Todo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("todos")
class TodoController @Autowired constructor(private val todoApplicationService: TodoApplicationService) {

    @GetMapping
    fun getTodos(): List<Todo> {
        return todoApplicationService.getTodos()
    }

}