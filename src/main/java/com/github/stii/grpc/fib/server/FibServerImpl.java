package com.github.stii.grpc.fib.server;

import com.proto.fib.*;
import io.grpc.stub.StreamObserver;

public class FibServerImpl extends FibServerGrpc.FibServerImplBase {

    @Override
    public void calculateFib(CalculateFibRequest request, StreamObserver<CalculateFibResponse> responseObserver) {
        int number = request.getNumber();
        long fibNumber = calculateFib(number, 0, 1);

        CalculateFibResponse response = CalculateFibResponse.newBuilder()
                .setFibNumber(fibNumber)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private long calculateFib(int n, long a, long b) {
        if (n == 0) {
            return a;
        }
        return calculateFib(n - 1, b, a + b);
    }
}
