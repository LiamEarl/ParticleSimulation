package main;

import math.Vector3f;
import objects.ChargedParticle;
import objects.MagField;

import java.util.ArrayList;

public class Simulation {
    private Vector3f center;

    private static final int WORLD_BORDER_RADIUS = 1000;
    private static final int NUM_PARTICLES = 1;
    private static final float GCR_PERCENTAGE = 0.5f;
    private static final float SOLAR_PERCENTAGE = 0.5f;

    private ArrayList<MagField> magneticFields;
    private ChargedParticle[] particles;

    public Simulation(Vector3f center) {
        this.center = center;
        this.magneticFields = new ArrayList<MagField>();
        particles = new ChargedParticle[NUM_PARTICLES];
    }

    public void generateSimulation() {
        //making a magnetic field
        magneticFields.add(new MagField(new Vector3f()));

        //generating charged particles
        for(int i = 0; i < (int)(NUM_PARTICLES * GCR_PERCENTAGE); i++) {

            Vector3f dirToPlace = new Vector3f((float) ((Math.random() - 0.5f) * 100f), (float) (Math.random() - 0.5f) * 100f, (float) (Math.random() - 0.5f) * 100f);

            Vector3f position = dirToPlace.normalise().multiply(WORLD_BORDER_RADIUS);

            float dirX = (float) (center.getX() - position.getX() + (Math.random() - 0.5f) * 800f);
            float dirY = (float) (center.getY() - position.getY() + (Math.random() - 0.5f) * 800f);
            float dirZ = (float) (center.getZ() - position.getZ() + (Math.random() - 0.5f) * 800f);

            Vector3f direction = new Vector3f(dirX, dirY, dirZ).normalise();


            //particles[i] = new ChargedParticle(position, direction, 1, );

            //System.out.println("Position:    X:  " + position.getX() + ",  Y: " + position.getY() + ", Z: " + position.getZ());
            //System.out.println("Direction:    X:  " + direction.normalise().getX() + ",  Y: " + direction.normalise().getY() + ", Z: " + direction.normalise().getZ());
        }

        for(int i = 0; i < (int)(NUM_PARTICLES * SOLAR_PERCENTAGE); i++) {
            Vector3f dirToPlace = new Vector3f((float) ((Math.random() - 0.5f) * 100f), (float) (Math.random() - 0.5f) * 100f, (float) (Math.random() - 0.5f) * 100f);

            Vector3f position = dirToPlace.normalise().multiply(WORLD_BORDER_RADIUS);

            float dirX = (float) (center.getX() - position.getX() + (Math.random() - 0.5f) * 800f);
            float dirY = (float) (center.getY() - position.getY() + (Math.random() - 0.5f) * 800f);
            float dirZ = (float) (center.getZ() - position.getZ() + (Math.random() - 0.5f) * 800f);

            Vector3f direction = new Vector3f(dirX, dirY, dirZ).normalise();

            //particles[i] = new ChargedParticle(position, direction, 1, );

            //System.out.println("Position:    X:  " + position.getX() + ",  Y: " + position.getY() + ", Z: " + position.getZ());
            //System.out.println("Direction:    X:  " + direction.normalise().getX() + ",  Y: " + direction.normalise().getY() + ", Z: " + direction.normalise().getZ());
        }
    }

    public void simulateParticles() {

        for(int i = 0; i < particles.length; i++) {

        }

    }

}
