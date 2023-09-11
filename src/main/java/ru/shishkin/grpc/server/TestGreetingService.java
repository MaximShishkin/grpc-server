package ru.shishkin.grpc.server;

import io.grpc.stub.StreamObserver;
import ru.shishkin.grpc.generetedsources.GreetingServiceGrpc;
import ru.shishkin.grpc.generetedsources.GreetingServiceOuterClass;

public class TestGreetingService extends GreetingServiceGrpc.GreetingServiceImplBase {
    @Override
    public void greeting(GreetingServiceOuterClass.HelloRequest request,
                         StreamObserver<GreetingServiceOuterClass.HelloResponse> responseObserver) {

        System.out.println(request);

        GreetingServiceOuterClass.HelloResponse response = GreetingServiceOuterClass
                .HelloResponse.newBuilder().setGreeting("Hello from server, " + request.getName())
                .build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();
    }
}
