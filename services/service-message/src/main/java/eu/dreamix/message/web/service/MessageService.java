package eu.dreamix.message.web.service;

import org.springframework.stereotype.Service;

import eu.dreamix.message.web.model.Message;

@Service
public class MessageService {

	public Message getSimpleMessage(String localMessage, String globalMessage) {

		Message response = new Message();
		response.setGlobalMessage(globalMessage);
		response.setLocalMessage(localMessage);

		return response;
	}

}
