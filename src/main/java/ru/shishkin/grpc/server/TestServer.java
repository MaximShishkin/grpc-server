package ru.shishkin.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class TestServer {
    protected void startServer() {
        try {
            Server server = ServerBuilder.forPort(8080)
                    .addService(new TestGreetingService())
                    .build();

            server.start();

            System.out.println("Server started");

            server.awaitTermination();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
