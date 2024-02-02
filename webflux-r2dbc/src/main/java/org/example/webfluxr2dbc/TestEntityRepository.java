package org.example.webfluxr2dbc;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface TestEntityRepository extends R2dbcRepository<TestEntity, Integer> {
}
