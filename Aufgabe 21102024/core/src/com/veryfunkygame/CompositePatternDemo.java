import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class CompositePatternDemo extends ApplicationAdapter {
    private ShapeRenderer shapeRenderer;
    private ShapeComposite composite;

    @Override
    public void create() {
        shapeRenderer = new ShapeRenderer();
        composite = new ShapeComposite();
        composite.add(new CircleShape(100, 100, 50));
        composite.add(new RectangleShape(200, 200, 100, 50));
        composite.add(new CircleShape(300, 300, 30));
    }

    @Override
    public void render() {
        Gdx.gl.glClear(com.badlogic.gdx.graphics.GL20.GL_COLOR_BUFFER_BIT);
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        composite.draw(shapeRenderer);
        composite.move(1, 1);
        shapeRenderer.end();
    }

    @Override
    public void dispose() {
        shapeRenderer.dispose();
    }
}
