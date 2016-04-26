package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.core.Creature;
import com.mygdx.core.GameObject;
import com.mygdx.core.components.GraphicsComponent;
import com.mygdx.core.components.PlayerInputComponent;

public class Game extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	GameObject object;
    Creature creature;
	
	@Override
	public void create () {
		batch = new SpriteBatch();

		img = new Texture("goblin2.png");
        creature = new Creature();
        creature.setGraphicsComponent(new GraphicsComponent());
        creature.setInputComponent(new PlayerInputComponent());
        creature.set(new Sprite(img));
        creature.scale(5);
        creature.setOriginCenter();
        creature.setPosition(Gdx.graphics.getWidth() / 2 - creature.getWidth() / 2,
				  		   Gdx.graphics.getHeight() / 2 - creature.getHeight() / 2);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0.5f, 0.5f, 0.5f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        creature.update(Gdx.graphics.getDeltaTime());
        creature.setX(creature.getX() + creature.getSpeedX());
        creature.setY(creature.getY() + creature.getSpeedY());
		batch.begin();
        creature.draw(batch);
		batch.end();
	}
}
