package com.mygdx.core;


import com.mygdx.core.components.InputComponent;
import com.mygdx.core.components.PhysicsComponent;

public class Creature extends GameObject{
    private InputComponent input;
    private PhysicsComponent physics;

    public void update(float deltaTime) {
        input.update(this);
        physics.update(this, deltaTime);
    }
}
