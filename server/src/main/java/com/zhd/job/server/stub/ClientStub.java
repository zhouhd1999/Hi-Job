package com.zhd.job.server.stub;

import com.zhd.grpc.job.HiJobServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class ClientStub {

    public HiJobServiceGrpc.HiJobServiceBlockingStub getBlockingStub() {
        return HiJobServiceGrpc.newBlockingStub(getChannel());
    }

    private ManagedChannel getChannel() {
        return ManagedChannelBuilder.forAddress("127.0.0.1", 9090)  // 先写死，后续从Redis获取
                .disableRetry()
                .usePlaintext()
                .idleTimeout(2, TimeUnit.SECONDS)
                .build();
    }
}
