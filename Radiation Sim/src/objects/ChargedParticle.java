package objects;

import math.Vector3f;

public class ChargedParticle {

    private Vector3f position;
    private Vector3f direction;
    private float velocity;
    private int origin;
    private int charge;
    private float mass;

    public ChargedParticle(Vector3f position, Vector3f direction, int origin, int charge, float velocity, float mass) {
        this.position = position;
        this.direction = direction;
        this.origin = origin;
        this.charge = charge;
        this.velocity = velocity;
    }

    public Vector3f getPosition() {
        return position;
    }

    public void setPosition(Vector3f position) {
        this.position = position;
    }

    public Vector3f getDirection() {
        return direction;
    }

    public void setDirection(Vector3f direction) {
        this.direction = direction;
    }
}



