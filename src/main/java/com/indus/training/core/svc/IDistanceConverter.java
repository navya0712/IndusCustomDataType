package com.indus.training.core.svc;

import com.indus.training.core.domain.DistanceConverterInput;
import com.indus.training.core.domain.DistanceConverterOutput;

/**
 * The IDistanceConverter interface defines the contract for converting
 * distances between kilometers and meters.
 */
public interface IDistanceConverter {

	/**
	 * Converts a distance from kilometers to meters.
	 *
	 * @param disConInpObj an instance of {@link DistanceConverterInput} containing
	 *                     the distance in kilometers to be converted
	 * @return an instance of {@link DistanceConverterOutput} containing the
	 *         converted distance in meters
	 */
	public DistanceConverterOutput kmToMeterConverter(DistanceConverterInput disConInpObj);

	/**
	 * Converts a distance from meters to kilometers.
	 *
	 * @param disConInpObj an instance of {@link DistanceConverterInput} containing
	 *                     the distance in meters to be converted
	 * @return an instance of {@link DistanceConverterOutput} containing the
	 *         converted distance in kilometers
	 */
	public DistanceConverterOutput meterToKmConverter(DistanceConverterInput disConInpObj);
}
