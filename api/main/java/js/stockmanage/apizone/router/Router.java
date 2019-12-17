package js.stockmanage.apizone.router;

import js.stockmanage.apizone.handler.JsSampleHandler;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.web.servlet.function.RequestPredicates.GET;
//import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class Router {
    public JsSampleHandler jsSampleHandler;

    @Autowired
    public Router(JsSampleHandler jsSampleHandler) {
        this.jsSampleHandler = jsSampleHandler;
    }

    @Bean
    public RouterFunction<ServerResponse> route() {
        return RouterFunctions
                .route(GET("/api/sample").and(jsSampleHandler::getHandler);
    }

}
