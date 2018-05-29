package org.pino.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: Pino
 * @Description: 发送邮箱的工具类
 * @Date: 下午4:21 18-5-29
 * @Modified:
 */
@Component
public class MailUtil {

    /**
     * Spring发送邮件的核心接口
     */
    @Autowired
    private MailSender mailSender;

    /**
     * Sping简单邮件对象
     */
    @Autowired
    private SimpleMailMessage simpleMailMessage;


    /**
     * 单发
     *
     * @param recipient 收件人
     * @param subject   主题
     * @param content   内容
     */
    public void send(String recipient, String subject, String content) {
        simpleMailMessage.setTo(recipient);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(content);
        mailSender.send(simpleMailMessage);
    }

    /**
     * 群发
     *
     * @param recipients 收件人
     * @param subject    主题
     * @param content    内容
     */
    public void send(List<String> recipients, String subject, String content) {
        simpleMailMessage.setTo(recipients.toArray(new String[recipients.size()]));
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(content);
        mailSender.send(simpleMailMessage);
    }
}
