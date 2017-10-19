package com.aspectsecurity.automation.testing.JavaParser.outputs;

import com.aspectsecurity.automation.testing.JavaParser.objects.Endpoint;
import com.aspectsecurity.automation.testing.JavaParser.objects.Parameter;
import com.google.gson.GsonBuilder;
import io.swagger.models.Info;
import io.swagger.models.Swagger;

import java.util.List;

public class SwaggerOutput
{
    public static String endpointsToSwagger(List<Endpoint> endpoints)
    {
        Swagger swagger = new Swagger();

        for (Endpoint endpoint : endpoints)
        {
            //logger.info("Name: " + (endpoint.getName() == null ? "<N/A>" : endpoint.getName()));
            //logger.info("URL: " + endpoint.getUrl());
            //logger.info("HTTP methods: " + endpoint.getMethods().toString());
            swagger.addConsumes(endpoint.getConsumes().toString());
            swagger.addProduces(endpoint.getProduces().toString());
            //logger.info("Part of class: "+ endpoint.getClazzName());

            /*
            logger.info("Headers:");
            for (Parameter header : endpoint.getHeaders()) {
                logger.info("\t\t" + header.getHttpParameterName() + " = " + header.getDefaultValue());
            } */

            for (Parameter param : endpoint.getParams()) {
                swagger.addParameter(param.getHttpParameterName(), param);
                //logger.info("\t\t" + param.getHttpParameterName() + " is a " + param.getAnnotation() + " of type " + param.getType() + " and a default value of " + (param.getDefaultValue().equals("") ? "<N/A>" : param.getDefaultValue())+ ". This input " + (param.isRequired() ? "is" : "is not") + " required.");
            }
        }

        Info info = new Info().title("API parsed to Swagger");
        swagger.setInfo(info);

        String swaggerJson = new GsonBuilder().setPrettyPrinting().create().toJson(swagger);
        return swaggerJson;
    }
}
