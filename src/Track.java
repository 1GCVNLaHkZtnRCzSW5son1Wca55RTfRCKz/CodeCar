/**
 * Created by Paul on 9/14/2016.
 */
public class Track {
    private String trackName;
    private double standardLapTime;
    private int numOfLaps;

    public Track(String trackName, double standardLapTime, int numOfLaps) {
        this.trackName = trackName;
        this.standardLapTime = standardLapTime;
        this.numOfLaps = numOfLaps;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public double getStandardLapTime() {
        return standardLapTime;
    }

    public void setStandardLapTime(double standardLapTime) {
        this.standardLapTime = standardLapTime;
    }

    public int getNumOfLaps() {
        return numOfLaps;
    }

    public void setNumOfLaps(int numOfLaps) {
        this.numOfLaps = numOfLaps;
    }
}
