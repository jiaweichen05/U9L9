public class ThreeDPoint extends Point{
    private int z;

    public ThreeDPoint(String label, int x, int y, int z) {
        super(label, x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", z = " + z;
    }

    @Override
    public boolean equals(Object obj)
    {
        ThreeDPoint objPoint = (ThreeDPoint) obj;
        return super.equals(objPoint) && (this.getZ() == objPoint.getZ());
    }
}
