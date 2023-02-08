package org.codegen;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VelocityWriter {
    static String modelName = "User";
    static String packageName = "com.companyName.projectName";

    public static void main(String[] args) throws IOException {
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.init();

//        Template t = velocityEngine.getTemplate("vtemplates/class.vm");

        VelocityContext velocityContext = new VelocityContext();

        if(packageName != null){
            velocityContext.put("packageName", packageName);
        }

        List<Field> properties = new ArrayList<>();

        properties.add(new Field("id", "int"));
        properties.add(new Field("firstName", "String"));
        properties.add(new Field("lastName", "String"));
        properties.add(new Field("dob", "LocalDate"));

        velocityContext.put("className", modelName);
        velocityContext.put("properties", properties);

        Writer writer = new FileWriter(new File("test.java"));
        Velocity.mergeTemplate("class.vm", "UTF-8", velocityContext, writer);

        writer.flush();
        writer.close();

//        StringWriter stringWriter = new StringWriter();
//        t.merge(velocityContext, stringWriter);
//
//        System.out.println(stringWriter.toString());
    }
}
