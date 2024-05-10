package players.infrastructure.rest;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import players.application.create.FootballPlayerCommand;
import players.application.create.FootballPlayerCommandBuilder;
import players.application.create.FootballPlayerCreator;
import players.application.create.FootballPlayerDTO;
import players.infrastructure.rest.request.FootballPlayer;

import javax.print.attribute.standard.Media;


@Path("/footballPlayer")
public class FootballPlayerResource {
    @Inject
    FootballPlayerCreator footballPlayerCreator;

    @Inject
    FootballPlayerCommandBuilder footballPlayerCommandBuilder;

    @GET
    @Path("/ping")
    @Produces(MediaType.TEXT_PLAIN)
    public String ping(){
        return "pong";
    }

    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public players.infrastructure.rest.response.FootballPlayer add(@BeanParam FootballPlayer footballPlayer){
        FootballPlayerCommand command = footballPlayerCommandBuilder.setAge(footballPlayer.getAge())
                .setName(footballPlayer.getName())
                .setTeam(footballPlayer.getTeam())
                .createFootballPlayerCommand();
        FootballPlayerDTO footballPlayerDTO = footballPlayerCreator.create(command);
        return new players.infrastructure.rest.response.FootballPlayer(footballPlayerDTO.getUuid(),footballPlayerDTO.getName(),footballPlayerDTO.getTeam(),footballPlayerDTO.getAge());
    }

}
