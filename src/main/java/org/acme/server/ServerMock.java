package org.acme.server;

public class ServerMock implements IServer{

    @Override
    public String serverName() {
        return "mockServer";
    }
}
