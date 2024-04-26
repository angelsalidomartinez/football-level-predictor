package players.application.create;

import players.infrastructure.rest.request.FootballPlayer;

public class FootballPlayerCreator {

    public Boolean create(FootballPlayerCommand footballPlayerCommand){
        return footballPlayerCommand != null;
    }

}
