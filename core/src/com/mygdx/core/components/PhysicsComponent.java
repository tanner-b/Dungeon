package com.mygdx.core.components;

import com.mygdx.core.Creature;
import com.mygdx.core.GameObject;

public class PhysicsComponent {

    public void update(Creature object, float deltaTime){

        object.setX(object.getX() + object.getSpeedX() * deltaTime);
        object.setY(object.getY() + object.getSpeedY() * deltaTime);
    }

}
