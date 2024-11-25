package Observer;

public class Admin implements IObserver {
    private String name;

    public Admin(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Admin " + name + " received notification: " + message);
    }
}
