package org.example.virtualthread;

import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.random.RandomGenerator;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestRepository testRepository;

    @GetMapping
    public TestEntity get() {

        Random random = Random.from(RandomGenerator.getDefault());

        return testRepository.findById(random.nextInt(10_000)).orElse(null);
    }
}
