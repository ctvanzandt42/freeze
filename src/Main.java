public class Main {
    public static void main(String[] args) {

        GamePiece test = new GamePiece();

        test.setName("Super Awesome Game Piece");
        test.setColor("Red");
        System.out.println("Position X is: " + test.getPositionX());
        System.out.println("Position Y is: " + test.getPositionY());
        System.out.println("Is the piece frozen? " + test.isFrozen());
        test.freeze();
        test.move(10, 200);
        System.out.println("Position X is: " + test.getPositionX());
        System.out.println("Position Y is: " + test.getPositionY());
        System.out.println("Is the piece frozen? " + test.isFrozen());
        test.unfreeze();
        test.move(10, 501);
        System.out.println("Position X is: " + test.getPositionX());
        System.out.println("Position Y is: " + test.getPositionY());
        test.move(10, 500);
        System.out.println("Position X is: " + test.getPositionX());
        System.out.println("Position Y is: " + test.getPositionY());
    }
}