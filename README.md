<h1>Game Piece: Freeze</h1>

<h3>Model a game piece</h3> <ul>
<li>In the src directory create a GamePiece Java class</li>
<li>Add the following required instance variables:
<ul>
<li>int positionX</l1>
<li>int positionY</l1>
<li>boolean frozen</l1>
</ul>
<li>Add a couple String instance variables (e.g. name, color)</li>
<li>Add an empty constructor (no parameters). (IntelliJ can generate these for you)</li>
<li>In the constructor set the position variables to zero and frozen to false.</l1>
<li>Add get methods only for the "position" and "frozen" variables (IntelliJ can generate these for you)</l1>
<li>Add get and set methods for the other variables (IntelliJ can generate these for you)</l1></ul>

<h3>Add some behavior to the game piece:</h3><ul>

<li>Add a move() method (returns void) that takes a new x and y position. Set the instance variables to the parameters.</l1>
<li>Add a freeze() method (returns void) and set frozen to true</l1>
<li>Add a unfreeze() method (returns void) and set frozen to false</l1>
<li>Change move() so that that when frozen the piece does not move</l1></ul>


<h3>Test the freeze, unfreeze and move methods in the public static void main(String[] args) method of Main.java.</h3><ul>

<li>Create a GamePiece object.</li>
<li>Only call the methods on the object, do not access the instance variables directly.</li>
<li>Verify that if the game piece is not frozen then the call to freeze sets the frozen varable to true.</li>
<li>Verify that if the game piece is frozen then the call to unfreeze sets the frozen varable to false.</l1>
<li>Verify that if the game piece is not frozen then the call to move results in the new position.</l1>
<li>Verify that if the game piece is frozen then the call to move does not change the position.</l1></ul>
