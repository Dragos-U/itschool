package org.session7utilityclasses.onlinepractice;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;

public class TimestampPractice {

    public static void main(String[] args) {
        Timestamp timestamp = Timestamp.from(Instant.now());
        System.out.println(timestamp);

        Timestamp timestampSystem = new Timestamp(System.currentTimeMillis());
        System.out.println(timestampSystem);

        System.out.println(convertTimestampToLocalDateTime(timestamp));
    }

    public static LocalDateTime convertTimestampToLocalDateTime(Timestamp timestamp) {
        return timestamp.toLocalDateTime();
    }
}