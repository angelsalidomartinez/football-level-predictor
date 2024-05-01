package players.domain;

import players.application.create.FootballPlayerDTO;

public interface FootballPlayerRepository {

    public FootballPlayerDTO save(FootballPlayer footballPlayer);

}
