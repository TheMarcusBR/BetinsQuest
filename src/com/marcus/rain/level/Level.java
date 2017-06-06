package com.marcus.rain.level;

import com.marcus.rain.graphics.Screen;
import com.marcus.rain.level.tile.Tile;

public class Level {
	
	protected int width, height;
	protected int[] tilesInt;
	protected int[] tiles;
	protected int tile_size;
	
	public static Level spawn = new SpawnLevel("/levels/level.png");
	
	public Level(int width, int height) {
		this.width = width;
		this.height = height;
		tilesInt = new int[width * height];
		generateLevel();
	}

	public Level(String path) {
		loadLevel(path);
		generateLevel();
	}
	
	protected void generateLevel() {
		for (int y = 0; y < 64; y++) {
			for (int x = 0; x < 64; x++) {
				getTile(x, y);
			}
		}
		tile_size = 16;
	
	}
	

	
	
	protected void loadLevel(String path){
		
	}
	
	public void update() {
		
	}
	
	private void time() {
		
	}
	
	public void render(int xScroll, int yScroll, Screen screen) {
		screen.setOffset(xScroll, yScroll);
		int x0 = xScroll >> 4;
		int x1 = (xScroll + screen.width + 16) >> 4;
		int y0 = yScroll >> 4;
		int y1 = (yScroll + screen.height  + 16) >> 4;		
		for(int y = y0; y < y1; y++){
			for (int x = x0; x < x1; x++) {
				getTile(x, y).render(x, y, screen);
				
			}
		}
	}
	
