package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserFull {
        private String id;
        private String title;
        private String firstName;
        private String lastName;
        private String picture;
        private String gender;
        private String email;
        private String dateOfBirth;
    //  private LocalDateTime dateOfBirth;
        private String phone;
        private Location location;
        private String registerDate;
   //  private LocalDateTime registerDate;
       private String updatedDate;
  //   private LocalDateTime updatedDate;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public class Location{
        public String street;
        public String city;
        public String state;
        public String country;
        public String timezone;
    }
}
