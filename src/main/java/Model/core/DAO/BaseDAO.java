package Model.core.DAO;

import java.util.List;

public interface BaseDAO<I, T extends ir.markazandroid.greengate.model.core.BaseEntity<I>> {
  T getById(I paramI);
  
  void save(T paramT);
  
  void update(T paramT);
  
  void saveOrUpdate(T paramT);
  
  void delete(I paramI);
  
  void detach(Object paramObject);
  
  List<T> list();
  
  Class<T> getClazz();
}


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\core\DAO\BaseDAO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */