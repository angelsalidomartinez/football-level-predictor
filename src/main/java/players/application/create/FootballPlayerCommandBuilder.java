package players.application.create;

public class FootballPlayerCommandBuilder {
    private String name;
    private int age;
    private String team;

    public FootballPlayerCommandBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public FootballPlayerCommandBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public FootballPlayerCommandBuilder setTeam(String team) {
        this.team = team;
        return this;
    }

    public FootballPlayerCommand createFootballPlayerCommand() {
        return new FootballPlayerCommand(name, age, team);
    }
}