package com.mygdx.core.components;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.mygdx.core.Creature;

public class PlayerInputComponent extends InputComponent {
    private boolean LeftPressed;
    private boolean RightPressed;
    private boolean UpPressed;
    private boolean DownPressed;

    private final int LEFT = Input.Keys.A;
    private final int RIGHT = Input.Keys.D;
    private final int UP = Input.Keys.W;
    private final int DOWN = Input.Keys.S;

    public void update(Creature creature){
        updateKeyboard(creature);
        updateMouse(creature);
    }

    private void updateKeyboard(Creature creature) {
        idleKeyboard(creature);

        if (Gdx.input.isKeyPressed(LEFT))
            LeftPressed = true;
        if (Gdx.input.isKeyPressed(RIGHT))
            RightPressed = true;
        if (Gdx.input.isKeyPressed(UP))
            UpPressed = true;
        if (Gdx.input.isKeyPressed(DOWN))
            DownPressed = true;

        if (LeftPressed)
            creature.setSpeedX(-10);
        if (RightPressed)
            creature.setSpeedX(10);
        if  (UpPressed)
            creature.setSpeedY(+10);
        if (DownPressed)
            creature.setSpeedY(-10);
    }

    private void updateMouse(Creature creature) {

    }

    private void idleKeyboard(Creature creature) {
        LeftPressed = false;
        RightPressed = false;
        UpPressed = false;
        DownPressed = false;

        creature.setSpeedX(0);
        creature.setSpeedY(0);
    }
}
