package app.grpc;

import app.grpc.User.LoginRequest;
import app.grpc.User.LoginResponse;
import io.grpc.stub.StreamObserver;

public class UserService extends userGrpc.userImplBase {
    @Override
    public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
        String username = request.getUserName();
        String password = request.getPassword();
        
        LoginResponse.Builder response = LoginResponse.newBuilder();
        
        if(username.equals(password)) {
            response.setIdResponse(0).setMsgResponse("SUCCES");
        } else {
            response.setIdResponse(100).setMsgResponse("NON VALIDE");
        }
        
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
