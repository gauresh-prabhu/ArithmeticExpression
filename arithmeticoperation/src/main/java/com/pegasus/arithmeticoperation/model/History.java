package com.pegasus.arithmeticoperation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="expression_history")
public class History {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int expressionId;
	
	@Column
	private String expression;
	
	@Column
	private String result;
	
	@Column
	private String error;

	public int getExpressionId() {
		return expressionId;
	}

	public void setExpressionId(int expressionId) {
		this.expressionId = expressionId;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
