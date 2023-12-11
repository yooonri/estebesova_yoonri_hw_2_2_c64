public class Song extends Player {
    private double length;

    public Song(String name, double length) {
        super(name);
        this.length = length;
    }

    @Override
    public void print() {
        System.out.println("Song: " + getName() + " | Length: " + length);
    }
}
