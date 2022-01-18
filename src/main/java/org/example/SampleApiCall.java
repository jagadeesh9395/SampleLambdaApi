package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Collections;

public class SampleApiCall implements RequestHandler<Object, GateWayResponse> {

    @Override
    public GateWayResponse handleRequest(Object object, Context context) {
        String message = "Hello from Jagadeesh";
        System.out.println(message);
        return new GateWayResponse(message,
                200,
                Collections.singletonMap("X-Powered-By", "Jagadeesh"),
                false);
    }

}
