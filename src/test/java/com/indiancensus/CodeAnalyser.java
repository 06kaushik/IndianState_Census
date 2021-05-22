package com.codeanalyser;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;
import com.codesanalyser.StateCodeAnalyser;

public class StateCodeAnalyser_Test {
	
	private static final String csvPath = "C:\\Users\\workspace eclipse\\Fellowship\\Day29_IndianStatesCensusAnalyzer\\CensusAnalyser\\Data\\codeFile.csv";
	
	@Test
	public void givenCodeCsvFile_returnCorrectRecords() throws IOException {
		StateCodeAnalyser stateCodeAnalyser = new StateCodeAnalyser();
		int recordsNumb = stateCodeAnalyser.LoadIndianCodeData(csvPath);
		assertEquals(640,recordsNumb);
		
	}

}