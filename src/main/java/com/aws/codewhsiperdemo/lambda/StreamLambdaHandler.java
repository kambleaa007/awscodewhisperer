package com.aws.codewhsiperdemo.lambda;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.amazonaws.serverless.exceptions.ContainerInitializationException;
import com.amazonaws.serverless.proxy.model.AwsProxyRequest;
import com.amazonaws.serverless.proxy.model.AwsProxyResponse;
import com.amazonaws.serverless.proxy.spring.SpringBootLambdaContainerHandler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.aws.codewhsiperdemo.CodewhsiperdemoApplication;

// write a  stream lambda handler java class
public class StreamLambdaHandler implements RequestHandler<Context, String> {
    

    @Override
    public String handleRequest(Context arg0, Context arg1) {
        
        arg0.getLogger().log("logging arg1 is "+arg0+" arg2 is "+arg1);
        return "Ran first lambda success";
    }
}