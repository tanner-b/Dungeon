package com.mygdx.core.components;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.core.GameObject;

public class GraphicsComponent {

    public void draw(GameObject object, SpriteBatch batch) {
        object.draw(batch);
    }

}
