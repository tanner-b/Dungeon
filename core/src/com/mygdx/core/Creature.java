package com.mygdx.core;


import com.badlogic.gdx.math.Vector2;
import com.mygdx.core.components.InputComponent;
import com.mygdx.core.components.PhysicsComponent;

public class Creature extends GameObject {
    private Vector2 velocity;
    protected InputComponent input;
    protected PhysicsComponent physics;

    public Creature() {
        velocity = new Vector2(0, 0);
    }

    public void update(float deltaTime) {
        input.update(this);

        physics.update(this, deltaTime);
    }

    public void setInputComponent(InputComponent input) {
        this.input = input;
    }

    public void setPhysicsComponent(PhysicsComponent physics) {
        this.physics = physics;
    }

    public void setSpeed(Vector2 speed) {
        this.velocity = speed;
    }

    public void setSpeed(float x, float y) {
        velocity = new Vector2(x, y);
    }

    public void setSpeedX(float x) {
        velocity.x = x;
    }

    public void setSpeedY(float y) {
        velocity.y = y;
    }

    public Vector2 getSpeed() {
        return velocity;
    }

    public float getSpeedX() {
        return velocity.x;
    }

    public float getSpeedY() {
        return velocity.y;
    }
}
