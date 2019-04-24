package prototype;

import java.text.MessageFormat;

public class MailUtil {
    public static void sendMail(Mail mail) {
        String outputContent = "向{0}同学发送邮件，邮件地址：{1}，邮件内容：{2}，发送成功";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail){
        System.out.println("存储原始邮件");
    }
}
