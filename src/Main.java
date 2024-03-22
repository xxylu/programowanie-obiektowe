public class Main {
        public static void main(String[] args) {
        Point p1 = new Point(120,40);
        Point p2 = new Point(165256650,76);
        Point p3 = new Point(100,706);
        Point p4 = new Point(150000000,106);

        Segment s = new Segment(p1,p2);
        System.out.println(s.distance());
        Segment seg = new Segment(p1,p2);
        System.out.println(seg.toSvg());

}