package DesignPatterns.Strcutural.Adatpter.OrderSystem;

public class TrackInfo {

    private String trackingId;
    private String status;

    public TrackInfo(String trackingId, String status) {
        this.trackingId = trackingId;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tracki;ngInfo {" +
                "trackingId='" + trackingId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
