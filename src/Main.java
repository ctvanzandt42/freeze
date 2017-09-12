public class Main {
    public static void main(String[] args) {

        GamePiece test = new GamePiece();

        test.setName("Super Awesome Game Piece");
        test.setColor("Red");
        System.out.println("Position X is: " + test.getPositionX());
        System.out.println("Position Y is: " + test.getPositionY());
        System.out.println("Is the piece frozen? " + test.isFrozen()); //should return false
        System.out.println(test.freeze()); //should return "Freeze!"
        System.out.println("Moving coordinates: " + test.move(10, 200));
        System.out.println("Position X is: " + test.getPositionX()); //
        System.out.println("Position Y is: " + test.getPositionY()); //should return 200
        System.out.println("Is the piece frozen? " + test.isFrozen()); //should now return true
        System.out.println(test.unfreeze()); //should return "It's melting!"
        System.out.println("Moving coordinates: " + test.move(10, 200));
        System.out.println("Position X is: " + test.getPositionX());
        System.out.println("Position Y is: " + test.getPositionY());
    }
}