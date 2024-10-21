public class RectangleObserver implements ShapeObserver {
    @Override
    public void update(String status) {
        System.out.println("Rectangle received status: " + status);
    }
}
