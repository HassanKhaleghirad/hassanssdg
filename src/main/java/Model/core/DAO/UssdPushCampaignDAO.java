/*    */ package Model.core.DAO;
/*    */ 
/*    */ import ir.markazandroid.greengate.model.entity.UssdPushCampaignEntity;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface UssdPushCampaignDAO
/*    */   extends BaseDAO<String, UssdPushCampaignEntity>, PagedDAO<UssdPushCampaignEntity>
/*    */ {
/*    */   List<UssdPushCampaignEntity> getNotFinishedCampaigns();
/*    */   
/*    */   default Class<UssdPushCampaignEntity> getClazz() {
/* 16 */     return UssdPushCampaignEntity.class;
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\core\DAO\UssdPushCampaignDAO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */