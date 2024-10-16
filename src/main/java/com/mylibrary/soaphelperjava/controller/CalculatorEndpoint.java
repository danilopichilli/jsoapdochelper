package com.mylibrary.soaphelperjava.controller;

import com.jsoapdoc.soaplib.annotation.EndpointInfo;
import com.jsoapdoc.soaplib.annotation.MethodDetails;
import com.mylibrary.soaphelperjava.request.AddRequest;
import com.mylibrary.soaphelperjava.request.SubtractRequest;
import com.mylibrary.soaphelperjava.response.AddResponse;
import com.mylibrary.soaphelperjava.response.SubtractResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@EndpointInfo(name = "Calculator", description = "Operazioni di calcolo", version = "1.1", rolesAllowed = {"admin", "user"})
public class CalculatorEndpoint {

    private static final String NAMESPACE_URI = "http://mylibrary.com/soaphelperjava";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AddRequest")
    @ResponsePayload
    @MethodDetails(
            description = "Esegue l'addizione tra due numeri",
            requestType = AddRequest.class,
            responseType = AddResponse.class,
            version = "1.1",
            rolesAllowed = {"admin", "user"}
    )
    public AddResponse add(@RequestPayload AddRequest request) {
        AddResponse response = new AddResponse();
        response.setResult(request.getA() + request.getB());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SubtractRequest")
    @ResponsePayload
    @MethodDetails(
            description = "Esegue la sottrazione tra due numeri",
            requestType = SubtractRequest.class,
            responseType = SubtractResponse.class,
            version = "1.1",
            rolesAllowed = {"admin", "user"}
    )
    public SubtractResponse subtract(@RequestPayload SubtractRequest request) {
        SubtractResponse response = new SubtractResponse();
        response.setResult(request.getA() - request.getB());
        return response;
    }
}
