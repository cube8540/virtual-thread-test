package org.example.webfluxr2dbc;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "test")
public class TestEntity {

    @Id
    private Integer id;

    private String value;
}
