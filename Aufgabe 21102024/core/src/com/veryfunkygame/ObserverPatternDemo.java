import com.badlogic.gdx.ApplicationAdapter;

public class ObserverPatternDemo extends ApplicationAdapter {
    private ShapeSubject shapeSubject;

    @Override
    public void create() {
        shapeSubject = new ShapeSubject();
        CircleObserver circle = new CircleObserver();
        RectangleObserver rectangle = new RectangleObserver();
        shapeSubject.attach(circle);
        shapeSubject.attach(rectangle);
        shapeSubject.setShapeStatus("Shape has died");
    }

    @Override
    public void render() {}

    @Override
    public void dispose() {}
}
