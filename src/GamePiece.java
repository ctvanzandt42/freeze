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

    public boolean isFrozen() {
        if (frozen) {
            return true;
        } else {
            return false;
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

    public void move(int newPositionX, int newPositionY) {
        if (frozen || newPositionX < getMinX() || newPositionX > getMaxX() || newPositionY < getMinY() || newPositionY > getMaxY()) {
            System.out.println("Cannot change coordinates when frozen, and you must stay within the grid of the game!");
        }
        else {
            this.positionX = newPositionX;
            this.positionY = newPositionY;
            System.out.println("Coordinates changed!");
        }
    }

    public void freeze() {
        if (!frozen) {
            this.frozen = true;
            System.out.println("Freeze!");
        } else {
            System.out.println("Already frozen!");
        }
    }

    public void unfreeze() {
        if (frozen){
            this.frozen = false;
            System.out.println("It's melting!");
        } else {
            System.out.println("Already melted!");
        }
    }


}