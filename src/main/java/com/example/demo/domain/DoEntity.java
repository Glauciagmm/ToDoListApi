package com.example.demo.domain;

import javax.persistence.*;


@Entity
@Table(name="todo")
public class DoEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String todo;

    //@OneToOne(mappedBy = 'todo', cascade = CascadeType.ALL)
    //@JoinColumn(name = "id_todo")

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    @Override
    public String toString() {
        return "Do{" +
                "id=" + id +
                ", todo='" + todo + '\'' +
                '}';
    }

    public DoEntity(Long id, String todo) {
        this.id = id;
        this.todo = todo;
    }

    public DoEntity(Long id) {
        this.id = id;
    }

    public DoEntity(String todo) {
        this.todo = todo;
    }
    public DoEntity() {

    }
}
