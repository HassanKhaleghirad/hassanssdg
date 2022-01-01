/*    */ package Model.core.DAO;
/*    */ 
/*    */ import ir.markazandroid.greengate.model.entity.StatsEntity;
/*    */ import ir.markazandroid.greengate.model.entity.StatsEntityPK;
/*    */ import ir.markazandroid.greengate.model.stats.StatsIdentifier;
/*    */ import ir.markazandroid.greengate.model.stats.StatsQueryMaker;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface StatsDAO
/*    */   extends BaseDAO<StatsEntityPK, StatsEntity>
/*    */ {
/*    */   List<StatsEntity> list(StatsIdentifier paramStatsIdentifier, StatsQueryMaker paramStatsQueryMaker, int paramInt);
/*    */   
/*    */   List<StatsEntity> list(StatsIdentifier paramStatsIdentifier, int paramInt);
/*    */   
/*    */   default Class<StatsEntity> getClazz() {
/* 20 */     return StatsEntity.class;
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\core\DAO\StatsDAO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */