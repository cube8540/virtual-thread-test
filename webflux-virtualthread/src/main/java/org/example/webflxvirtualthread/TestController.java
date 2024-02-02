package org.example.webflxvirtualthread;

import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.random.RandomGenerator;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestRepository testRepository;

    private final ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();

    @GetMapping
    public Mono<TestEntity> get() {
        Random random = Random.from(RandomGenerator.getDefault());

        CompletableFuture<TestEntity> completableFuture = CompletableFuture.supplyAsync(
                () -> testRepository.findById(random.nextInt(10_000)).orElse(null), executorService);

        return Mono.fromFuture(completableFuture);
    }

    @PreDestroy
    public void destroy() {
        executorService.close();
    }
}
