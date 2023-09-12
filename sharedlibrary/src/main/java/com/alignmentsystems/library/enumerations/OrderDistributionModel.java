package com.alignmentsystems.library.enumerations;
/******************************************************************************
 * 
 *	Author			:	John Greenan 
 *	Contact			:	sales@alignment-systems.com
 *	Date            :	8th September 2023
 *	Copyright       :	Alignment Systems Ltd 2023
 *	Project			:	Alignment Matching Toy
 *	Artefact		:	OrderDistributionModel
 *	Description		:
 *****************************************************************************/

/**
 * @author <a href="mailto:sales@alignment-systems.com">John Greenan</a>
 *
 */
public enum OrderDistributionModel {
	CONCURRENTLINKEDQUEUE("concurrentlinkedqueue")	,
	KAFKA("kafka");
		
		public final String distributionModel;
		OrderDistributionModel(String distributionModel){
			this.distributionModel = distributionModel;
		}
	}