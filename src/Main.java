public class Main {
    public static void main(String[] args) {

        GamePiece test = new GamePiece();

        test.setName("Super Awesome Game Piece");
        test.setColor("Red");

        if (!test.isFrozen()) {
            test.freeze();
            if(test.isFrozen()) {
                System.out.println("Verified that freeze() method works!");
            } else {
                System.out.println("Couldn't verify that freeze() method works!");
            }
        }

        if (test.isFrozen()) {
            test.unfreeze();
            if (!test.isFrozen()) {
                System.out.println("Verified that unfreeze() method works!");
            } else {
                System.out.println("Couldn't verify that unfreeze() method works!");
            }
        }

        if (!test.isFrozen()) {
            int previousX = test.getPositionX();
            int previousY = test.getPositionY();
            test.move(30, 30);
            if (previousX != test.getPositionX() && previousY != test.getPositionY()) {
                System.out.println("Verified that move() method works!");
            } else {
                System.out.println("Couldn't verify that move() method works!");
            }
        }

        if (!test.isFrozen()) {
            int previousX = test.getPositionX();
            int previousY = test.getPositionY();
            test.move(200, 1);
            if (previousX == test.getPositionX()  && previousY == test.getPositionY() ) {
                System.out.println("Verified that move() method will not work if outside parameters!");
            } else {
                System.out.println("Couldn't verify that move() method will not work if outside parameters!");
            }
        }

        test.freeze();

        if (test.isFrozen()) {
            int previousX = test.getPositionX();
            int previousY = test.getPositionY();
            int newPositionX = previousX + 1;
            int newPositionY = previousY + 1;
            test.move(newPositionX, newPositionY);
            if (previousX == test.getPositionX() && previousY == test.getPositionY()) {
                System.out.println("Verified that move() method doesn't work when frozen!");
            } else {
                System.out.println("Couldn't verify that move() doesn't work when frozen!");
            }
        }


    }
}