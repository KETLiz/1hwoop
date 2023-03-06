public class Player {
    static long id;
    String name;
    double damage;
    double hp;

    public Player(String name) {
        this.name = name;
    }

    public long idCount() {
        id++;
        return id;
    }

    public void getInfo() {
        System.out.println("Это игрок с именем: " + name + " и его id: " + idCount());
    }
}
