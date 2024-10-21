public class CircleObserver implements ShapeObserver {
    @Override
    public void update(String status) {
        System.out.println("Circle received status: " + status);
    }
}
