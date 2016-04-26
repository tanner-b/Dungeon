package com.mygdx.core;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.core.components.GraphicsComponent;

public class GameObject extends Sprite {
    protected GraphicsComponent graphics;

    public void setGraphicsComponent(GraphicsComponent graphics) {
        this.graphics = graphics;
    }

    /*public void draw(SpriteBatch batch) {
        System.out.println("draw from gameobject");
        graphics.draw(this, batch);
    }*/
}
