package it.unibo.scotece.domenico;
import spark.ModelAndView;
import spark.template.jade.JadeTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class Program {

    public static void main(String[] args) {

        port(8080);
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, String> model = new HashMap<>();
            model.put("message", "Hello Jade!");
            return new ModelAndView(model, "dashboard"); // located in resources/templates directory
        }, new JadeTemplateEngine());

        get("/container", (request, response) -> {
            Map<String, String> model = new HashMap<>();
            model.put("message", "Hello Jade!");
            return new ModelAndView(model, "container"); // located in resources/templates directory
        }, new JadeTemplateEngine());
    }
}
