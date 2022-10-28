package org.acme.usecase;

import org.acme.server.IServer;
import org.acme.server.ServerMock;

public class UseCaseMock implements IUseCase {

    private final IServer server = new ServerMock();

    @Override
    public String useCaseName() {
        return "mockUseCase " + this.server.serverName();
    }
}
