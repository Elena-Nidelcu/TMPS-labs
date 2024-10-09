class Application {
    public double
    get_total_volume(Geo_objects[] geo_objects)
    {
        double vol_sum = 0;

        for (Geo_objects geo_obj : geo_objects) {
            vol_sum += geo_obj.get_volume();
        }

        return vol_sum;
    }
}