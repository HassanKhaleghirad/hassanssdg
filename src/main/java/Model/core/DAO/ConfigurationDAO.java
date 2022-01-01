/*    */ package Model.core.DAO;
/*    */ 
/*    */ import ir.markazandroid.greengate.model.entity.ConfigurationEntity;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface ConfigurationDAO
/*    */   extends BaseDAO<String, ConfigurationEntity>
/*    */ {
/*    */   default Class<ConfigurationEntity> getClazz() {
/* 12 */     return ConfigurationEntity.class;
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\core\DAO\ConfigurationDAO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */