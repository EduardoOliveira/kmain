package eu.knoker.knodes.kmain;

import eu.knoker.knodes.kmonit.KMonit;
import eu.knoker.knodes.kweb.KWeb;
import io.vertx.core.Vertx;

/**
 * Created by eduardo on 20/12/2016.
 */
public class Main {

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new KWeb());
        vertx.deployVerticle(new KMonit());
    }
}
