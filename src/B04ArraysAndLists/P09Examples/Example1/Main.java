package B04ArraysAndLists.P09Examples.Example1;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {

        Album album = new Album("Forever", "Barış Manço");
        album.addSong("Alla beni pulla beni", 4.6);
        album.addSong("Domates biber patlıcan", 4.27);
        album.addSong("Dönence", 6.50);
        album.addSong("Aynalı kemer", 3.6);

        albums.add(album);

        album = new Album("Hasret", "Cem Karaca");
        album.addSong("Herkes gibisin", 4.6);
        album.addSong("Hasret", 4.27);
        album.addSong("Giden", 6.50);
        album.addSong("Kara bahtım", 3.6);

        albums.add(album);


        LinkedList<Song> playlist = new LinkedList();

        albums.get(0).addToPlayList("Dönence" , playlist); //with title
        albums.get(0).addToPlayList(1,playlist);  //with track number
        albums.get(0).addToPlayList(8,playlist); //there is no track 8

        albums.get(1).addToPlayList(4,playlist);

        play(playlist);


    }

    public static void play (LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward =  true; //yön değişikliği olduğunda değeri tersine döner.


        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing  " + listIterator.next().toString());
        }



        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;

                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the en of the list");
                        }
                    }
                    break;

                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().toString());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().toString());
                        }
                    }
                    break;



            }
        }

    }


    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.\n" +
                "6 - delete current song from playlist");

    }


    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("================================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("================================");
    }

}
