public class Main {
    public static void main(String[] args) {
            Printable[] elements = {createObject("Artist"),
                    createObject("Song"), createObject("Genre")};
            System.out.println("------MY PLAYLIST------");
            for (Printable object : elements) {
                object.print();
            }
        }

        public static Player createObject(String className) {
            return switch (className) {
                case "Artist" -> new Artist("Atlantis", 17);
                case "Song" -> new Song("Set Free", 3.23);
                case "Genre" -> new Genre("RnB");
                default -> throw new IllegalArgumentException("Неверный класс: " + className);
            };
        }
    }
