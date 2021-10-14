package impl.tew.business;

import com.tew.business.ErrorFactory;
import com.tew.presentation.BGError;

public class SimpleErrorFactory implements ErrorFactory {

	@Override
	public BGError createBGError() {
		// TODO Auto-generated method stub
		return new BGError();
	}

}
