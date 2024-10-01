package com.example.Spring_rabbitmq_consumer_app;

 

import java.util.Date;


// import lombok.AllArgsConstructor;
// import lombok.Data;
// import lombok.NoArgsConstructor;

 
public class CustomMessage {
private String messageId;
public CustomMessage(String messageId, String message, Date messageDate) {
    this.messageId = messageId;
    this.message = message;
    this.messageDate = messageDate;
}
private String message;
private Date messageDate;

public String getMessageId() {
    return messageId;
}
public String getMessage() {
    return message;
}
public Date getMessageDate() {
    return messageDate;
}
public void setMessageId(String messageId) {
    this.messageId = messageId;
}
public void setMessage(String message) {
    this.message = message;
}
public void setMessageDate(Date date) {
    this.messageDate = date;
}
@Override
public String toString() {
    return "CustomMessage [messageId=" + messageId + ", message=" + message + ", messageDate=" + messageDate
            + ", toString()=" + super.toString() + "]";
}



}
