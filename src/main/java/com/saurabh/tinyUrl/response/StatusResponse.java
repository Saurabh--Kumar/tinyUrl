package com.saurabh.tinyUrl.response;

import com.saurabh.tinyUrl.enums.Status;
import lombok.Data;

@Data
public class StatusResponse {
    private Status status;
    private int statusCode;
    private String statusMessage;
}
