public class Main {
  public static void main(String[] args) {
        Gamer[] gamers = new Gamer[6];
        gamers[0] = new Gamer("Bulochka_S_Korizei", true);
        gamers[1] = new Gamer("BaTon32", true);
        gamers[2] = new Gamer("ForestRun", false);
        gamers[3] = new Gamer("RasputinZaImperatora", false);
        gamers[4] = new Gamer("BlackHole", false);
        gamers[5] = new Gamer("SatanEye", true);
        for (int i = 0; i< gamers.length; i++) {
            if (gamers[i].isActive() == true) {
                System.out.println("Игрок с ником " + gamers[i].getNickname() + " сейчас в игре? " + gamers[i].isActive());
            }
        }


    }
}
