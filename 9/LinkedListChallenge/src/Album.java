import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private ArrayList<Song> tracks;

	private String title;
	private String artist;

	public Album(String title, String artist) {
		this.tracks = new ArrayList<Song>();
		this.title = title;
		this.artist = artist;
	}

	public boolean addSong(String title, double duration) {
		if (findSong(title) == null) {
			this.tracks.add(new Song(title, duration));
			return true;
		}
		return false;
	}

	private Song findSong(String title) {
		for (Song song : this.tracks)
			if (song.getTitle().equals(title))
				return song;

		return null;
	}

	public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
		int index = trackNumber -1;
		if ( index > 0 && index <= this.tracks.size() ) {
			playlist.add(this.tracks.get(index));
			return true;
		}

		System.out.println("This album has no track number " + trackNumber);
		return false;

	}
	public boolean addToPlaylist(String title, LinkedList<Song> playlist) {
		Song song = findSong(title);
		if (song != null) {
			playlist.add(song);
			return true;
		}

		System.out.println("This album has no track titled" + song);
		return false;
	}
}
