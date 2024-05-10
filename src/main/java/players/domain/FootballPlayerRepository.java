package players.domain;

import players.application.create.FootballPlayerDTO;

public interface FootballPlayerRepository {

    public FootballPlayer save(FootballPlayer footballPlayer);

}
