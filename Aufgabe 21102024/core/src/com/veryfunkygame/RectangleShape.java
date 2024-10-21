public class RectangleShape extends ShapeComponent {
    private float x, y, width, height;

    public RectangleShape(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(com.badlogic.gdx.graphics.glutils.ShapeRenderer shapeRenderer) {
        shapeRenderer.setColor(com.badlogic.gdx.graphics.Color.BLUE);
        shapeRenderer.rect(x, y, width, height);
    }

    @Override
    public void move(float dx, float dy) {
        x += dx;
        y += dy;
    }
}
