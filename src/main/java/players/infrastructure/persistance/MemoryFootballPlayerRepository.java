package players.infrastructure.persistance;

import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Default;
import players.domain.FootballPlayer;
import players.domain.FootballPlayerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Dependent
public class MemoryFootballPlayerRepository implements FootballPlayerRepository {

    private List<FootballPlayer> footballPlayers;

    public MemoryFootballPlayerRepository(){
        if(footballPlayers == null){
            footballPlayers = new ArrayList<FootballPlayer>();
        }
    }

    @Override
    public FootballPlayer save(FootballPlayer footballPlayer) {
        footballPlayer.setUuid(UUID.randomUUID());
        footballPlayers.add(footballPlayer);
        return footballPlayer;
    }
}
