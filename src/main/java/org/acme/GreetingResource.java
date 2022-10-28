package org.acme;

import org.acme.usecase.IUseCase;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@ApplicationScoped
public class GreetingResource {

    private final IUseCase useCase;

    @Inject
    public GreetingResource(IUseCase newUseCase) {
        this.useCase = newUseCase;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return this.useCase.useCaseName();
    }
}