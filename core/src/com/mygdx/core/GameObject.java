package com.mygdx.core;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.core.components.GraphicsComponent;

import java.util.List;

public class GameObject extends Sprite {
    protected GraphicsComponent graphics;
    public List<GameObject> children;

    public void setGraphicsComponent(GraphicsComponent graphics) {
        this.graphics = graphics;
    }

    /*public void draw(SpriteBatch batch) {
        System.out.println("draw from gameobject");
        graphics.draw(this, batch);
    }*/
}
