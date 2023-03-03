Recently Played Store 
This is a Java project that provides an in-memory store for recently played songs for a given user. The store can accommodate N songs per user, with a fixed initial capacity. The store is implemented using a linked list data structure and supports the following operations:

addSong(String user, String song): Adds a song to the recently played list for the specified user.
getRecentlyPlayedSongs(String user, int count): Returns the count most recently played songs for the specified user.
The RecentlyPlayedStoreTest class provides a set of unit tests that validate the functionality of the store.

Getting Started
To build and run the project, you need to have Java and Maven installed on your system. You can download the latest version of Java from the Oracle website and Maven from the Apache Maven website.

To build and run the project:

Clone or download the project to your local machine.
Open a terminal or command prompt.
Navigate to the root directory of the project (recently-played-store/).
Run the following command: mvn test
This will compile the source code, run the RecentlyPlayedStoreTest test class, and output the test results to the console.

Usage
To use the recently played store in your own code, you can include the RecentlyPlayedStore class in your project. Here's an example of how to use the store:


RecentlyPlayedStore store = new RecentlyPlayedStore(3); // create a store with capacity 3
store.addSong("Alice", "Song1"); // add a song for Alice
store.addSong("Alice", "Song2"); // add another song for Alice
store.addSong("Bob", "Song3"); // add a song for Bob
List<String> songs = store.getRecentlyPlayedSongs("Alice", 2); // get the 2 most recently played songs for Alice
System.out.println(songs); // output: [Song2, Song1]
Contributing
If you find a bug or have a suggestion for improving the project, please open an issue or pull request on the GitHub repository.

License :
This project is licensed under the MIT License - see the LICENSE file for details
