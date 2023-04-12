public class Partida{
    private String nomeMapa;
    private Time timeRed;
    private Time timeBlue;

    public Partida(String nomeMapa, Time timeRed, Time timeBlue) {
        this.nomeMapa = nomeMapa;
        this.timeRed = timeRed;
        this.timeBlue = timeBlue;
    }

    public String getNomeMapa() {
        return nomeMapa;
    }

    public void setNomeMapa(String nomeMapa) {
        this.nomeMapa = nomeMapa;
    }

    public Time getTimeRed() {
        return timeRed;
    }

    public void setTimeRed(Time timeRed) {
        this.timeRed = timeRed;
    }

    public Time getTimeBlue() {
        return timeBlue;
    }

    public void setTimeBlue(Time timeBlue) {
        this.timeBlue = timeBlue;
    }
}
