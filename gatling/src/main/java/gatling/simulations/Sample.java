package gatling.simulations;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

public class Sample extends Simulation {

    HttpProtocolBuilder httpProtocol = http
        .baseUrl("https://api.tinygis.net")
        .authorizationHeader("");

    ChainBuilder list = exec(http("List").get("/v1/districts/JP"));

    ScenarioBuilder sample = scenario("Sample").exec(list);

    {
        setUp(
            sample.injectOpen(rampUsers(1).during(1))
        ).protocols(httpProtocol);
    }
}
