package players.application.create;

import java.util.UUID;

public class FootballPlayerDTO {

    private UUID uuid;

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTeam() {
        return team;
    }

    private String name;
    private int age;
    private String team;

    public FootballPlayerDTO(UUID uuid, String name, int age, String team) {
        this.uuid = uuid;
        this.name = name;
        this.age = age;
        this.team = team;
    }
}
