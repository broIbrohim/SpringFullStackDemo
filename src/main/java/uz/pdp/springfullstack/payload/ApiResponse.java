package uz.pdp.springfullstack.payload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ApiResponse {

    private String message;

    private boolean success;

    private Object data;

    public ApiResponse(String message, boolean success) {
        this.message = message;
        this.success = success;
    }


}
