package com.AllenProjects.NotesAppJavaSpringboot.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sayHelloController {
	
	@RequestMapping("hello")
	@ResponseBody
	public String sayHello() {
		return "Hello How are you doing?";
	}
	
	@RequestMapping("hello-html")
	@ResponseBody
	public String sayHellohtml() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> MyFirst HTML Page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("First Springboot project with HTML");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}

	@RequestMapping("hello-jsp")
	public String sayHelloJsp() {
		return "hello";
	}
}
