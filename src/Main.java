public class Main {
    public static void main(String[] args) {

        GamePiece test = new GamePiece();

        test.setName("Super Awesome Game Piece");
        test.setColor("Red");
        System.out.println("Position X is: " + test.getPositionX());
        System.out.println("Position Y is: " + test.getPositionY() + "\n");
        System.out.println(test.isFrozen());

        if(! test.isFrozen()){
            test.freeze();
            if (test.isFrozen()){
                System.out.println("Verified\n");
            }else {
                System.out.println("Couldn't verify\n");
            }
        }

        //
        test.move(10, 200);

        if(test.getPositionX() >= 0 && test.getPositionX() <= 100 && test.getPositionY() >= 0 && test.getPositionY() <= 500) {
            System.out.println("Verified\n");
        } else {
            System.out.println("Couldn't verify\n");
        }


        if (test.isFrozen()) {
            test.unfreeze();
            if (!test.isFrozen()) {
                System.out.println("Verified\n");
            } else {
                System.out.println("Could not verify\n");
            }
        }

        System.out.println(test.isFrozen());
        test.move(410, 401);

        if(test.getPositionX() >= 0 && test.getPositionX() <= 100 && test.getPositionY() >= 0 && test.getPositionY() <= 500) {
            System.out.println("Verified\n");

        } else {
            System.out.println("Couldn't verify\n");
        }

        test.move(10, 500);

        if(test.getPositionX() == 10 && test.getPositionY() == 500) {
            System.out.println("Verified\n");
        } else {
            System.out.println("Couldn't verify\n");

        }
    }
}