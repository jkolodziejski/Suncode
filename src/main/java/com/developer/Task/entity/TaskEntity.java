package com.developer.Task.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tabela_testowa")
@Data
@Getter
@Setter
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "kolumna1")
    private String kolumna1;

    @Column(name = "kolumna2")
    private String kolumna2;

    @Column(name = "kolumna3")
    private String kolumna3;

    @Column(name = "kolumna4")
    private String kolumna4;

    public TaskEntity() {
    }

    public TaskEntity(Long id, String kolumna1, String kolumna2, String kolumna3, String kolumna4) {
        this.id = id;
        this.kolumna1 = kolumna1;
        this.kolumna2 = kolumna2;
        this.kolumna3 = kolumna3;
        this.kolumna4 = kolumna4;
    }


}
