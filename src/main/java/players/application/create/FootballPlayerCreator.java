package players.application.create;

import jakarta.inject.Inject;
import players.domain.FootballPlayer;
import players.domain.FootballPlayerRepository;

public class FootballPlayerCreator {

    @Inject
    FootballPlayerRepository footballPlayerRepository;

    public FootballPlayerDTO create(FootballPlayerCommand footballPlayerCommand){

        if (footballPlayerCommand == null){
            throw new RuntimeException("Football Player cannot be null");
        }

        FootballPlayer footballPlayer = new FootballPlayer(footballPlayerCommand.getName(),footballPlayerCommand.getAge(),footballPlayerCommand.getTeam());
        return footballPlayerRepository.save(footballPlayer);
    }

}
