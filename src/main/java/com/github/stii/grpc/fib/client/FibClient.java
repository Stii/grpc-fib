package com.github.stii.grpc.fib.client;

import com.proto.fib.CalculateFibRequest;
import com.proto.fib.CalculateFibResponse;
import com.proto.fib.FibServerGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class FibClient {

    private void calculateFib(ManagedChannel channel, int number) {
        FibServerGrpc.FibServerBlockingStub fibClient = FibServerGrpc.newBlockingStub(channel);

        CalculateFibRequest request = CalculateFibRequest.newBuilder()
                .setNumber(number)
                .build();

        CalculateFibResponse response = fibClient.calculateFib(request);
        System.out.println(response.getFibNumber());
    }

    public static void main(String[] args) {
        System.out.println("Running Fib gRPC client");

        FibClient client = new FibClient();

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9001)
                .usePlaintext()
                .build();

        client.calculateFib(channel, 15);

        System.out.println("Done.");
        channel.shutdown();
    }
}
