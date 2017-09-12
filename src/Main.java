public class Main {
    public static void main(String[] args) {


        GamePiece test = new GamePiece();

        System.out.println(test.getPositionX());
        System.out.println(test.getPositionY());
        test.setColor("Red");
        System.out.println(test.getColor());
    }
}