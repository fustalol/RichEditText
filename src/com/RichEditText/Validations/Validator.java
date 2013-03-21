package com.RichEditText.Validations;


import android.widget.EditText;

/**
 * Validator abstract class. To be used with RichEditText
 * 
 */
public abstract class Validator{

	protected String	errorMessage;


	public Validator(String _customErrorMessage){

		errorMessage = _customErrorMessage;
	}


	/**
	 * Should check if the EditText is valid.
	 * 
	 * @param et
	 *        the edittext under evaluation
	 * @return true if the edittext is valid, false otherwise
	 */
	public abstract boolean isValid(EditText et);


	public boolean hasErrorMessage(){

		return errorMessage != null;
	}


	public String getErrorMessage(){

		return errorMessage;
	}
}
