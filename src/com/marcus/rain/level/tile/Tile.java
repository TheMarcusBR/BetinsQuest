package com.marcus.rain.level.tile;

import com.marcus.rain.graphics.Screen;
import com.marcus.rain.graphics.Sprite;

public class Tile {
	
	public int x, y;
	public Sprite sprite;
	
	public static Tile grass = new GrassTile(Sprite.grass);
	public static Tile flowerbush = new FlowerbushTile(Sprite.flowerbush);
	public static Tile cuttree = new CuttreeTile(Sprite.cuttree);
	public static Tile cuttree2 = new CuttreeTile(Sprite.cuttree2);
	public static Tile cuttree3 = new CuttreeTile(Sprite.cuttree3);
	public static Tile cuttree4 = new CuttreeTile(Sprite.cuttree4);
	public static Tile rockpath = new RockpathTile(Sprite.rockpath);
	public static Tile rockpath2 = new RockpathTile(Sprite.rockpath2);
	public static Tile rockpath3 = new RockpathTile(Sprite.rockpath3);
	public static Tile rockpath4 = new RockpathTile(Sprite.rockpath4);
	public static Tile rockpath5 = new RockpathTile(Sprite.rockpath5);
	public static Tile rockpath6 = new RockpathTile(Sprite.rockpath6);
	public static Tile rocks = new RocksTile(Sprite.rocks);
	public static Tile rocks2 = new RocksTile(Sprite.rocks2);
	public static Tile rocks3 = new RocksTile(Sprite.rocks3);
	public static Tile rocks4 = new RocksTile(Sprite.rocks4);
	public static Tile voidTile = new VoidTile(Sprite.voidSprite);
	public static Tile betinsap = new BetinsapTile(Sprite.betinsap);
	public static Tile betinsap2 = new BetinsapTile(Sprite.betinsap2);
	public static Tile betinsap3 = new BetinsapTile(Sprite.betinsap3);
	public static Tile betinsap4 = new BetinsapTile(Sprite.betinsap4);
	public static Tile betinsap5 = new BetinsapTile(Sprite.betinsap5);
	public static Tile betinsap6 = new BetinsapTile(Sprite.betinsap6);
	public static Tile betinsap7 = new BetinsapTile(Sprite.betinsap7);
	public static Tile betinsap8 = new BetinsapTile(Sprite.betinsap8);
	public static Tile betinsap9 = new BetinsapTile(Sprite.betinsap9);
	public static Tile betinsap10 = new BetinsapTile(Sprite.betinsap10);
	public static Tile betinsap11 = new BetinsapTile(Sprite.betinsap11);
	public static Tile betinsap12 = new BetinsapTile(Sprite.betinsap12);
	public static Tile betinsap13 = new BetinsapTile(Sprite.betinsap13);
	public static Tile betinsap14 = new BetinsapTile(Sprite.betinsap14);
	public static Tile betinsap15 = new BetinsapTile(Sprite.betinsap15);
	public static Tile betinsap16 = new BetinsapTile(Sprite.betinsap16);
	public static Tile betinsap17 = new BetinsapTile(Sprite.betinsap17);
	public static Tile betinsap18 = new BetinsapTile(Sprite.betinsap18);
	public static Tile betinsap19 = new BetinsapTile(Sprite.betinsap19);
	public static Tile betinsap20 = new BetinsapTile(Sprite.betinsap20);
	public static Tile betinsap21 = new BetinsapTile(Sprite.betinsap21);
	public static Tile betinsap22 = new BetinsapTile(Sprite.betinsap22);
	public static Tile betinsap23 = new BetinsapTile(Sprite.betinsap23);
	public static Tile betinsap24 = new BetinsapTile(Sprite.betinsap24);
	public static Tile betinsap25 = new BetinsapTile(Sprite.betinsap25);
	public static Tile betinsap26 = new BetinsapTile(Sprite.betinsap26);
	public static Tile betinsap27 = new BetinsapTile(Sprite.betinsap27);
	public static Tile betinsap28 = new BetinsapTile(Sprite.betinsap28);
	public static Tile betinsap29 = new BetinsapTile(Sprite.betinsap29);
	public static Tile betinsap30 = new BetinsapTile(Sprite.betinsap30);
	public static Tile bigtree = new BigtreeTile(Sprite.bigtree);
	public static Tile bigtree2 = new BigtreeTile(Sprite.bigtree2);
	public static Tile bigtree3 = new BigtreeTile(Sprite.bigtree3);
	public static Tile bigtree4 = new BigtreeTile(Sprite.bigtree4);
	public static Tile bigtree5 = new BigtreeTile(Sprite.bigtree5);
	public static Tile bigtree6 = new BigtreeTile(Sprite.bigtree6);
	public static Tile bigtree7 = new BigtreeTile(Sprite.bigtree7);
	public static Tile bigtree8 = new BigtreeTile(Sprite.bigtree8);
	public static Tile bigtree9 = new BigtreeTile(Sprite.bigtree9);
	public static Tile bigtree10 = new BigtreeTile(Sprite.bigtree10);
	public static Tile bigtree11 = new BigtreeTile(Sprite.bigtree11);
	public static Tile bigtree12 = new BigtreeTile(Sprite.bigtree12);
	public static Tile bigtree13 = new BigtreeTile(Sprite.bigtree13);
	public static Tile bigtree14 = new BigtreeTile(Sprite.bigtree14);
	public static Tile bigtree15 = new BigtreeTile(Sprite.bigtree15);
	public static Tile bigtree16 = new BigtreeTile(Sprite.bigtree16);
	public static Tile bigtree17 = new BigtreeTile(Sprite.bigtree17);
	public static Tile bigtree18 = new BigtreeTile(Sprite.bigtree18);
	public static Tile bigtree19 = new BigtreeTile(Sprite.bigtree19);
	public static Tile bigtree20 = new BigtreeTile(Sprite.bigtree20);
	public static Tile bigtree21 = new BigtreeTile(Sprite.bigtree21);
	public static Tile bigtree22 = new BigtreeTile(Sprite.bigtree22);
	public static Tile bigtree23 = new BigtreeTile(Sprite.bigtree23);
	public static Tile bigtree24 = new BigtreeTile(Sprite.bigtree24);
	public static Tile bigtree25 = new BigtreeTile(Sprite.bigtree25);
	public static Tile bigtree26 = new BigtreeTile(Sprite.bigtree26);
	public static Tile bigtree27 = new BigtreeTile(Sprite.bigtree27);
	public static Tile bigtree28 = new BigtreeTile(Sprite.bigtree28);
	public static Tile bigtree29 = new BigtreeTile(Sprite.bigtree29);
	public static Tile bigtree30 = new BigtreeTile(Sprite.bigtree30);
	public static Tile pound = new PoundTile(Sprite.pound);
	public static Tile pound2 = new PoundTile(Sprite.pound2);
	public static Tile pound3 = new PoundTile(Sprite.pound3);
	public static Tile pound4 = new PoundTile(Sprite.pound4);
	public static Tile pound5 = new PoundTile(Sprite.pound5);
	public static Tile pound6 = new PoundTile(Sprite.pound6);
	public static Tile pound7 = new PoundTile(Sprite.pound7);
	public static Tile pound8 = new PoundTile(Sprite.pound8);
	public static Tile pound9 = new PoundTile(Sprite.pound9);
	public static Tile pound10 = new PoundTile(Sprite.pound10);
	public static Tile pound11 = new PoundTile(Sprite.pound11);
	public static Tile pound12 = new PoundTile(Sprite.pound12);
	public static Tile pound13 = new PoundTile(Sprite.pound13);
	public static Tile pound14 = new PoundTile(Sprite.pound14);
	public static Tile pound15 = new PoundTile(Sprite.pound15);
	public static Tile pound16 = new PoundTile(Sprite.pound16);
	public static Tile pound17 = new PoundTile(Sprite.pound17);
	public static Tile pound18 = new PoundTile(Sprite.pound18);
	public static Tile pound19 = new PoundTile(Sprite.pound19);
	public static Tile pound20 = new PoundTile(Sprite.pound20);
	public static Tile pound21 = new PoundTile(Sprite.pound21);
	public static Tile pound22 = new PoundTile(Sprite.pound22);
	public static Tile pound23 = new PoundTile(Sprite.pound23);
	public static Tile pound24 = new PoundTile(Sprite.pound24);
	public static Tile pound25 = new PoundTile(Sprite.pound25);
	public static Tile pound26 = new PoundTile(Sprite.pound26);
	public static Tile pound27 = new PoundTile(Sprite.pound27);
	public static Tile pound28 = new PoundTile(Sprite.pound28);
	public static Tile pound29 = new PoundTile(Sprite.pound29);
	public static Tile pound30 = new PoundTile(Sprite.pound30);
	public static Tile pound31 = new PoundTile(Sprite.pound31);
	public static Tile pound32 = new PoundTile(Sprite.pound32);
	public static Tile pound33 = new PoundTile(Sprite.pound33);
	public static Tile pound34 = new PoundTile(Sprite.pound34);
	public static Tile pound35 = new PoundTile(Sprite.pound35);
	public static Tile pound36 = new PoundTile(Sprite.pound36);
	public static Tile pound37 = new PoundTile(Sprite.pound37);
	public static Tile pound38 = new PoundTile(Sprite.pound38);
	public static Tile pound39 = new PoundTile(Sprite.pound39);
	public static Tile pound40 = new PoundTile(Sprite.pound40);

	public Tile(Sprite sprite) {
		this.sprite = sprite;
		
	}
	
	public void render (int x, int y, Screen screen) {		
	}
	
	public boolean solid() {
		return false;
	}
	
}
