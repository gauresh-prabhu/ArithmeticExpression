package com.pegasus.arithmeticoperation.service;

import java.util.List;

import com.pegasus.arithmeticoperation.model.History;

public interface ExpressionService {

	public boolean saveExpression(String expression);
	
	public List<History> getExpressionHistory();
}
