/*    */ package Model.core.DAO;
/*    */ 
/*    */ import ir.markazandroid.greengate.model.ussd.UssdSession;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface UssdSessionDAO
/*    */   extends BaseDAO<String, UssdSession>
/*    */ {
/*    */   UssdSession findByMsisdn(String paramString);
/*    */   
/*    */   void deleteByMsisdn(String paramString);
/*    */   
/*    */   int countUSSDNumberSessions(String paramString);
/*    */   
/*    */   Map<String, Integer> countAllUssdNumberSessions();
/*    */   
/*    */   default Class<UssdSession> getClazz() {
/* 20 */     return UssdSession.class;
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\core\DAO\UssdSessionDAO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */