package practice.api.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {

    @JsonProperty(value = "id", index = 0)
    private Integer id;

    @JsonProperty(value = "userName", index = 1)
    private String userName;

    @JsonProperty(value = "firstName", index = 2)
    private String firstName;

    @JsonProperty(value = "lastName", index = 3)
    private String lastName;

    @JsonProperty(value = "email", index = 4)
    private String email;

    @JsonProperty(value = "password", index = 5)
    private String password;

    @JsonProperty(value = "phone", index = 6)
    private String phone;

    @JsonProperty(value = "userStatus", index = 7)
    private Integer userStatus;
}
