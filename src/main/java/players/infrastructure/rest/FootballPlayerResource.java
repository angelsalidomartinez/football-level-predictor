package players.infrastructure.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import players.application.create.FootballPlayerCreator;
import players.infrastructure.rest.request.FootballPlayer;

import javax.inject.Inject;

@Path("/footballPlayer")
public class FootballPlayerResource {
    @Inject
    FootballPlayerCreator footballPlayerCreator;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String ping(){
        return "pong";
    }

    public String add(FootballPlayer footballPlayer){
        return null;
    }

}
