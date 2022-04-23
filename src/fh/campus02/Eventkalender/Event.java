package fh.campus02.Eventkalender;

public class Event {
    private String title;
    private String ort;
    private double eintrittspreis;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public double getEintrittspreis() {
        return eintrittspreis;
    }

    public void setEintrittspreis(double eintrittspreis) {
        this.eintrittspreis = eintrittspreis;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", ort='" + ort + '\'' +
                ", eintrittspreis=" + eintrittspreis +
                '}';
    }
}
