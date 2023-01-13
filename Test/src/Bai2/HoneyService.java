package Bai2;

import java.util.*;

public interface HoneyService {
    void addHoney(Honey h);
    void deleteHoney(String id);
    void editHoney(String id);
    void showAllHoney();
    void addFavorite(Favorite f,String id);
    List<Honey> sortedHoney();
}
