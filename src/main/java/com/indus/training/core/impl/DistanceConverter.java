package com.indus.training.core.impl;

import com.indus.training.core.domain.DistanceConverterInput;
import com.indus.training.core.domain.DistanceConverterOutput;
import com.indus.training.core.svc.IDistanceConverter;

/**
 * The DistanceConverter class implements the {@link IDistanceConverter}
 * interface to provide functionality for converting distances between
 * kilometers and meters.
 */
public class DistanceConverter implements IDistanceConverter {

	/**
	 * Converts a distance from kilometers to meters.
	 *
	 * @param disConInpObj an instance of {@link DistanceConverterInput} containing
	 *                     the distance in kilometers
	 * @return an instance of {@link DistanceConverterOutput} containing the
	 *         original distance in kilometers and the converted distance in meters
	 */
	@Override
	public DistanceConverterOutput kmToMeterConverter(DistanceConverterInput disConInpObj) {

		DistanceConverterOutput disConOutObj = null;
		{
			double param1 = disConInpObj.param1;
			double result = disConInpObj.param1 * 1000;
			disConOutObj = new DistanceConverterOutput();
			disConOutObj.param1 = param1;
			disConOutObj.result = result;

		}
		return disConOutObj;
	}

	/**
	 * Converts a distance from meters to kilometers.
	 *
	 * @param disConInpObj an instance of {@link DistanceConverterInput} containing
	 *                     the distance in meters
	 * @return an instance of {@link DistanceConverterOutput} containing the
	 *         original distance in meters and the converted distance in kilometers
	 */
	@Override
	public DistanceConverterOutput meterToKmConverter(DistanceConverterInput disConInpObj) {

		DistanceConverterOutput disConOutObj = null;
		{
			double param1 = disConInpObj.param1;
			double result = disConInpObj.param1 / 1000;
			disConOutObj = new DistanceConverterOutput();
			disConOutObj.param1 = param1;
			disConOutObj.result = result;

		}
		return disConOutObj;
	}

}
