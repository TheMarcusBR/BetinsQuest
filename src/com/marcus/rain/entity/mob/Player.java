package com.marcus.rain.entity.mob;

import com.marcus.rain.graphics.Screen;
import com.marcus.rain.graphics.Sprite;
import com.marcus.rain.input.Keyboard;

public class Player extends Mob {
	
	public Keyboard input;
	private Sprite sprite;
	private int anim = 0;
	private boolean walking = false; 
	
	public Player(Keyboard input) {
		this.input = input;	
		sprite = Sprite.player_forward;
	}
	
	public Player(int x, int y, Keyboard input) {
		this.x = x;
		this.y = y;
		this.input = input;
		sprite = Sprite.player_forward;
	}
	
	public void update() {
		int xa = 0, ya = 0;
		if (anim < 7500) anim++;
		else anim = 0;
		if (input.up) ya--;
		if (input.down) ya++;
		if (input.left) xa--;
		if (input.right) xa++;
		
		if (xa != 0 || ya != 0) {
			move(xa, ya);
			walking = true;
		} else {
			walking = false;
		}
		
	}
	
	public void render(Screen screen) {
		int flip = 0;
		if (dir == 0) {
			sprite = Sprite.player_forward;
			if (walking){
				if (anim % 40 > 30){
					sprite = Sprite.player_forward_1;
				} else {
					if (anim % 40 > 20){ 
						sprite = Sprite.player_forward_2;
					} else {
						if (anim % 40 > 10 ){
							sprite = Sprite.player_forward_3;
						} else {
								sprite = Sprite.player_forward;				
							}
					}
				}
			}
		}
		if (dir == 1) {
			sprite = Sprite.player_side;
			if (walking){
				if (anim % 40 > 30){
					sprite = Sprite.player_side_1;
				} else {
					if (anim % 40 > 20){ 
						sprite = Sprite.player_side_2;
					} else {
						if (anim % 40 > 10 ){
							sprite = Sprite.player_side_4;
						} else {
								sprite = Sprite.player_side;				
							}
					}
				}
			}
		}
		if (dir == 2) {
			sprite = Sprite.player_back;
			if (walking){
				if (anim % 40 > 30){
					sprite = Sprite.player_back_2;
				} else {
					if (anim % 40 > 20){ 
						sprite = Sprite.player_back_4;
					} else {
						if (anim % 40 > 10 ){
							sprite = Sprite.player_back_3;
						} else {
								sprite = Sprite.player_back;				
							}
					}
				}
			}
		}
		if (dir == 3) {
			if (walking){
				if (anim % 40 > 30){
					sprite = Sprite.player_side_1;
				} else {
					if (anim % 40 > 20){ 
						sprite = Sprite.player_side_2;
					} else {
						if (anim % 40 > 10 ){
							sprite = Sprite.player_side_4;
						} else {
								sprite = Sprite.player_side;				
							}
					}
				}
			}
			flip = 1;
		}
		screen.renderPlayer(x - 16, y - 16, sprite, flip);
	}
	
}
