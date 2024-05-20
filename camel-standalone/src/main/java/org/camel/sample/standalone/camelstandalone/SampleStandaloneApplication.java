package org.camel.sample.standalone.camelstandalone;

import org.apache.camel.main.Main;

public final class SampleStandaloneApplication {

    private SampleStandaloneApplication() {
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main(SampleStandaloneApplication.class);
        main.run();
    }

}
