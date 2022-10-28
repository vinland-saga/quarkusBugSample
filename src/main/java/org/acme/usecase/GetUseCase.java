package org.acme.usecase;

import org.acme.server.IServer;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class GetUseCase implements IUseCase {

    private final IServer server;

    @Inject
    public GetUseCase(IServer newServer) {
        this.server = newServer;
    }

    @Override
    public String useCaseName() {
        return "getUseCase " + this.server.serverName();
    }
}
