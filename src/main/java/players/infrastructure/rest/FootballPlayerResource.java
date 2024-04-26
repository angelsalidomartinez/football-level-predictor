package players.infrastructure.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import players.application.create.FootballPlayerCommand;
import players.application.create.FootballPlayerCommandBuilder;
import players.application.create.FootballPlayerCreator;
import players.infrastructure.rest.request.FootballPlayer;

import javax.inject.Inject;

@Path("/footballPlayer")
public class FootballPlayerResource {
    @Inject
    FootballPlayerCreator footballPlayerCreator;

    @Inject
    FootballPlayerCommandBuilder footballPlayerCommandBuilder;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String ping(){
        return "pong";
    }

    public players.infrastructure.rest.response.FootballPlayer add(FootballPlayer footballPlayer){
        FootballPlayerCommand command = footballPlayerCommandBuilder.setAge(footballPlayer.getAge())
                .setName(footballPlayer.getName())
                .setTeam(footballPlayer.getTeam())
                .createFootballPlayerCommand();
         if (footballPlayerCreator.create(command)){
             return new players.infrastructure.rest.response.FootballPlayer();
         }
        return null;
    }

}
