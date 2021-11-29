package com.postgresql.testtask.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;


import javax.persistence.*;

@Entity
@Table(name = "sk_example_table")
public class ObjEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    @Getter
    private Long id;

    @Type(type = "jsonb")
    @Column(name = "obj", columnDefinition = "jsonb")
    @Getter
    @Setter
    private JsonObject jsonObject;


}
