import java.util.Random;

public class GamePiece {
    private int positionX;
    private int positionY;
    private int newPositionX;
    private int newPositionY;
    private boolean frozen;
    private String name;
    private String color;
    private int minX;
    private int maxX;
    private int minY;
    private int maxY;

    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
        this.name = name;
        this.color = color;
        this.minX = 0;
        this.maxX = 100;
        this.minY = 0;
        this.maxY = 500;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getMinX() {
        return minX;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMinY() {
        return minY;
    }

    public int getMaxY() {
        return maxY;
    }

    public String isFrozen() {
        if (frozen) {
            return "Yes";
        } else {
            return "No";
        }
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
        if (frozen || newPositionX < getMinX() || newPositionX > getMaxX() || newPositionY < getMinY() || newPositionY > getMaxY()) {
            return "Cannot change coordinates when frozen, and you must stay within the grid of the game!";
        }
        else {
            positionX = newPositionX;
            positionY = newPositionY;
            return "Coordinates changed!";
        }
    }

    public String freeze() {
        if (frozen == false) {
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