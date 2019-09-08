package com.gosee.ie.controller;

import org.springframework.stereotype.Controller;

@Controller
public class EmailController {

/*    @Autowired
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
    }*/
}
