package com.mylibrary.soaphelperjava.controller;

import com.jsoapdoc.soaplib.annotation.EndpointInfo;
import com.jsoapdoc.soaplib.annotation.MethodDetails;
import com.mylibrary.soaphelperjava.request.GetSomething;
import com.mylibrary.soaphelperjava.response.GetSomethingResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@EndpointInfo(name = "GetSomething", description = "Endpoint Get Something", version = "1.1", rolesAllowed = {"admin", "user"})
public class GetSomethingEndpoint {

    private static final String NAMESPACE_URI = "http://mylibrary.com/soaphelperjava";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetSomethingRequest")
    @ResponsePayload
    @MethodDetails(
            description = "Ritorna una stringa",
            requestType = GetSomething.class,
            responseType = GetSomethingResponse.class,
            version = "1.1",
            rolesAllowed = {"admin", "user"}
    )
    public GetSomethingResponse getSomething(@RequestPayload GetSomething request) {
        GetSomethingResponse response = new GetSomethingResponse();
        // Logica del business: in questo caso, si risponde con una stringa.
        response.setResponseInfo("Hai richiesto: " + request.getRequestInfo());
        return response;
    }
}
