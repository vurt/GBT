package gbt.dept.exception;

import com.chinacreator.c2.exception.C2RuntimeException;

public class TempDataCopyFailedExcetpion extends C2RuntimeException {

	private static final long serialVersionUID = -2648884298561339654L;

	public TempDataCopyFailedExcetpion(String message, Throwable cause) {
		super(message, cause);
	}

}
