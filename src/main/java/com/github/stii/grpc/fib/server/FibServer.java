package com.github.stii.grpc.fib.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class FibServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting the Fib gRPC server...");

        Server server = ServerBuilder.forPort(9001)
                .addService(new FibServerImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                System.out.println("Shutting down service...");
                server.shutdown();
                System.out.println("Done!");
            })
        );
        server.awaitTermination();
    }
}
