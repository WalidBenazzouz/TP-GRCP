package app.grpc;

import app.grpc.User.LoginRequest;
import app.grpc.User.LoginResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ClientGrpc {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9082)
                .usePlaintext()
                .build();

        userGrpc.userBlockingStub userStub = userGrpc.newBlockingStub(channel);

        LoginRequest login = LoginRequest.newBuilder()
                .setUserName("GRPC")
                .setPassword("GRPC")
                .build();

        LoginResponse response = userStub.login(login);

        System.out.println(response.getMsgResponse());

        channel.shutdown();
    }
}
