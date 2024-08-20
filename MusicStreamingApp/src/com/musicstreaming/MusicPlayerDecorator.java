package com.musicstreaming;
	
	
	public class MusicPlayerDecorator implements MusicPlayer {
	    private MusicPlayer decoratedPlayer;
	
	    public MusicPlayerDecorator(MusicPlayer decoratedPlayer) {
	        this.decoratedPlayer = decoratedPlayer;
	    }
	
	    @Override
	    public void playing() {
	        decoratedPlayer.playing();
	        addEqualizer();
	        adjustVolume();
	    }
	
	    private void addEqualizer() {
	        System.out.println("Equalizer settings applied.");
	    }
	
	    private void adjustVolume() {
	        System.out.println("Volume adjusted.");
	    }

	}