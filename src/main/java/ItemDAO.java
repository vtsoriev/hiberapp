import java.util.List;

public interface ItemDAO<Item, Long> extends GenericDAO {

    List<Item> findAll(boolean withBids);

    List<Item> findByName(String n, boolean substring);

    List<ItemBidSummary> findItemBidSummaries();
}
