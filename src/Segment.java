import java.util.Locale;

public class Segment{
    private Point p1;
    private Point p2;
    /*
    public void setP1(Point p1) {
        this.p1 = p1;
    }
    public void setP2(Point p2) {
        this.p2 = p2;
    }
    */

    Segment(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public double distance() {
        double distance = Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
        return distance;
    }
    public static Segment[] perpendicularSegments(Segment segment, Point point) {
        double dx = segment.p2.x - segment.p1.x;
        double dy = segment.p2.y - segment.p1.y;
        double newdx1 = -dy;
        double newdy1 = dx;
        double newdx2 = dy;
        double newdy2 = -dx;

       double endx1 = point.x + newdx1;
       double endy1 = point.y + newdy1;
       double endx2 = point.x + newdx2;
       double endy2 = point.y + newdy2;

       Point first_end = new Point(endx1,endy1);
       Point sc_end = new Point(endx2,endy2);


        return null;
    }
    public String toSvg(){
        return String.format(Locale.ENGLISH,"<line x1='%f' y1='%f' x2='%f' y2='%f' stroke='black'/>", p1.x, p1.y, p2.x, p2.y);
    }
    public Point getP1() {
        return p1;
    }
    public Point getP2() {
        return p2;
    }

}
