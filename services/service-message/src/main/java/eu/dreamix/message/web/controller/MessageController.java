package eu.dreamix.message.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import eu.dreamix.message.web.model.Message;
import eu.dreamix.message.web.service.MessageService;

@RestController
@RequestMapping(value = "/message")
public class MessageController {

	@Value("${app.global.message}")
	private String globalMessage;

	@Value("${app.local.message}")
	private String localMessage;

	@Autowired
	private MessageService messageService;

	@RequestMapping(value = "/simpleMessage", method = RequestMethod.GET)
	public Message getMessage() {
		return messageService.getSimpleMessage(localMessage, globalMessage);
	}
}
