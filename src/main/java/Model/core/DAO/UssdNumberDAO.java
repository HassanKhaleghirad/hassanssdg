/*    */ package Model.core.DAO;
/*    */ 
/*    */ import ir.markazandroid.greengate.model.entity.UssdNumberEntity;
/*    */ 
/*    */ 
/*    */ public interface UssdNumberDAO
/*    */   extends BaseDAO<String, UssdNumberEntity>
/*    */ {
/*    */   UssdNumberEntity getByName(String paramString);
/*    */   
/*    */   UssdNumberEntity getByNumber(String paramString);
/*    */   
/*    */   default Class<UssdNumberEntity> getClazz() {
/* 14 */     return UssdNumberEntity.class;
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\core\DAO\UssdNumberDAO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */