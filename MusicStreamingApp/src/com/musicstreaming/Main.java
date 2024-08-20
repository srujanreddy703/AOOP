package com.musicstreaming;
	
	public class Main {
	    public static void main(String[] args) {
	        // Play music from local file with added features
	        MusicPlayer localFilePlayer = new MusicSource("LocalFile", "song.mp3");
	        MusicPlayer decoratedLocalFilePlayer = new MusicPlayerDecorator(localFilePlayer);
	        decoratedLocalFilePlayer.playing();
	
	        // Play music from online streaming with added features
	        MusicPlayer onlinePlayer = new MusicSource("OnlineStream", "http://musicstream.com/song");
	        MusicPlayer decoratedOnlinePlayer = new MusicPlayerDecorator(onlinePlayer);
	        decoratedOnlinePlayer.playing();
	
	        // Play music from radio with added features in the project
	        MusicPlayer radioPlayer = new MusicSource("Radio", "RadioStation109");
	        MusicPlayer decoratedRadioPlayer = new MusicPlayerDecorator(radioPlayer);
	        decoratedRadioPlayer.playing();
	    }
	}
