package com.gosee.ie.controller;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.internet.MimeMessage;
import java.util.HashMap;
import java.util.Map;

@Controller
public class EmailController {

    @Autowired
    private JavaMailSender sender; // you must enable properties file settings otherwise comment email-starter pkg in pom
    @Autowired
    private Configuration freemarkerConfig;

    @RequestMapping("/sendMail")
    @ResponseBody
    public ModelAndView sendMail() {
        try {
            sendEmail();
            ModelAndView modelAndView = new ModelAndView("success-email");
            modelAndView.addObject("emailResponse", "success");
            return modelAndView;
        } catch (Exception ex) {
            return new ModelAndView("error").addObject("emailResponse", "error");
        }
    }

    private void sendEmail() throws Exception {
        MimeMessage message = sender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(message);

        Map<String, Object> model = new HashMap();
        model.put("user", "qpt");

        // set loading location to src/main/resources
        // You may want to use a subfolder such as /templates here
        freemarkerConfig.setClassForTemplateLoading(this.getClass(), "/");

        Template t = freemarkerConfig.getTemplate("welcome.ftl");
        String text = FreeMarkerTemplateUtils.processTemplateIntoString(t, model);

        helper.setTo("set-your-recipient-email-here@gmail.com");
        helper.setText(text, true); // set to html
        helper.setSubject("Hi");
        sender.send(message);
    }
}
