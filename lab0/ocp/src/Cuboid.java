class Cuboid extends Geo_objects {
    public double length;
    public double breadth;
    public double height;

    public double get_volume()
    {
        return length * breadth * height;
    }
}