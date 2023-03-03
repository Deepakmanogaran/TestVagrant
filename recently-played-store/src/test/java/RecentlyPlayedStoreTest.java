import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.LinkedHashMap;
import java.util.Map;
public class RecentlyPlayedStoreTest {
    private RecentlyPlayedStore store;
    @BeforeMethod
    public void setUp() {
        store = new RecentlyPlayedStore(3);
    }
    @Test
    public void testAddSongs() {
        String user1 = "Alice";
        String user2 = "Bob";
        // Alice plays three songs
        store.addSong(user1, "S1");
        store.addSong(user1, "S2");
        store.addSong(user1, "S3");
        // Bob plays two songs
        store.addSong(user2, "S4");
        store.addSong(user2, "S5");
        // Check that songs were added correctly
        Assert.assertEquals(store.getRecentlyPlayedSongs(user1), "S1,S2,S3");
        Assert.assertEquals(store.getRecentlyPlayedSongs(user2), "S4,S5");
    }
    @Test
    public void testCapacity() {
        String user1 = "Alice";
        // Alice plays more songs than the capacity
        store.addSong(user1, "S1");
        store.addSong(user1, "S2");
        store.addSong(user1, "S3");
        store.addSong(user1, "S4");
        store.addSong(user1, "S5");
        // Check that the store maintains the capacity
        Assert.assertEquals(store.getRecentlyPlayedSongs(user1), "S3,S4,S5");
    }
    @Test
    public void testRepeatSongs() {
        String user1 = "Alice";
        // Alice plays some songs multiple times
        store.addSong(user1, "S1");
        store.addSong(user1, "S2");
        store.addSong(user1, "S3");
        store.addSong(user1, "S1");
        store.addSong(user1, "S2");
        // Check that repeated songs don't affect the order
        Assert.assertEquals(store.getRecentlyPlayedSongs(user1), "S3,S1,S2");
    }
}