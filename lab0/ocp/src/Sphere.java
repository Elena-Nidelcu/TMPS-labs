class Sphere extends Geo_objects {
    public double radius;

    public double get_volume()
    {
        return (4 / 3) * Math.PI * radius * radius * radius;
    }
}