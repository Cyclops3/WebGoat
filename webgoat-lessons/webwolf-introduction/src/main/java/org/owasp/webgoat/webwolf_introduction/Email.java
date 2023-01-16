package org.owasp.webgoat.webwolf_introduction;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

Returns {@code this}.
@Builder
@Data
public class Email implements Serializable {

    private String contents;
    private String sender;
    private String title;
    private String recipient;
}