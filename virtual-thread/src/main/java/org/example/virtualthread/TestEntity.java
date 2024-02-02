package org.example.virtualthread;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "test")
public class TestEntity {

    @Id
    private Integer id;

    private String value;
}
