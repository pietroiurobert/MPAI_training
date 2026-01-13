package com.example.demo.dp_recap.Observer;

import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Subscriber {
    @NonNull
    private String name;

    public void receiveNotification(String message) {
        System.out.println(name + " received the message: " + message);
    }
}
