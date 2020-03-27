package com.pegasus.arithmeticoperation.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pegasus.arithmeticoperation.model.History;
import com.pegasus.arithmeticoperation.service.ExpressionService;

@Controller
public class OperationController {

	@Autowired
	private ExpressionService expressionService;
	
	@RequestMapping("/")
	public String home(){
		return "index.jsp";
	}

	@RequestMapping("/evaluate")
	public ModelAndView evaluate(@RequestParam("expression") String expression){
		System.out.println("Expression : " + expression);
		expressionService.saveExpression(expression);
		List<History> history = expressionService.getExpressionHistory();
		Map<String, List<History>> modelMap = new HashMap<>();
		modelMap.put("history", history);
		System.out.println(history.size());
		return new ModelAndView("index.jsp", modelMap) ;
	}
}
