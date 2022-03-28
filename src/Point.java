public class Point {
    private int x, y;
    private String label;

    public Point(String label, int x, int y) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString()
    {
        return ("Point " + label + " is at x = " + x + ", y = " + y);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof Point))
        {
            return false;
        }

        Point objPoint = (Point) obj;
        return (this.getX() == objPoint.getX() && this.getY() == objPoint.getY());
    }
}
