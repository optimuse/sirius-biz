/*
 * Made with all the love in the world
 * by scireum in Remshalden, Germany
 *
 * Copyright by scireum GmbH
 * http://www.scireum.de - info@scireum.de
 */

package sirius.biz.protocol;

import sirius.db.mixing.Column;
import sirius.db.mixing.Entity;
import sirius.db.mixing.annotations.Length;
import sirius.db.mixing.annotations.Lob;
import sirius.db.mixing.annotations.NullAllowed;
import sirius.kernel.di.std.Framework;

import java.time.LocalDateTime;

/**
 * Stores a copy of a mail sent by the system.
 */

@Framework(Protocols.FRAMEWORK_PROTOCOLS)
public class MailLogEntry extends Entity {

    public static final Column TOD = Column.named("tod");
    private LocalDateTime tod = LocalDateTime.now();

    public static final Column SUCCESS = Column.named("success");
    private boolean success = true;

    public static final Column MESSAGE_ID = Column.named("messageId");
    @Length(128)
    private String messageId;

    public static final Column SENDER = Column.named("sender");
    @Length(255)
    private String sender;

    public static final Column SENDER_NAME = Column.named("senderName");
    @Length(255)
    private String senderName;

    public static final Column RECEIVER = Column.named("receiver");
    @Length(255)
    private String receiver;

    public static final Column RECEIVER_NAME = Column.named("receiverName");
    @Length(255)
    @NullAllowed
    private String receiverName;

    public static final Column SUBJECT = Column.named("subject");
    @Length(1024)
    private String subject;

    public static final Column TEXT = Column.named("text");
    @Lob
    @NullAllowed
    private String text;

    public static final Column HTML = Column.named("html");
    @Lob
    @NullAllowed
    private String html;

    public static final Column MAIL_EXTENSION = Column.named("mailExtension");
    @Length(255)
    @NullAllowed
    private String mailExtension;

    public static final Column NODE = Column.named("node");
    @Length(255)
    private String node;

    public LocalDateTime getTod() {
        return tod;
    }

    public void setTod(LocalDateTime tod) {
        this.tod = tod;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMailExtension() {
        return mailExtension;
    }

    public void setMailExtension(String mailExtension) {
        this.mailExtension = mailExtension;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }
}
