import java.util.List;

public class GameResult {

    private GameResponse response;

    private String mapid;

    private List<GameDeath> deathList;

    public GameResult(String mapid) {
        this.mapid = mapid;
    }

    public GameResponse getResponse() {
        return response;
    }

    public void setResponse(GameResponse response) {
        this.response = response;
    }

    public String getMapid() {
        return mapid;
    }

    public void setMapid(String mapid) {
        this.mapid = mapid;
    }

    public List<GameDeath> getDeathList() {
        return deathList;
    }

    public void setDeathList(List<GameDeath> deathList) {
        this.deathList = deathList;
    }
}
