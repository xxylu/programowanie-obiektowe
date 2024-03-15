public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(120,40);
        Point p2 = new Point(10,76);

        Segment s = new Segment();
        s.setP1(p1);
        s.setP2(p2);
        System.out.println(s.distance());
    }
}