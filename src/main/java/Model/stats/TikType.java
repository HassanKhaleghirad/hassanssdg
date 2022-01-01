 package Model.stats;



 public enum TikType
 {
   second("Second", new int[] { 20, 60, 120 }, null),
   minute("Minute", new int[] { 20, 60, 120 }, new String[] { "YYYY", "MM", "DD", "HH24", "MI" }),
   hour("Hour", new int[] { 24, 48, 72 }, new String[] { "YYYY", "MM", "DD", "HH24" }),
   day("Day", new int[] { 15, 30, 60 }, new String[] { "YYYY", "MM", "DD" }),
   month("Month", new int[] { 12, 24, 48 }, new String[] { "YYYY", "MM" });

   private final String name;
   private final int[] count;
   private final String[] gp;

   TikType(String name, int[] count, String[] gp) {
     this.name = name;
     this.count = count;
     this.gp = gp;
   }

   public String getName() {
     return this.name;
   }

   public int[] getCount() {
     return this.count;
   }

   public String[] getGp() {
     return this.gp;
   }
 }
