/*    */ package Model.core.DAO;
/*    */ 
/*    */ import ir.markazandroid.greengate.model.entity.UserEntity;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface UserDAO
/*    */   extends BaseDAO<String, UserEntity>
/*    */ {
/*    */   default Class<UserEntity> getClazz() {
/* 12 */     return UserEntity.class;
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\core\DAO\UserDAO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */