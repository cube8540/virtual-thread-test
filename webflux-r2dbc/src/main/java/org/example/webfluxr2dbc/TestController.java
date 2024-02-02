package org.example.webfluxr2dbc;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Random;
import java.util.random.RandomGenerator;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestEntityRepository repository;

    @GetMapping
    public Mono<TestEntity> get() {
        Random random = Random.from(RandomGenerator.getDefault());
        return repository.findById(random.nextInt(10_000));
    }
}
