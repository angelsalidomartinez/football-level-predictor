package players.application.assembler;

import jakarta.enterprise.context.ApplicationScoped;
import players.application.create.FootballPlayerDTO;
import players.domain.FootballPlayer;
@ApplicationScoped
public class FootballPlayerAssembler {

    public FootballPlayer toEntity(FootballPlayerDTO footballPlayerDTO){
        return new FootballPlayer(footballPlayerDTO.getName(), footballPlayerDTO.getAge(), footballPlayerDTO.getTeam());
    }

    public FootballPlayerDTO toDTO (FootballPlayer footballPlayer){
        return new FootballPlayerDTO(footballPlayer.getUuid(), footballPlayer.getName(), footballPlayer.getAge(), footballPlayer.getTeam());
    }
}