	//voidTile = 0xFF00FF00 (Green "Grass")
	//Grass = 0xFF008C00 (Grass with bush)
	//FlowerBush = 0xFFFF00
	//Rocks = 0xFF7F7F00
	//CutTree = 0xFF893D00
	//Betin's AP = 0xFF00(2E)FF 26,27.. 
	//Big Trees = FFFF900(0) 1, 2..
	//Rock Path = FF7C7C7(A) B, C..
	public Tile getTile(int x, int y) {
		if (x < 0 || y < 0 || x >= width || y >= height) return Tile.voidTile;
		if (tiles[x + y * width] == 0xFF00FF00) return Tile.voidTile;
		if (tiles[x + y * width] == 0xFF008C00) return Tile.grass;
		if (tiles[x + y * width] == 0xFFFFFF00) return Tile.flowerbush;
		if (tiles[x + y * width] == 0xFF893D00) return Tile.cuttree;
		if (tiles[x + y * width] == 0xFF873302) return Tile.cuttree2;
		if (tiles[x + y * width] == 0xFF842300) return Tile.cuttree3;
		if (tiles[x + y * width] == 0xFF821A00) return Tile.cuttree4;
		if (tiles[x + y * width] == 0xFF7F7F00) return Tile.rocks;
		if (tiles[x + y * width] == 0xFF7F7F01) return Tile.rocks2;
		if (tiles[x + y * width] == 0xFF7F7F02) return Tile.rocks3;
		if (tiles[x + y * width] == 0xFF7F7F03) return Tile.rocks4;
		if (tiles[x + y * width] == 0xFF002EFF) return Tile.betinsap;
		if (tiles[x + y * width] == 0xFF0026FF) return Tile.betinsap2;
		if (tiles[x + y * width] == 0xFF0027FF) return Tile.betinsap3;
		if (tiles[x + y * width] == 0xFF0028FF) return Tile.betinsap4;
		if (tiles[x + y * width] == 0xFF0029FF) return Tile.betinsap5;
		if (tiles[x + y * width] == 0xFF0030FF) return Tile.betinsap6;
		if (tiles[x + y * width] == 0xFF0031FF) return Tile.betinsap7;
		if (tiles[x + y * width] == 0xFF0032FF) return Tile.betinsap8;
		if (tiles[x + y * width] == 0xFF0033FF) return Tile.betinsap9;
		if (tiles[x + y * width] == 0xFF0034FF) return Tile.betinsap10;
		if (tiles[x + y * width] == 0xFF0035FF) return Tile.betinsap11;
		if (tiles[x + y * width] == 0xFF0036FF) return Tile.betinsap12;
		if (tiles[x + y * width] == 0xFF0037FF) return Tile.betinsap13;
		if (tiles[x + y * width] == 0xFF0038FF) return Tile.betinsap14;
		if (tiles[x + y * width] == 0xFF0039FF) return Tile.betinsap15;
		if (tiles[x + y * width] == 0xFF0040FF) return Tile.betinsap16;
		if (tiles[x + y * width] == 0xFF0041FF) return Tile.betinsap17;
		if (tiles[x + y * width] == 0xFF0042FF) return Tile.betinsap18;
		if (tiles[x + y * width] == 0xFF0043FF) return Tile.betinsap19;
		if (tiles[x + y * width] == 0xFF0044FF) return Tile.betinsap20;
		if (tiles[x + y * width] == 0xFF0045FF) return Tile.betinsap21;
		if (tiles[x + y * width] == 0xFF0046FF) return Tile.betinsap22;
		if (tiles[x + y * width] == 0xFF0047FF) return Tile.betinsap23;
		if (tiles[x + y * width] == 0xFF0048FF) return Tile.betinsap24;
		if (tiles[x + y * width] == 0xFF0049FF) return Tile.betinsap25;
		if (tiles[x + y * width] == 0xFF0050FF) return Tile.betinsap26;
		if (tiles[x + y * width] == 0xFF0051FF) return Tile.betinsap27;
		if (tiles[x + y * width] == 0xFF0052FF) return Tile.betinsap28;
		if (tiles[x + y * width] == 0xFF0053FF) return Tile.betinsap29;
		if (tiles[x + y * width] == 0xFF0054FF) return Tile.betinsap30;
		if (tiles[x + y * width] == 0xFFFF9000) return Tile.bigtree;
		if (tiles[x + y * width] == 0xFFFF9001) return Tile.bigtree2;
		if (tiles[x + y * width] == 0xFFFF9002) return Tile.bigtree3;
		if (tiles[x + y * width] == 0xFFFF9003) return Tile.bigtree4;
		if (tiles[x + y * width] == 0xFFFF9004) return Tile.bigtree5;
		if (tiles[x + y * width] == 0xFFFF9005) return Tile.bigtree6;
		if (tiles[x + y * width] == 0xFFFF9006) return Tile.bigtree7;
		if (tiles[x + y * width] == 0xFFFF9007) return Tile.bigtree8;
		if (tiles[x + y * width] == 0xFFFF9008) return Tile.bigtree9;
		if (tiles[x + y * width] == 0xFFFF9009) return Tile.bigtree10;
		if (tiles[x + y * width] == 0xFFFF9010) return Tile.bigtree11;
		if (tiles[x + y * width] == 0xFFFF9011) return Tile.bigtree12;
		if (tiles[x + y * width] == 0xFFFF9012) return Tile.bigtree13;
		if (tiles[x + y * width] == 0xFFFF9013) return Tile.bigtree14;
		if (tiles[x + y * width] == 0xFFFF9014) return Tile.bigtree15;
		if (tiles[x + y * width] == 0xFFFF9015) return Tile.bigtree16;
		if (tiles[x + y * width] == 0xFFFF9016) return Tile.bigtree17;
		if (tiles[x + y * width] == 0xFFFF9017) return Tile.bigtree18;
		if (tiles[x + y * width] == 0xFFFF9018) return Tile.bigtree19;
		if (tiles[x + y * width] == 0xFFFF9019) return Tile.bigtree20;
		if (tiles[x + y * width] == 0xFFFF9020) return Tile.bigtree21;
		if (tiles[x + y * width] == 0xFFFF9021) return Tile.bigtree22;
		if (tiles[x + y * width] == 0xFFFF9022) return Tile.bigtree23;
		if (tiles[x + y * width] == 0xFFFF9023) return Tile.bigtree24;
		if (tiles[x + y * width] == 0xFFFF9024) return Tile.bigtree25;
		if (tiles[x + y * width] == 0xFFFF9025) return Tile.bigtree26;
		if (tiles[x + y * width] == 0xFFFF9026) return Tile.bigtree27;
		if (tiles[x + y * width] == 0xFFFF9027) return Tile.bigtree28;
		if (tiles[x + y * width] == 0xFFFF9028) return Tile.bigtree29;
		if (tiles[x + y * width] == 0xFFFF9029) return Tile.bigtree30;
		if (tiles[x + y * width] == 0xFF7C7C7A) return Tile.rockpath;
		if (tiles[x + y * width] == 0xFF7C7C7B) return Tile.rockpath2;
		if (tiles[x + y * width] == 0xFF7C7C7C) return Tile.rockpath3;
		if (tiles[x + y * width] == 0xFF7C7C7D) return Tile.rockpath4;
		if (tiles[x + y * width] == 0xFF7C7C7E) return Tile.rockpath5;
		if (tiles[x + y * width] == 0xFF7C7C7F) return Tile.rockpath6;
		if (tiles[x + y * width] == 0xFF006789) return Tile.pound;
		if (tiles[x + y * width] == 0xFF006790) return Tile.pound2;
		if (tiles[x + y * width] == 0xFF006791) return Tile.pound3;
		if (tiles[x + y * width] == 0xFF006792) return Tile.pound4;
		if (tiles[x + y * width] == 0xFF006793) return Tile.pound5;
		if (tiles[x + y * width] == 0xFF006794) return Tile.pound6;
		if (tiles[x + y * width] == 0xFF006795) return Tile.pound7;
		if (tiles[x + y * width] == 0xFF006796) return Tile.pound8;
		if (tiles[x + y * width] == 0xFF006797) return Tile.pound9;
		if (tiles[x + y * width] == 0xFF006798) return Tile.pound10;
		if (tiles[x + y * width] == 0xFF006799) return Tile.pound11;
		if (tiles[x + y * width] == 0xFF006E86) return Tile.pound12;
		if (tiles[x + y * width] == 0xFF006E87) return Tile.pound13;
		if (tiles[x + y * width] == 0xFF006E88) return Tile.pound14;
		if (tiles[x + y * width] == 0xFF006E89) return Tile.pound15;
		if (tiles[x + y * width] == 0xFF006E90) return Tile.pound16;
		if (tiles[x + y * width] == 0xFF006E91) return Tile.pound17;
		if (tiles[x + y * width] == 0xFF006E92) return Tile.pound18;
		if (tiles[x + y * width] == 0xFF006E93) return Tile.pound19;
		if (tiles[x + y * width] == 0xFF006E94) return Tile.pound20;
		if (tiles[x + y * width] == 0xFF006E95) return Tile.pound21;
		if (tiles[x + y * width] == 0xFF006E96) return Tile.pound22;
		if (tiles[x + y * width] == 0xFF006E97) return Tile.pound23;
		if (tiles[x + y * width] == 0xFF006E98) return Tile.pound24;
		if (tiles[x + y * width] == 0xFF006E99) return Tile.pound25;
		if (tiles[x + y * width] == 0xFF0B7C84) return Tile.pound26;
		if (tiles[x + y * width] == 0xFF0B7C85) return Tile.pound27;
		if (tiles[x + y * width] == 0xFF0B7C86) return Tile.pound28;
		if (tiles[x + y * width] == 0xFF0B7C87) return Tile.pound29;
		if (tiles[x + y * width] == 0xFF0B7C88) return Tile.pound30;
		if (tiles[x + y * width] == 0xFF0B7C89) return Tile.pound31;
		if (tiles[x + y * width] == 0xFF0B7C90) return Tile.pound32;
		if (tiles[x + y * width] == 0xFF0B7C91) return Tile.pound33;
		if (tiles[x + y * width] == 0xFF0B7C92) return Tile.pound34;
		if (tiles[x + y * width] == 0xFF0B7C93) return Tile.pound35;
		if (tiles[x + y * width] == 0xFF0B7C94) return Tile.pound36;
		if (tiles[x + y * width] == 0xFF0B7C95) return Tile.pound37;
		if (tiles[x + y * width] == 0xFF0B7C96) return Tile.pound38;
		if (tiles[x + y * width] == 0xFF0B7C97) return Tile.pound39;
		if (tiles[x + y * width] == 0xFF0B7C98) return Tile.pound40;	

		return Tile.voidTile;		
	}
	
}
