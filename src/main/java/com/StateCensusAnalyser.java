package com.censusanalyser;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class StateCensusAnalyser {
	public static int LoadIndiaCensusData(String csvPath) throws IOException   {
		
		Reader reader;
			reader = Files.newBufferedReader(Paths.get(csvPath));
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		CsvToBean <IndiaCensusCSV> csvToBean = new CsvToBeanBuilder(reader)
                                      .withType(IndiaCensusCSV.class)
                                      .withIgnoreLeadingWhiteSpace(true)
                                      .build();
		Iterator<IndiaCensusCSV> censusCSVIterator = csvToBean.iterator();;
		int entries = 0;
		while(censusCSVIterator.hasNext()) {
			entries++;
			IndiaCensusCSV censusData = censusCSVIterator.next();
		}
		return entries;	
	}
	
	public static void main(String[] args) throws IOException {
		String csvPath = "C:\\Users\\Varsha Manwal\\Desktop\\BridgeLabz\\Fellowship\\Day29_IndianStatesCensusAnalyzer\\CensusAnalyser\\Data\\censusFile.csv";
		LoadIndiaCensusData(csvPath);
	}
}