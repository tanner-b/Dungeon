package com.mygdx.core;


import com.badlogic.gdx.math.Vector2;
import com.mygdx.core.components.InputComponent;
import com.mygdx.core.components.PhysicsComponent;

public class Creature extends GameObject {
    private Vector2 speed;
    protected InputComponent input;
    protected PhysicsComponent physics;

    public Creature() {
        speed = new Vector2(0, 0);
    }

    public void update(float deltaTime) {
        System.out.println("update from Creature");
        input.update(this);
        //physics.update(this, deltaTime);
    }

    public void setInputComponent(InputComponent input) {
        this.input = input;
    }

    public void setSpeed(Vector2 speed) {
        this.speed = speed;
    }

    public void setSpeed(float x, float y) {
        speed = new Vector2(x, y);
    }

    public void setSpeedX(float x) {
        speed.x = x;
    }

    public void setSpeedY(float y) {
        speed.y = y;
    }

    public Vector2 getSpeed() {
        return speed;
    }

    public float getSpeedX() {
        return speed.x;
    }

    public float getSpeedY() {
        return speed.y;
    }
}
