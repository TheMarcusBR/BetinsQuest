package com.marcus.rain.level.tile;

import com.marcus.rain.graphics.Screen;
import com.marcus.rain.graphics.Sprite;

public class FlowerbushTile extends Tile {

	public FlowerbushTile(Sprite sprite) {
		super(sprite);		
	}
	public void render (int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}
	public boolean solid() {
		return false;
	}
}
