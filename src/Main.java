public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(120,40);
        Point p2 = new Point(10,76);

        Segment s = new Segment(p1,p2);
        System.out.println(s.distance());
    }
}