/*    */ package Model.core.DAO;
/*    */ 
/*    */ import ir.markazandroid.greengate.model.entity.AuditLogEntity;
/*    */ import ir.markazandroid.greengate.model.entity.AuditLogEntityPK;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface AuditLogDAO
/*    */   extends BaseDAO<AuditLogEntityPK, AuditLogEntity>, PagedDAO<AuditLogEntity>
/*    */ {
/*    */   default Class<AuditLogEntity> getClazz() {
/* 13 */     return AuditLogEntity.class;
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\core\DAO\AuditLogDAO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */