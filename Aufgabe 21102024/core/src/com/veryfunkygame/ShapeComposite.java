import java.util.ArrayList;
import java.util.List;

public class ShapeComposite extends ShapeComponent {
    private List<ShapeComponent> children = new ArrayList<>();

    public void add(ShapeComponent shape) {
        children.add(shape);
    }

    public void remove(ShapeComponent shape) {
        children.remove(shape);
    }

    @Override
    public void draw(com.badlogic.gdx.graphics.glutils.ShapeRenderer shapeRenderer) {
        for (ShapeComponent shape : children) {
            shape.draw(shapeRenderer);
        }
    }

    @Override
    public void move(float dx, float dy) {
        for (ShapeComponent shape : children) {
            shape.move(dx, dy);
        }
    }
}
