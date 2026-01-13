package com.example.demo.dp_recap.State;

import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Order {
    @NonNull
    private int ID;
    @NonNull
    private State state;

    public void next() {
        switch (state) {
            case PLACED:
                state = State.PROCESSED;
                break;
            case PROCESSED:
                state = State.DELIVERED;
                break;
            default:
                throw new RuntimeException("Order already delivered!");
        }
    }
}
