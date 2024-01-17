package phase2.linkedlist.doublylinkedlist;

import java.util.Arrays;
import java.util.List;

public class LruCachePlayground {
    public static void main(String[] args) {
        //10, 10, 20, 30, 20, 20, 50, 60, 70, 30, 90, 90
        List<Integer> list = Arrays.asList(10, 20, 30, 20, 20, 50, 60, 70, 30, 90, 90);
        LruCache lruCache = new LruCache(10, 5);
        list.forEach(lruCache::add);
    }
}
