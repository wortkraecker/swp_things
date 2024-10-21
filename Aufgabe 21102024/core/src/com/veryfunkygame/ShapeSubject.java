import java.util.ArrayList;
import java.util.List;

public class ShapeSubject {
    private List<ShapeObserver> observers = new ArrayList<>();
    private String shapeStatus;

    public void attach(ShapeObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (ShapeObserver observer : observers) {
            observer.update(shapeStatus);
        }
    }

    public void setShapeStatus(String status) {
        this.shapeStatus = status;
        notifyObservers();
    }
}
