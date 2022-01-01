 package Model.message;

 import java.util.Objects;




 public class ConfigMessage
   extends BaseMessage
 {
   private String key;
   private String lastValue;
   private String value;

   public String getKey() {
     return this.key;
   }

   public void setKey(String key) {
     this.key = key;
   }

   public String getLastValue() {
     return this.lastValue;
   }

   public void setLastValue(String lastValue) {
     this.lastValue = lastValue;
   }

   public String getValue() {
     return this.value;
   }

   public void setValue(String value) {
     this.value = value;
   }


   public boolean equals(Object o) {
     if (this == o) return true;
     if (!(o instanceof ConfigMessage)) return false;
     ConfigMessage that = (ConfigMessage)o;
     return (Objects.equals(getKey(), that.getKey()) &&
       Objects.equals(getLastValue(), that.getLastValue()) &&
       Objects.equals(getValue(), that.getValue()));
   }


   public int hashCode() {
     return Objects.hash(new Object[] { getKey(), getLastValue(), getValue() });
   }


   public String toString() {
     return "ConfigMessage{key='" + this.key + '\'' + ", lastValue='" + this.lastValue + '\'' + ", value='" + this.value + '\'' + '}';
   }
 }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\message\ConfigMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */