package ru.shishkin.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws InterruptedException, IOException {
        Server server = ServerBuilder.forPort(8080)
                .addService(new TestGreetingService())
                .build();

        server.start();

        System.out.println("Server started");

        server.awaitTermination();
    }
}
