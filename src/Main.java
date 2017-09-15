public class Main {
    public static void main(String[] args) {

        GamePiece test = new GamePiece();

        test.setName("Super Awesome Game Piece");
        test.setColor("Red");
        System.out.println("Position X is: " + test.getPositionX());
        System.out.println("Position Y is: " + test.getPositionY() + "\n");

        if(! test.isFrozen()){
            test.freeze();
            if (test.isFrozen()){
                System.out.println("Verified that freeze() method worked\n");
            }else {
                System.out.println("Couldn't verify that freeze() method worked\n");
            }
        }

        System.out.println("Is this frozen? " + test.isFrozen());

        test.move(10, 200);

        if(test.getPositionX() == 0 && test.getPositionY() == 0) {
            System.out.println("Verified that move() method did not work when frozen\n");
        } else {
            System.out.println("Could not verify that move() method worked when frozen\n");
        }


        if (test.isFrozen()) {
            test.unfreeze();
            if (!test.isFrozen()) {
                System.out.println("Verified that unfreeze() method worked\n");
            } else {
                System.out.println("Could not verify unfreeze() method\n");
            }
        }

        System.out.println("Is this frozen? " + test.isFrozen());

        test.move(410, 401);

        if(test.getPositionX() == 0 && test.getPositionY() == 0) {
            System.out.println("Verified that move() method doesn't work if parameters are outside the grid of the game\n");

        } else {
            System.out.println("Couldn't verify that move() method did not work for parameters\n");
        }

        System.out.println("Is this frozen? " + test.isFrozen());

        test.move(10, 500);
        if(test.getPositionX() == 10 && test.getPositionY() == 500) {
            System.out.println("Verified that move() worked when given acceptable parameters\n");
        } else {
            System.out.println("Couldn't verify move() method worked\n");

        }
    }
}