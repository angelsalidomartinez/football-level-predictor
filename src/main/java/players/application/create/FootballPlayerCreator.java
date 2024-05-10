package players.application.create;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import players.application.assembler.FootballPlayerAssembler;
import players.domain.FootballPlayer;
import players.domain.FootballPlayerRepository;
@ApplicationScoped
public class FootballPlayerCreator {

    @Inject
    FootballPlayerRepository footballPlayerRepository;
    @Inject
    FootballPlayerAssembler footballPlayerAssembler;

    public FootballPlayerDTO create(FootballPlayerCommand footballPlayerCommand){

        if (footballPlayerCommand == null){
            throw new RuntimeException("Football Player cannot be null");
        }

        FootballPlayer footballPlayer = new FootballPlayer(footballPlayerCommand.getName(),footballPlayerCommand.getAge(),footballPlayerCommand.getTeam());

        return footballPlayerAssembler.toDTO(footballPlayerRepository.save(footballPlayer));
    }

}
