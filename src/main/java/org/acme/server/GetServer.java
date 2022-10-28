package org.acme.server;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GetServer implements IServer {

    @Override
    public String serverName() {
        return "getServer";
    }
}
