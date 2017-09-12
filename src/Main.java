public class Main {
    public static void main(String[] args) {

        GamePiece test = new GamePiece();

        test.setName("Super Awesome Game Piece");
        test.setColor("Red");
        System.out.println("Position X is: " + test.getPositionX());
        System.out.println("Position Y is: " + test.getPositionY());
        System.out.println("Is the piece frozen? " + test.isFrozen()); //should return false
        test.freeze(); //should return "Freeze!"
        test.move(10, 200);
        System.out.println("Position X is: " + test.getPositionX()); //
        System.out.println("Position Y is: " + test.getPositionY()); //should return 200
        System.out.println("Is the piece frozen? " + test.isFrozen()); //should now return true
        test.unfreeze(); //should return "It's melting!"
        test.move(10, 501);
        System.out.println("Position X is: " + test.getPositionX());
        System.out.println("Position Y is: " + test.getPositionY());
        test.move(10, 500);
        System.out.println("Position X is: " + test.getPositionX());
        System.out.println("Position Y is: " + test.getPositionY());
    }
}