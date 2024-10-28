package prototype;

import models.ModernChair;

public class PrototypeChair extends ModernChair implements Cloneable {
    public PrototypeChair() { super(); }

    @Override
    public PrototypeChair clone() {
        return new PrototypeChair();
    }
}
