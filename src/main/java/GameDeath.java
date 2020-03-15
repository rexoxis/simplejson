public class GameDeath {
    private int timeEvent;

    private boolean isRangeValid;

    private String description;

    public GameDeath(int timeEvent, boolean isRangeValid, String description) {
        this.timeEvent = timeEvent;
        this.isRangeValid = isRangeValid;
        this.description = description;
    }


    public int getTimeEvent() {
        return timeEvent;
    }

    public void setTimeEvent(int timeEvent) {
        this.timeEvent = timeEvent;
    }

    public boolean isRangeValid() {
        return isRangeValid;
    }

    public void setRangeValid(boolean rangeValid) {
        isRangeValid = rangeValid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
