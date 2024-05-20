package org.camel.sample.standalone.camelstandalone;

import org.apache.camel.builder.RouteBuilder;

public class SampleRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:myTimer?period=5000")
                .log("This is a standalone application using camel");
    }
}
