package com.comtrade.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;

public interface GeneralDomen extends Serializable{

	String getTableName();

	String getCollumnName();

	String getValues();

	void setValuesINSERT(PreparedStatement preparedStatement);

}
