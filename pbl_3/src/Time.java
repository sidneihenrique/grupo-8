public class Time{

    private String nomeTime;
    private Campeao suporte;
    private Campeao atirador;
    private Campeao mid;
    private Campeao top;
    private Campeao jungle;

    public Time(String nomeTime,Campeao suporte, Campeao atirador, Campeao mid, Campeao top, Campeao jungle) {
        this.nomeTime = nomeTime;
        this.suporte = suporte;
        this.atirador = atirador;
        this.mid = mid;
        this.top = top;
        this.jungle = jungle;
    }

    public String getNomeTime() {
            return nomeTime;
    }

    public Campeao getSuporte() {
            return suporte;
    }

    public Campeao getAtirador() {
            return atirador;
    }

    public Campeao getMid() {
            return mid;
    }

    public Campeao getTop() {
            return top;
    }

    public Campeao getJungle() {
            return jungle;
    }
}
