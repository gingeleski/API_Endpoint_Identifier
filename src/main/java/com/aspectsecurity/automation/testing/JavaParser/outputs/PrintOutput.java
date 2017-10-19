package com.aspectsecurity.automation.testing.JavaParser.outputs;

import com.aspectsecurity.automation.testing.JavaParser.objects.Endpoint;
import com.aspectsecurity.automation.testing.JavaParser.objects.Parameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class PrintOutput
{
    public static void endpointsToPrint(List<Endpoint> endpoints)
    {
        Logger logger = LoggerFactory.getLogger(PrintOutput.class);

        logger.debug("Printing Endpoint Info:");
        for (Endpoint endpoint : endpoints)
        {
            logger.info("=====================================================");
            logger.info("Name: " + (endpoint.getName() == null ? "<N/A>" : endpoint.getName()));
            logger.info("URL: " + endpoint.getUrl());
            logger.info("HTTP methods: " + endpoint.getMethods().toString());
            logger.info("Consumes: " + endpoint.getConsumes().toString());
            logger.info("Produces: " + endpoint.getProduces().toString());
            logger.info("Part of class: "+ endpoint.getClazzName());

            logger.info("Headers:");
            for (Parameter header : endpoint.getHeaders()) {
                logger.info("\t\t" + header.getHttpParameterName() + " = " + header.getDefaultValue());
            }

            logger.info("Parameters:");
            for (Parameter param : endpoint.getParams()) {
                logger.info("\t\t" + param.getHttpParameterName() + " is a " + param.getAnnotation() + " of type " + param.getType() + " and a default value of " + (param.getDefaultValue().equals("") ? "<N/A>" : param.getDefaultValue())+ ". This input " + (param.isRequired() ? "is" : "is not") + " required.");
            }
        }
    }
}
