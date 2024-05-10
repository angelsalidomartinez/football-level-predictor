package players.infrastructure.rest.request;

import jakarta.ws.rs.QueryParam;

public class FootballPlayer {
    @QueryParam("name")
    private String name;
    @QueryParam("age")
    private int age;
    @QueryParam("team")
    private String team;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
