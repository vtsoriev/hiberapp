import javax.persistence.LockModeType;
import java.util.List;

public interface GenericDAO<T, ID> {

    T findByID(ID id);

    T findByID(ID id, LockModeType lock);

    T findReferenceByID(ID id);

    List<T> findAll();

    Long getCount();

    T makePersistent(T entity);

    void makeTransient(T entity);

    void checkVersion(T entity, boolean forceUpdate);

}
