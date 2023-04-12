public class Main {
    public static void main(String[] args) {
        //cria os campeoes
        Campeao yasuo = new Campeao("Yasuo", "Yasuo Vândalo");
        Campeao zed = new Campeao("Zed", "Zed Projeto");
        Campeao ahri = new Campeao("Ahri", "Ahri Raposa Flamejante");
        Campeao lux = new Campeao("Lux", "Lux Elementalista");
        Campeao darius = new Campeao("Darius", "Darius Mão de Noxus");
        Campeao teemo = new Campeao("Teemo", "Teemo Elfo Feliz");
        Campeao ezreal = new Campeao("Ezreal", "Ezreal Academia de Batalha");
        Campeao jinx = new Campeao("Jinx", "Jinx Mafiosa");
        Campeao thresh = new Campeao("Thresh", "Thresh Guardião Estelar");
        Campeao leona = new Campeao("Leona", "Leona Solar Eclipse");
        Campeao riven = new Campeao("Riven", "Riven Espada do Exílio");
        Campeao akali = new Campeao("Akali", "Akali K/DA");
        Campeao xayah = new Campeao("Xayah", "Xayah Guardiã Estelar");
        Campeao rakan = new Campeao("Rakan", "Rakan Guardião Estelar");
        Campeao katarina = new Campeao("Katarina", "Katarina Mercenária");
        Campeao missFortune = new Campeao("Miss Fortune", "Miss Fortune Mafiosa");
        Campeao twistedFate = new Campeao("Twisted Fate", "Twisted Fate Magnífico");
        Campeao garen = new Campeao("Garen", "Garen Demacia Vice");
        Campeao yuumi = new Campeao("Yuumi", "Yuumi Guardiã Estelar");
        Campeao veigar = new Campeao("Veigar", "Veigar Senhor do Mal");

        //cria os times
        Time time1 = new Time("Os últimos campeões da terra", leona, jinx, zed, teemo, darius);
        Time time2 = new Time("Inimigos do super xandão", thresh, lux, yasuo, ezreal, ahri);
        Time time3 = new Time("Guerreiros da Luz Estelar", riven, akali, xayah, rakan, katarina);
        Time time4 = new Time("Mestres da Magia Obscura", missFortune, twistedFate, garen, yuumi, veigar);

        //cria as partidas
        Partida partida1 = new Partida("Sumonners Rift", time1, time2);
        Partida partida2 = new Partida("Hollow", time3, time4);

        //testagem de acesso aos campeoes dos times por partida
        System.out.println(partida1.getTimeRed().getTop().getNome());
        System.out.println(partida1.getTimeBlue().getJungle().getNome());
        System.out.println(partida2.getTimeRed().getMid().getNome());
        System.out.println(partida2.getTimeRed().getSuporte().getNome());


    }
}

