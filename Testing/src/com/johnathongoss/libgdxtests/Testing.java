package com.johnathongoss.libgdxtests;

import com.johnathongoss.libgdxtests.screens.Loading;

public class Testing extends MyGame {		
	
		
	public Testing(IActivityRequestHandler handler) {
		super(handler);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void create() {		
			
		setScreen(new Loading(this));
	}
	
	

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void render() {		
		super.render();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}
}
