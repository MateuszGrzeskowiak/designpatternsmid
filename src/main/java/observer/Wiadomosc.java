package observer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Wiadomosc {
   private int level;
   private String message;

   public Wiadomosc(int level, String message) {
      this.level = level;
      this.message = message;
   }
}
