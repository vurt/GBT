package gbt.dept.exception;

import com.chinacreator.c2.exception.C2RuntimeException;

public class TempDataNotExsitExcetpion extends C2RuntimeException {

	private static final long serialVersionUID = -7899126493393663481L;

	public TempDataNotExsitExcetpion(int tempid) {
		super("单位["+tempid+"]的临时数据不存在");
	}

}
