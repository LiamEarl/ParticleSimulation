package objects;

import math.Vector3f;

public class MagField {
    private Vector3f position;
    private float conductorRadius;
    private float current;

    public MagField(Vector3f position) {
        this.position = position;
    }

    public Vector3f getPosition() {
        return position;
    }

    public void setPosition(Vector3f position) {
        this.position = position;
    }

}
