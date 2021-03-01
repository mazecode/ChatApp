package com.mazecode.pojos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Class ChatMessage
 *
 * @author Diego Feliú <dfeliu@siga98.net> @DFELIU
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ChatMessage {
	private MessageType type;
	private String content;
	private String sender;

	public enum MessageType {
		CHAT,
		JOIN,
		LEAVE
	}
}
