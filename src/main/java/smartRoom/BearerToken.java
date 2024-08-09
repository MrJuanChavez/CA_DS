package smartRoom;

import io.grpc.CallCredentials;
import io.grpc.CallCredentials.MetadataApplier;
import io.grpc.Metadata;
import io.grpc.Status;

import java.util.concurrent.Executor;

import com.google.rpc.RequestInfo;

public class BearerToken extends CallCredentials {

    private String value;

    BearerToken(String value) {
        this.value = value;
    }

    @Override
    public void applyRequestMetadata(RequestInfo requestInfo, Executor executor, MetadataApplier metadataApplier) {
        executor.execute(() -> {
            try {
                Metadata headers = new Metadata();
                headers.put(Constants.AUTHORIZATION_METADATA_KEY, String.format("%s %s", Constants.BEARER_TYPE, value));
                metadataApplier.apply(headers);
            } catch (Throwable e) {
                metadataApplier.fail(Status.UNAUTHENTICATED.withCause(e));
            }
        });
    }

    @Override
    public void thisUsesUnstableApi() {
        // noop
    }
}
