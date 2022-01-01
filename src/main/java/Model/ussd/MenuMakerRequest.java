/*     */ package Model.ussd;
/*     */ 
/*     */ import ir.markazandroid.JSONParser.annotations.JSON;
/*     */ import java.io.Serializable;
/*     */ 
/*     */ 
/*     */ 
/*     */ @JSON
/*     */ public class MenuMakerRequest
/*     */   implements Serializable
/*     */ {
/*     */   private String msisdn;
/*     */   private String sessionId;
/*     */   private String ussdString;
/*     */   private String commandType;
/*     */   private String vlrNo;
/*     */   private String cellId;
/*     */   private String menuNumber;
/*     */   private Boolean push;
/*     */   private PushType pushType;
/*     */   private String pushUssdNumber;
/*     */   private String city;
/*     */   
/*     */   @JSON(name = "MSISDN")
/*     */   public String getMsisdn() {
/*  26 */     return this.msisdn;
/*     */   }
/*     */   
/*     */   public void setMsisdn(String msisdn) {
/*  30 */     this.msisdn = msisdn;
/*     */   }
/*     */   
/*     */   @JSON(name = "SessionID")
/*     */   public String getSessionId() {
/*  35 */     return this.sessionId;
/*     */   }
/*     */   
/*     */   public void setSessionId(String sessionId) {
/*  39 */     this.sessionId = sessionId;
/*     */   }
/*     */   
/*     */   @JSON(name = "USSDstring")
/*     */   public String getUssdString() {
/*  44 */     return this.ussdString;
/*     */   }
/*     */   
/*     */   public void setUssdString(String ussdString) {
/*  48 */     this.ussdString = ussdString;
/*     */   }
/*     */   
/*     */   @JSON(name = "CommandType")
/*     */   public String getCommandType() {
/*  53 */     return this.commandType;
/*     */   }
/*     */   
/*     */   public void setCommandType(String commandType) {
/*  57 */     this.commandType = commandType;
/*     */   }
/*     */   
/*     */   @JSON(name = "vlrNo")
/*     */   public String getVlrNo() {
/*  62 */     return this.vlrNo;
/*     */   }
/*     */   
/*     */   public void setVlrNo(String vlrNo) {
/*  66 */     this.vlrNo = vlrNo;
/*     */   }
/*     */   
/*     */   @JSON(name = "cell_id")
/*     */   public String getCellId() {
/*  71 */     return this.cellId;
/*     */   }
/*     */   
/*     */   public void setCellId(String cellId) {
/*  75 */     this.cellId = cellId;
/*     */   }
/*     */   
/*     */   @JSON
/*     */   public String getMenuNumber() {
/*  80 */     return this.menuNumber;
/*     */   }
/*     */   
/*     */   public void setMenuNumber(String menuNumber) {
/*  84 */     this.menuNumber = menuNumber;
/*     */   }
/*     */   
/*     */   @JSON
/*     */   public Boolean getPush() {
/*  89 */     return this.push;
/*     */   }
/*     */   
/*     */   public void setPush(Boolean push) {
/*  93 */     this.push = push;
/*     */   }
/*     */   
/*     */   @JSON
/*     */   public PushType getPushType() {
/*  98 */     return this.pushType;
/*     */   }
/*     */   
/*     */   public void setPushType(PushType pushType) {
/* 102 */     this.pushType = pushType;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 107 */     return "MenuMakerRequest{msisdn='" + this.msisdn + '\'' + ", sessionId='" + this.sessionId + '\'' + ", ussdString='" + this.ussdString + '\'' + ", commandType='" + this.commandType + '\'' + ", vlrNo='" + this.vlrNo + '\'' + ", cellId='" + this.cellId + '\'' + ", menuNumber='" + this.menuNumber + '\'' + ", push=" + this.push + ", pushType=" + this.pushType + ", number='" + this.pushUssdNumber + '\'' + ", city='" + this.city + '\'' + '}';
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @JSON(name = "number")
/*     */   public String getPushUssdNumber() {
/* 124 */     return this.pushUssdNumber;
/*     */   }
/*     */   
/*     */   public void setPushUssdNumber(String pushUssdNumber) {
/* 128 */     this.pushUssdNumber = pushUssdNumber;
/*     */   }
/*     */   
/*     */   @JSON
/*     */   public String getCity() {
/* 133 */     return this.city;
/*     */   }
/*     */   
/*     */   public void setCity(String city) {
/* 137 */     this.city = city;
/*     */   }
/*     */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\mode\\ussd\MenuMakerRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */