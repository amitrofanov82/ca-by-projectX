package ca.by.project_x.conversion;

import org.springframework.core.convert.converter.Converter;

public class SampleConverter<S,D> implements Converter<S, D> {

	@Override
	public D convert(S source) {
		// TODO use it at as template for future converters. Delete it after first converter appear
		return null;
	}



}
