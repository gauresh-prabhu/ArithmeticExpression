package com.pegasus.arithmeticoperation.serviceimpl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pegasus.arithmeticoperation.model.History;
import com.pegasus.arithmeticoperation.repository.HistoryRepository;
import com.pegasus.arithmeticoperation.service.ExpressionService;
import com.udojava.evalex.Expression;

@Component
public class ExpressionServiceImpl implements ExpressionService {

	@Autowired
	private HistoryRepository repository;
	
	@Override
	public boolean saveExpression(String expression) {
		boolean successFlag = true;
		History history = new History();
		history.setExpression(expression);
		
		try {
			Expression expre = new Expression(expression);
			expre.setPrecision(2);
			BigDecimal result = expre.eval();
			history.setResult(result.toString());
		}catch(Exception ex) {
			successFlag = false;
			history.setError(ex.getMessage());
		}
		
		repository.save(history);
		return successFlag;
	}

	@Override
	public List<History> getExpressionHistory() {
		return repository.findAll();
	}

}
