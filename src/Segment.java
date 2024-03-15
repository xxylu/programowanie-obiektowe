public class Segment{
    private Point p1,p2;
    public Point getP1() {
        return p1;
    }
    public Point getP2() {
        return p2;
    }
    public void setP1(Point p1) {
        this.p1 = p1;
    }
    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public double distance(){
        double distance = Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
        return distance;
    }
}
