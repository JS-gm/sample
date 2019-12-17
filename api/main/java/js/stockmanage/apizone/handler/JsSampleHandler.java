package js.stockmanage.apizone.handler;

import org.omg.CORBA.ServerRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.notFound;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class JsSampleHandler {
    public Mono<ServerResponse> getHandler(ServerRequest serverRequest) {
        return ok().contentType(MediaType.APPLICATION_JSON)
                .body(gameServiceReactiveRepository.getGameServices(), GameServiceModel.class)
                .switchIfEmpty(notFound().build());
    }
}
