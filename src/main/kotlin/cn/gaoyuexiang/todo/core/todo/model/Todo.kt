package cn.gaoyuexiang.todo.core.todo.model

import javax.persistence.*

@Entity
@Table(name = "todo")
class Todo(id: String? = null, content: String? = null) {

    @Id
    @GeneratedValue
    @Column(name = "id")
    lateinit var id: String
        private set

    @Column(name = "content")
    lateinit var content: String
        private set

}