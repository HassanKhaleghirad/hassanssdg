package Model.core.DAO;

import java.util.List;

public interface PagedDAO<T> {
  List<T> list(int paramInt1, int paramInt2);
  
  long count();
}


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\core\DAO\PagedDAO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */