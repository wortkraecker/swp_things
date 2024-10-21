public class CircleShape extends ShapeComponent {
    private float x, y, radius;

    public CircleShape(float x, float y, float radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw(com.badlogic.gdx.graphics.glutils.ShapeRenderer shapeRenderer) {
        shapeRenderer.setColor(com.badlogic.gdx.graphics.Color.RED);
        shapeRenderer.circle(x, y, radius);
    }

    @Override
    public void move(float dx, float dy) {
        x += dx;
        y += dy;
    }
}
