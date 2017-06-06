package com.marcus.rain.level;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpawnLevel extends Level {

	public SpawnLevel(String path) {
		super(path);
	}

	protected void loadLevel(String path) {
		try {
			BufferedImage image = ImageIO.read(SpawnLevel.class.getResource(path));
			int w = width = image.getWidth();
			int h = height = image.getHeight();
			tiles = new int[w * h];
			image.getRGB(0, 0, w, h, tiles, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Exception! Could not load level file!");
		}
	}

	//voidSprite = 0xFF00FF00 (Green "Grass")
	//Grass = 0xFF008C00 (Grass with bush)
	//FlowerBush = 0xFFFF00
	//Rocks = 0xFF7F7F00
	//CutTree = 0xFF893D00
	protected void generateLevel() {

	}

}
