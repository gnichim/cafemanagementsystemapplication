package com.inn.cafe.wrapper;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Getter and Setter for private attributes
@NoArgsConstructor
public class UserWrapper {

    // Create Object of th UserWrapper class
    // UserWrapper user = new UserWrapper(1, "abc", "abc@gmail.com", "5646", "false");

    private Integer id;

    private String name;
    private String email;

    private String contactNumber;

    private String status;

    // Constructor
    public UserWrapper(Integer id, String name, String email, String contactNumber, String status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.status = status;
    }


}
