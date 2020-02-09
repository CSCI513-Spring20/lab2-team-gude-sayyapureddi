import java.awt.Point;
import java.util.Random;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class OceanMap extends OceanExplorer {
	static Random rand = new Random();
	static int a = rand.nextInt(10); // Generating a random number from 0 -10
	static int b = rand.nextInt(10); // Generating a random number from 0 -10

	public void getMap() {
		for (int x = 0; x < dimension; x++) {
			for (int y = 0; y < dimension; y++) {
				Rectangle rect = new Rectangle(x * scale, y * scale, scale, scale);
				rect.setStroke(Color.BLACK); // We want the black outline
				rect.setFill(Color.PALETURQUOISE); // I like this color better than BLUE
				root.getChildren().add(rect); // Add to the node tree in the pane

			}
		}
	}

	// gets position of ship by an random generator
	public static Point getShipLocation() {
		return new Point(a, b);
	}
}
