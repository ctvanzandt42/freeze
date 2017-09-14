public class Main {
    public static void main(String[] args) {

        GamePiece test = new GamePiece();

        test.setName("Super Awesome Game Piece");
        test.setColor("Red");
        System.out.println("Position X is: " + test.getPositionX());
        System.out.println("Position Y is: " + test.getPositionY());
        System.out.println(test.isFrozen());
        test.freeze();
        System.out.println(test.isFrozen());
        test.move(10, 200);
        test.unfreeze();
        System.out.println(test.isFrozen());
        test.move(10, 501);
        test.move(10, 500);
        System.out.println("Position X is: " + test.getPositionX());
        System.out.println("Position Y is: " + test.getPositionY());
    }
}