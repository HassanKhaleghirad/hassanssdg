/*    */ package Model.core.DAO;
/*    */ 
/*    */ import ir.markazandroid.greengate.model.entity.M3UALinkEntity;
/*    */ import ir.markazandroid.greengate.model.link.LinkConnectionStatus;
/*    */ import java.util.List;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface M3UALinkDAO
/*    */   extends BaseDAO<Long, M3UALinkEntity>
/*    */ {
/*    */   default Class<M3UALinkEntity> getClazz() {
/* 15 */     return M3UALinkEntity.class;
/*    */   }
/*    */   
/*    */   List<M3UALinkEntity> getLinks(String paramString);
/*    */   
/*    */   void updateLinkConnectionStatus(long paramLong, LinkConnectionStatus paramLinkConnectionStatus, String paramString);
/*    */   
/*    */   static long generateId(M3UALinkEntity linkEntity) {
/* 23 */     return generateId(linkEntity.getClientAddress(), linkEntity.getClientPort(), linkEntity.getServerAddress(), linkEntity.getServerPort());
/*    */   }
/*    */   
/*    */   static long generateId(String clientIp, String clientPort, String serverIp, String serverPort) {
/* 27 */     return Objects.hash(new Object[] { clientIp, clientPort, serverIp, serverPort });
/*    */   }
/*    */ 
/*    */   
/*    */   static void main(String[] args) {
/* 32 */     System.out.println(generateId("10.192.91.156", "1903", "10.192.138.150", "1803"));
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\core\DAO\M3UALinkDAO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */