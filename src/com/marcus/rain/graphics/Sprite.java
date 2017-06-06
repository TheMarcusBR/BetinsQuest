package com.marcus.rain.graphics;

public class Sprite {
	
	public final int SIZE;
	private int x, y;
	public int[] pixels;
	private SpriteSheet sheet;
	
	//Tile Sprites
	public static Sprite grass = new Sprite(16, 0, 0, SpriteSheet.tiles);
	public static Sprite flowerbush = new Sprite(16, 1, 0, SpriteSheet.tiles);
	public static Sprite cuttree = new Sprite(16, 2, 0, SpriteSheet.tiles);
	public static Sprite cuttree2 = new Sprite(16, 3, 0, SpriteSheet.tiles);
	public static Sprite cuttree3 = new Sprite(16, 2, 1, SpriteSheet.tiles);
	public static Sprite cuttree4 = new Sprite(16, 3, 1, SpriteSheet.tiles);
	public static Sprite rocks = new Sprite(16, 4, 0, SpriteSheet.tiles);
	public static Sprite rocks2 = new Sprite(16, 5, 0, SpriteSheet.tiles);
	public static Sprite rocks3 = new Sprite(16, 4, 1, SpriteSheet.tiles);
	public static Sprite rocks4 = new Sprite(16, 5, 1, SpriteSheet.tiles);
	public static Sprite voidSprite = new Sprite(16, 0, 1, SpriteSheet.tiles);
	public static Sprite bigtree = new Sprite(16, 0, 2, SpriteSheet.tiles);
	public static Sprite bigtree2 = new Sprite(16, 1, 2, SpriteSheet.tiles);
	public static Sprite bigtree3 = new Sprite(16, 2, 2, SpriteSheet.tiles);
	public static Sprite bigtree4 = new Sprite(16, 3, 2, SpriteSheet.tiles);
	public static Sprite bigtree5 = new Sprite(16, 4, 2, SpriteSheet.tiles);
	public static Sprite bigtree6 = new Sprite(16, 5, 2, SpriteSheet.tiles);
	public static Sprite bigtree7 = new Sprite(16, 0, 3, SpriteSheet.tiles);
	public static Sprite bigtree8 = new Sprite(16, 1, 3, SpriteSheet.tiles);
	public static Sprite bigtree9 = new Sprite(16, 2, 3, SpriteSheet.tiles);
	public static Sprite bigtree10 = new Sprite(16, 3, 3, SpriteSheet.tiles);
	public static Sprite bigtree11 = new Sprite(16, 4, 3, SpriteSheet.tiles);
	public static Sprite bigtree12 = new Sprite(16, 5, 3, SpriteSheet.tiles);
	public static Sprite bigtree13 = new Sprite(16, 0, 4, SpriteSheet.tiles);
	public static Sprite bigtree14 = new Sprite(16, 1, 4, SpriteSheet.tiles);
	public static Sprite bigtree15 = new Sprite(16, 2, 4, SpriteSheet.tiles);
	public static Sprite bigtree16 = new Sprite(16, 3, 4, SpriteSheet.tiles);
	public static Sprite bigtree17 = new Sprite(16, 4, 4, SpriteSheet.tiles);
	public static Sprite bigtree18 = new Sprite(16, 5, 4, SpriteSheet.tiles);
	public static Sprite bigtree19 = new Sprite(16, 0, 5, SpriteSheet.tiles);
	public static Sprite bigtree20 = new Sprite(16, 1, 5, SpriteSheet.tiles);
	public static Sprite bigtree21 = new Sprite(16, 2, 5, SpriteSheet.tiles);
	public static Sprite bigtree22 = new Sprite(16, 3, 5, SpriteSheet.tiles);
	public static Sprite bigtree23 = new Sprite(16, 4, 5, SpriteSheet.tiles);
	public static Sprite bigtree24 = new Sprite(16, 5, 5, SpriteSheet.tiles);
	public static Sprite bigtree25 = new Sprite(16, 0, 6, SpriteSheet.tiles);
	public static Sprite bigtree26 = new Sprite(16, 1, 6, SpriteSheet.tiles);
	public static Sprite bigtree27 = new Sprite(16, 2, 6, SpriteSheet.tiles);
	public static Sprite bigtree28 = new Sprite(16, 3, 6, SpriteSheet.tiles);
	public static Sprite bigtree29 = new Sprite(16, 4, 6, SpriteSheet.tiles);
	public static Sprite bigtree30 = new Sprite(16, 5, 6, SpriteSheet.tiles);
	public static Sprite rockpath = new Sprite(16, 7, 6, SpriteSheet.tiles);
	public static Sprite rockpath2 = new Sprite(16, 8, 6, SpriteSheet.tiles);
	public static Sprite rockpath3 = new Sprite(16, 9, 6, SpriteSheet.tiles);
	public static Sprite rockpath4 = new Sprite(16, 7, 7, SpriteSheet.tiles);
	public static Sprite rockpath5 = new Sprite(16, 8, 7, SpriteSheet.tiles);
	public static Sprite rockpath6 = new Sprite(16, 9, 7, SpriteSheet.tiles);
	public static Sprite pound = new Sprite(16, 10, 6, SpriteSheet.tiles);
	public static Sprite pound2 = new Sprite(16, 11, 6, SpriteSheet.tiles);
	public static Sprite pound3 = new Sprite(16, 12, 6, SpriteSheet.tiles);
	public static Sprite pound4 = new Sprite(16, 13, 6, SpriteSheet.tiles);
	public static Sprite pound5 = new Sprite(16, 14, 6, SpriteSheet.tiles);
	public static Sprite pound6 = new Sprite(16, 10, 7, SpriteSheet.tiles);
	public static Sprite pound7 = new Sprite(16, 11, 7, SpriteSheet.tiles);
	public static Sprite pound8 = new Sprite(16, 12, 7, SpriteSheet.tiles);
	public static Sprite pound9 = new Sprite(16, 13, 7, SpriteSheet.tiles);
	public static Sprite pound10 = new Sprite(16, 14, 7, SpriteSheet.tiles);
	public static Sprite pound11 = new Sprite(16, 10, 8, SpriteSheet.tiles);
	public static Sprite pound12 = new Sprite(16, 11, 8, SpriteSheet.tiles);
	public static Sprite pound13 = new Sprite(16, 12, 8, SpriteSheet.tiles);
	public static Sprite pound14 = new Sprite(16, 13, 8, SpriteSheet.tiles);
	public static Sprite pound15 = new Sprite(16, 14, 8, SpriteSheet.tiles);
	public static Sprite pound16 = new Sprite(16, 10, 9, SpriteSheet.tiles);
	public static Sprite pound17 = new Sprite(16, 11, 9, SpriteSheet.tiles);
	public static Sprite pound18 = new Sprite(16, 12, 9, SpriteSheet.tiles);
	public static Sprite pound19 = new Sprite(16, 13, 9, SpriteSheet.tiles);
	public static Sprite pound20 = new Sprite(16, 14, 9, SpriteSheet.tiles);
	public static Sprite pound21 = new Sprite(16, 10, 10, SpriteSheet.tiles);
	public static Sprite pound22 = new Sprite(16, 11, 10, SpriteSheet.tiles);
	public static Sprite pound23 = new Sprite(16, 12, 10, SpriteSheet.tiles);
	public static Sprite pound24 = new Sprite(16, 13, 10, SpriteSheet.tiles);
	public static Sprite pound25 = new Sprite(16, 14, 10, SpriteSheet.tiles);
	public static Sprite pound26 = new Sprite(16, 10, 11, SpriteSheet.tiles);
	public static Sprite pound27 = new Sprite(16, 11, 11, SpriteSheet.tiles);
	public static Sprite pound28 = new Sprite(16, 12, 11, SpriteSheet.tiles);
	public static Sprite pound29 = new Sprite(16, 13, 11, SpriteSheet.tiles);
	public static Sprite pound30 = new Sprite(16, 14, 11, SpriteSheet.tiles);
	public static Sprite pound31 = new Sprite(16, 10, 12, SpriteSheet.tiles);
	public static Sprite pound32 = new Sprite(16, 11, 12, SpriteSheet.tiles);
	public static Sprite pound33 = new Sprite(16, 12, 12, SpriteSheet.tiles);
	public static Sprite pound34 = new Sprite(16, 13, 12, SpriteSheet.tiles);
	public static Sprite pound35 = new Sprite(16, 14, 12, SpriteSheet.tiles);
	public static Sprite pound36 = new Sprite(16, 10, 13, SpriteSheet.tiles);
	public static Sprite pound37 = new Sprite(16, 11, 13, SpriteSheet.tiles);
	public static Sprite pound38 = new Sprite(16, 12, 13, SpriteSheet.tiles);
	public static Sprite pound39 = new Sprite(16, 13, 13, SpriteSheet.tiles);
	public static Sprite pound40 = new Sprite(16, 14, 13, SpriteSheet.tiles);
	
	//Building Sprites
	public static Sprite betinsap = new Sprite(16, 6, 0, SpriteSheet.tiles);
	public static Sprite betinsap2 = new Sprite(16, 7, 0, SpriteSheet.tiles);
	public static Sprite betinsap3 = new Sprite(16, 8, 0, SpriteSheet.tiles);
	public static Sprite betinsap4 = new Sprite(16, 9, 0, SpriteSheet.tiles);
	public static Sprite betinsap5 = new Sprite(16, 10, 0, SpriteSheet.tiles);
	public static Sprite betinsap6 = new Sprite(16, 6, 1, SpriteSheet.tiles);
	public static Sprite betinsap7 = new Sprite(16, 7, 1, SpriteSheet.tiles);
	public static Sprite betinsap8 = new Sprite(16, 8, 1, SpriteSheet.tiles);
	public static Sprite betinsap9 = new Sprite(16, 9, 1, SpriteSheet.tiles);
	public static Sprite betinsap10 = new Sprite(16, 10, 1, SpriteSheet.tiles);
	public static Sprite betinsap11 = new Sprite(16, 6, 2, SpriteSheet.tiles);
	public static Sprite betinsap12 = new Sprite(16, 7, 2, SpriteSheet.tiles);
	public static Sprite betinsap13 = new Sprite(16, 8, 2, SpriteSheet.tiles);
	public static Sprite betinsap14 = new Sprite(16, 9, 2, SpriteSheet.tiles);
	public static Sprite betinsap15 = new Sprite(16, 10, 2, SpriteSheet.tiles);
	public static Sprite betinsap16 = new Sprite(16, 6, 3, SpriteSheet.tiles);
	public static Sprite betinsap17 = new Sprite(16, 7, 3, SpriteSheet.tiles);
	public static Sprite betinsap18 = new Sprite(16, 8, 3, SpriteSheet.tiles);
	public static Sprite betinsap19 = new Sprite(16, 9, 3, SpriteSheet.tiles);
	public static Sprite betinsap20 = new Sprite(16, 10, 3, SpriteSheet.tiles);
	public static Sprite betinsap21 = new Sprite(16, 6, 4, SpriteSheet.tiles);
	public static Sprite betinsap22 = new Sprite(16, 7, 4, SpriteSheet.tiles);
	public static Sprite betinsap23 = new Sprite(16, 8, 4, SpriteSheet.tiles);
	public static Sprite betinsap24 = new Sprite(16, 9, 4, SpriteSheet.tiles);
	public static Sprite betinsap25 = new Sprite(16, 10, 4, SpriteSheet.tiles);
	public static Sprite betinsap26 = new Sprite(16, 6, 5, SpriteSheet.tiles);
	public static Sprite betinsap27 = new Sprite(16, 7, 5, SpriteSheet.tiles);
	public static Sprite betinsap28 = new Sprite(16, 8, 5, SpriteSheet.tiles);
	public static Sprite betinsap29 = new Sprite(16, 9, 5, SpriteSheet.tiles);
	public static Sprite betinsap30 = new Sprite(16, 10, 5, SpriteSheet.tiles);

	
	
	//Player Sprites
	public static Sprite player_forward = new Sprite(32, 0, 5, SpriteSheet.mobs);
	public static Sprite player_back = new Sprite(32, 2, 5, SpriteSheet.mobs);
	public static Sprite player_side = new Sprite(32, 1, 4, SpriteSheet.mobs);
	
	public static Sprite player_forward_1 = new Sprite(32, 0, 6, SpriteSheet.mobs);
	public static Sprite player_forward_2 = new Sprite(32, 0, 7, SpriteSheet.mobs);
	public static Sprite player_forward_3 = new Sprite(32, 0, 4, SpriteSheet.mobs);
	public static Sprite player_forward_4 = new Sprite(32, 0, 3, SpriteSheet.mobs);
	
	public static Sprite player_side_1 = new Sprite(32, 1, 6, SpriteSheet.mobs);
	public static Sprite player_side_2 = new Sprite(32, 1, 7, SpriteSheet.mobs);
	public static Sprite player_side_3 = new Sprite(32, 1, 4, SpriteSheet.mobs);
	public static Sprite player_side_4 = new Sprite(32, 1, 3, SpriteSheet.mobs);
	
	public static Sprite player_back_1 = new Sprite(32, 2, 6, SpriteSheet.mobs);
	public static Sprite player_back_2 = new Sprite(32, 2, 7, SpriteSheet.mobs);
	public static Sprite player_back_3 = new Sprite(32, 2, 4, SpriteSheet.mobs);
	public static Sprite player_back_4 = new Sprite(32, 2, 3, SpriteSheet.mobs);
	
	public Sprite(int size, int x, int y, SpriteSheet sheet) {
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		this.x = x * size;
		this.y = y * size;
		this.sheet = sheet;
		load();
	}
	
	public Sprite(int size, int colour) {
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		setColour(colour);
	}
	
	private void setColour(int colour) {
		for (int i = 0; i < SIZE * SIZE; i++) {
			pixels[i] = colour;
		}
		
	}

	private void load() {
		for (int y = 0; y < SIZE; y++) {
			for (int x= 0; x < SIZE; x++) {
				pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.SIZE];
			}
		}
	}
	
}
