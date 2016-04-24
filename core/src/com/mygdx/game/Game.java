package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Game extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Sprite player;

	
	@Override
	public void create () {
		batch = new SpriteBatch();

		img = new Texture("goblin2.png");
		player = new Sprite(img);
		player.scale(5);
		player.setOriginCenter();
		player.setPosition(Gdx.graphics.getWidth() / 2 - player.getWidth() / 2,
				  		   Gdx.graphics.getHeight() / 2 - player.getHeight() / 2);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0.5f, 0.5f, 0.5f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		player.draw(batch);
		batch.end();
	}
}
