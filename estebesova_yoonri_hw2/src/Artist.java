public class Artist extends Player{
    private int popularity;
    public Artist(String name, int popularity) {
        super(name);
        this.popularity = popularity;
    }

    @Override
    public void print() {
        System.out.println("Artist name: " + getName() + " | Billboard: " + popularity);

    }
}
