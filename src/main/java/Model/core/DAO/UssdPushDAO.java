/*    */ package Model.core.DAO;
/*    */ 
/*    */ import ir.markazandroid.greengate.model.entity.UssdPushEntity;
/*    */ import ir.markazandroid.greengate.model.entity.UssdPushEntityPK;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface UssdPushDAO
/*    */   extends BaseDAO<UssdPushEntityPK, UssdPushEntity>, PagedDAO<UssdPushEntity>
/*    */ {
/*    */   List<UssdPushEntity> list(String paramString, int paramInt1, int paramInt2);
/*    */   
/*    */   List<UssdPushEntity> listNotSent(String paramString, int paramInt1, int paramInt2);
/*    */   
/*    */   long count(String paramString);
/*    */   
/*    */   void updateSenTimeAndSessionId(UssdPushEntity paramUssdPushEntity);
/*    */   
/*    */   default Class<UssdPushEntity> getClazz() {
/* 25 */     return UssdPushEntity.class;
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\core\DAO\UssdPushDAO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */