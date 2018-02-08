// Create a program that implements a playlist for songs

// Create a Song class having Title and Duration for a song.

// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList

// Songs from different albums can be added to the playlist and will appear in the list in the order they are added.

// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist

// A song must exist in an album before it can be added to the playlist (so you can only play songs that you own).

// Hint:
// To replay a song, consider what happened when we went back and forth from a city before we started tracking the direction we were going.

// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()

import java.util.*;

public class Main {

	private static ArrayList<Album> albums = new ArrayList<Album>();

	public static void main(String[] args) {

		Album album = new Album("Rust in Peace", "Megadeth");
		album.addSong("Holy Wars", 6.36);
		album.addSong("Hangar 18", 5.14);
		album.addSong("Take No Prisoners", 3.28);
		album.addSong("Five Magics", 5.42);
		album.addSong("Poison Was the Cure", 2.58);
		album.addSong("Lucretia", 3.58);
		album.addSong("Tornado of Souls", 5.22);
		album.addSong("Dawn Patrol", 1.50);
		album.addSong("Rust in Peace", 5.36);
		albums.add(album);

		album = new Album("Stormbringer", "Deep Purple");
		album.addSong("Stormbringer", 4.6);
		album.addSong("Love don't mean a thing", 4.22);
		album.addSong("Holy man", 4.3);
		album.addSong("Hold on", 5.6);
		album.addSong("Lady double dealer", 3.21);
		album.addSong("You can't do it right", 6.23);
		album.addSong("High ball shooter", 4.27);
		album.addSong("The gypsy", 4.2);
		album.addSong("Soldier of fortune", 3.13);
		albums.add(album);

		LinkedList<Song> playList = new LinkedList<Song>();
		albums.get(0).addToPlaylist("Hangar 18", playList);
		albums.get(0).addToPlaylist("Lucretia", playList);
		albums.get(0).addToPlaylist("Dawn Patrol", playList);  // Does not exist
		albums.get(0).addToPlaylist(9, playList);
		albums.get(1).addToPlaylist(8, playList);
		albums.get(1).addToPlaylist(3, playList);
		albums.get(1).addToPlaylist(2, playList);
		albums.get(1).addToPlaylist(24, playList);  // There is no track 24

		play(playList);
	}

	private static void play(LinkedList<Song> playlist) {

		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;

		ListIterator<Song> listIterator = playlist.listIterator();

		if (playlist.size() == 0) {
			System.out.println("Playlist Empty");
			return;
		} else {
			System.out.println("Playing: " + listIterator.next().toString());
		}

		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();

			switch (action) {
				case 0:
					System.out.println("Playlist complete.");
					quit = true;
					break;
				case 1:
					if(!forward) {
						if(listIterator.hasNext())
							listIterator.next();

						forward = true;
					}
					if(listIterator.hasNext())
						System.out.println("Now playing " + listIterator.next().toString());
					else {
						System.out.println("We have reached the end of the playlist");
						forward = false;
					}
					break;

				case 2:
					if(forward) {
						if(listIterator.hasPrevious())
							listIterator.previous();
						forward = false;
					}
					if(listIterator.hasPrevious()) {
						System.out.println("Now playing " + listIterator.previous().toString());
					} else {
						System.out.println("We are at the start of the playlist");
						forward = true;
					}
					break;

				case 3:
					if(forward) {
						if(listIterator.hasPrevious()) {
							System.out.println("Now replaying " + listIterator.previous().toString());
							forward = false;
						} else
							System.out.println("We are at the start of the list");
					} else {
						if(listIterator.hasNext()) {
							System.out.println("Now replaying " + listIterator.next().toString());
							forward = true;
						} else
							System.out.println("We have reached the end of the list");
					}
					break;
				case 4:
					printList(playlist);
					break;
				case 5:
					printMenu();
					break;

				case 6:
					if(playlist.size() >0) {
						listIterator.remove();
						if(listIterator.hasNext())
							System.out.println("Now playing " + listIterator.next());
						else if(listIterator.hasPrevious())
							System.out.println("Now playing " + listIterator.previous());
					}
					break;

			}
		}
	}

	private static void printMenu() {
		System.out.println("Menu Options:\n" +
				"0 - Quit\n" +
				"1 - Play Next Song\n" +
				"2 - Play Previous Song\n" +
				"3 - Replay Current Song\n" +
				"4 - List Playlist Tracks\n" +
				"5 - Print Available Actions" +
				"6 - Delete Current Song from Playlist");
	}

	private static void printList(LinkedList<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		System.out.println("================================");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("================================");
	}
}