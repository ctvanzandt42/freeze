public class GamePiece {
    private int positionX;
    private int positionY;
    private int newPositionX;
    private int newPositionY;
    private boolean frozen;
    private String name;
    private String color;

    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
        this.name = name;
        this.color = color;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String move(int newPositionX, int newPositionY) {
        if (isFrozen()==true) {
            return "Cannot change coordinates, the piece is frozen!";
        }
        positionX = newPositionX;
        positionY = newPositionY;
        return "Coordinates changed";
    }

    public String freeze() {
        if (frozen == false){
            frozen = true;
            return "Freeze!";
        } else {
            return "Already frozen!";
        }
    }

    public String unfreeze() {
        if (frozen == true){
            frozen = false;
            return "It's melting!";
        } else {
            return "Already melted!";
        }
    }


}